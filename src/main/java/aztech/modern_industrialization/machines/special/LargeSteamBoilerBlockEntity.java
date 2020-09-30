package aztech.modern_industrialization.machines.special;

import alexiil.mc.lib.attributes.fluid.volume.FluidKey;
import alexiil.mc.lib.attributes.fluid.volume.FluidKeys;
import aztech.modern_industrialization.api.FluidFuelRegistry;
import aztech.modern_industrialization.inventory.ConfigurableFluidStack;
import aztech.modern_industrialization.inventory.ConfigurableItemStack;
import aztech.modern_industrialization.machines.MIMachines;
import aztech.modern_industrialization.machines.impl.MachineFactory;
import aztech.modern_industrialization.machines.impl.multiblock.MultiblockMachineBlockEntity;
import aztech.modern_industrialization.machines.impl.multiblock.MultiblockShape;
import net.fabricmc.fabric.impl.content.registry.FuelRegistryImpl;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;

public class LargeSteamBoilerBlockEntity extends MultiblockMachineBlockEntity {
    private static final int EU_PRODUCTION = 256;

    public LargeSteamBoilerBlockEntity(MachineFactory factory, MultiblockShape shape) {
        super(factory, shape);

        maxEfficiencyTicks = 10000;
        efficiencyTicks = 0;
        hatchCasing = MIMachines.ELECTRIC_BLAST_FURNACE.machineModel;
    }

    @Override
    public void tick() {
        if(world.isClient) return;

        if(shapeCheckTicks == 0) {
            rebuildShape();
            shapeCheckTicks = 20;
        }
        --shapeCheckTicks;

        boolean wasActive = isActive;

        this.isActive = false;
        if(ready) {
            // Item fuels
            if (usedEnergy == 0) {
                for (ConfigurableItemStack stack : getItemInputStacks()) {
                    ItemStack fuel = stack.getStack();
                    if (fuel.getCount() > 0) {
                        Integer fuelTime = FuelRegistryImpl.INSTANCE.get(fuel.getItem());
                        if (fuelTime != null && fuelTime > 0) {
                            recipeEnergy = fuelTime / 8;
                            usedEnergy = recipeEnergy;
                            fuel.decrement(1);
                            break;
                        }
                    }
                }
            }
            // Fluid fuels
            if(usedEnergy == 0) {
                for(ConfigurableFluidStack stack : getFluidInputStacks()) {
                    FluidKey fluid = stack.getFluid();
                    int burnTicks = FluidFuelRegistry.getBurnTicks(fluid);
                    if(burnTicks > 0) {
                        int mbEu = FluidFuelRegistry.getBurnTicks(fluid) * 32 * 2;
                        int necessaryAmount = Math.max(1, EU_PRODUCTION / mbEu);
                        if(stack.getAmount() >= necessaryAmount) {
                            recipeEnergy = mbEu * necessaryAmount / EU_PRODUCTION;
                            usedEnergy = recipeEnergy;
                            stack.decrement(necessaryAmount);
                            break;
                        }
                    }
                }
            }

            if (usedEnergy > 0) {
                isActive = true;
                --usedEnergy;
            }
        }

        if(isActive) {
            efficiencyTicks = Math.min(efficiencyTicks+1, maxEfficiencyTicks);
        } else {
            efficiencyTicks = Math.max(efficiencyTicks-1, 0);
        }

        if(ready) {
            if (efficiencyTicks > 1000) {
                int steamProduction = EU_PRODUCTION * efficiencyTicks / maxEfficiencyTicks;
                boolean waterAvailable = false;
                // Check if there is some water available
                for (ConfigurableFluidStack fluidStack : getFluidInputStacks()) {
                    if (fluidStack.getFluid() == FluidKeys.WATER && fluidStack.getAmount() > 0) {
                        waterAvailable = true;
                        break;
                    }
                }
                if (waterAvailable) {
                    boolean producedSteam = false;
                    // Try to output some steam
                    for (ConfigurableFluidStack fluidStack : getFluidOutputStacks()) {
                        if (fluidStack.isFluidValid(STEAM_KEY)) {
                            int ins = Math.min(steamProduction, fluidStack.getRemainingSpace());
                            if (ins > 0) {
                                fluidStack.setFluid(STEAM_KEY);
                                fluidStack.increment(ins);
                                producedSteam = true;
                                steamProduction -= ins;
                            }
                        }
                    }

                    if (producedSteam) {
                        for (ConfigurableFluidStack fluidStack : getFluidInputStacks()) {
                            if (fluidStack.getFluid() == FluidKeys.WATER && fluidStack.getAmount() > 0) {
                                fluidStack.decrement(1);
                            }
                        }
                    }
                }
            }
        }

        if(isActive != wasActive) {
            sync();
        }
        markDirty();

        for(Direction direction : Direction.values()) {
            autoExtractFluids(world, pos, direction);
        }
    }

    @Override
    public boolean hasOutput() {
        return false;
    }
}

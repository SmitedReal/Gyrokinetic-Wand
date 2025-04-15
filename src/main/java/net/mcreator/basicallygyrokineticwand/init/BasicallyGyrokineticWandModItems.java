
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.basicallygyrokineticwand.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.basicallygyrokineticwand.item.LocationCoreItem;
import net.mcreator.basicallygyrokineticwand.item.GyrokineticWandItem;
import net.mcreator.basicallygyrokineticwand.BasicallyGyrokineticWandMod;

public class BasicallyGyrokineticWandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BasicallyGyrokineticWandMod.MODID);
	public static final RegistryObject<Item> GYROKINETIC_WAND = REGISTRY.register("gyrokinetic_wand", () -> new GyrokineticWandItem());
	public static final RegistryObject<Item> LOCATION_CORE = REGISTRY.register("location_core", () -> new LocationCoreItem());
	// Start of user code block custom items
	// End of user code block custom items
}

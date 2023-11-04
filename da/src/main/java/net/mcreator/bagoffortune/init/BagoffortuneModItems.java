
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bagoffortune.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bagoffortune.item.PouchoffortuneItem;
import net.mcreator.bagoffortune.BagoffortuneMod;

public class BagoffortuneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BagoffortuneMod.MODID);
	public static final RegistryObject<Item> POUCHOFFORTUNE = REGISTRY.register("pouchoffortune", () -> new PouchoffortuneItem());
}

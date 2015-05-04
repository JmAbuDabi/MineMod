package mods.uncraftingmod;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.uncraftingmod.core.CreativeTabUncraftingMod;
import mods.uncraftingmod.core.EnchantingFlask;
import net.minecraft.item.Item;

public class ModItems {
	public static Item enchantingFlask;

	public static final void init() {
		enchantingFlask = new EnchantingFlask(11000);			
		GameRegistry.registerItem(enchantingFlask, "enchantingFlask");
	}
}

package mods.uncraftingmod.core;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class EnchantingFlask extends Item {

	public EnchantingFlask(int id) {
		super(id);
		this.setUnlocalizedName("enchantingFlask");
		this.setCreativeTab(CreativeTabUncraftingMod.tabUncraftingMod);	
	}
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("uncraftingmod:enchantingFlask");
	}
}

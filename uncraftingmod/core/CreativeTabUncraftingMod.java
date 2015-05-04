package mods.uncraftingmod.core;
import mods.uncraftingmod.UncraftingModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import buildcraft.BuildCraftCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class CreativeTabUncraftingMod extends CreativeTabs {
	public static final CreativeTabs tabUncraftingMod = new CreativeTabUncraftingMod("uncraftingMod");
	public CreativeTabUncraftingMod(String label) {
		super(label);
	}

	@Override
    public ItemStack getIconItemStack() {
		return new ItemStack(UncraftingModCore.unCraftingTable);
	}
	
	@Override
    public String getTranslatedTabLabel() {
		return "UncraftingMod";
	}
}

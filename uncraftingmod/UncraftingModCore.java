package mods.uncraftingmod;

import mods.uncraftingmod.core.CreativeTabUncraftingMod;
import mods.uncraftingmod.core.EnchantingFlask;
import mods.uncraftingmod.core.UncraftingTable;
import mods.uncraftingmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = UncraftingModCore.MODID, name = UncraftingModCore.NAME, version = UncraftingModCore.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class UncraftingModCore {
	
	public static final String MODID = "UnCraftingMod";
	public static final String NAME = "UnCrafting Mod";
	public static final String VERSION = "0.0.1";
	
	@SidedProxy(clientSide = "mods.uncraftingmod.proxy.ClientProxy", serverSide = "mods.uncraftingmod.proxy.ServerProxy")
	public static CommonProxy proxy;

	public static Block unCraftingTable;

	@Instance(UncraftingModCore.NAME)
	public static UncraftingModCore instance;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		this.proxy.preInit(event);
	}

	@Init
	public void load(FMLInitializationEvent event) {
		this.proxy.init(event);
		loadRecipes();
		/*
		 * Blocks
		 */
		unCraftingTable = new UncraftingTable(3031)
				.setUnlocalizedName("UncraftingTable");
		unCraftingTable
				.setCreativeTab(CreativeTabUncraftingMod.tabUncraftingMod);		
		/*
		 * Register
		 */
		GameRegistry.registerBlock(unCraftingTable);
		/*
		 * Name of Blocks
		 */
		LanguageRegistry.addName(unCraftingTable, EnumChatFormatting.AQUA
				+ "Uncrafting Table");
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
	public void loadRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.enchantingFlask, 1), new Object[] {
			"###", "   ", "   ", Character.valueOf('#'), Item.expBottle});
		GameRegistry.addSmelting(Block.blockGold.blockID,
			new ItemStack(Item.pickaxeGold, 3), 1.0F);
	}
}
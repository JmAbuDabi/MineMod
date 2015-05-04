package mods.jmabudabi.morePistons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=ModInfo.MODID, name=ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod (clientSideRequired = true, serverSideRequired = false)
public class MorePistons
{
	public static Block superPortal;	
	public static Block testBlock;
	public static Block doublePiston;
	public static Block triplePiston;
	
	@Instance (ModInfo.NAME)
	public static MorePistons instance;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		/*
		 * Blocks 
		 */
		superPortal = new SuperPortal(2020).setUnlocalizedName("superPortal");
		testBlock = new TestBlock(2021).setUnlocalizedName("testBlock");
		doublePiston = new BlockPistonBase(3002,false).setUnlocalizedName("doublePiston");
		triplePiston = new BlockMorePistonBase(3003, false).setUnlocalizedName("triplePiston");
		/*
		 * Register 
		 */
		GameRegistry.registerBlock(superPortal);
		GameRegistry.registerBlock(testBlock);
		GameRegistry.registerBlock(doublePiston);
		GameRegistry.registerBlock(triplePiston);
		/*
		 * Name of Blocks
		 */
		LanguageRegistry.addName(superPortal, EnumChatFormatting.AQUA + "Super Portal");
		LanguageRegistry.addName(testBlock, EnumChatFormatting.DARK_RED + "Test Block");
		LanguageRegistry.addName(doublePiston, EnumChatFormatting.AQUA + "Double Piston");
		LanguageRegistry.addName(triplePiston, EnumChatFormatting.AQUA + "Triple Piston");
	}
}	
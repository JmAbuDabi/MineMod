package mods.uncraftingmod.proxy;

import mods.uncraftingmod.ModItems;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
    public void preInit(FMLPreInitializationEvent e)
    {    	
    	ModItems.init();
    }

    public void init(FMLInitializationEvent e)
    {
    }

    public void postInit(FMLPostInitializationEvent e)
    {    
    }
}

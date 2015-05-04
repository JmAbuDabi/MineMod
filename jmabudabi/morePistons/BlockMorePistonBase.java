package mods.jmabudabi.morePistons;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockMorePistonBase extends Block {	
	private final boolean isSticky;
	private final int size;
	private Icon innerTopIcon;
	private Icon bottomIcon;
	private Icon topIcon;
	
	public BlockMorePistonBase(int id, boolean sticky)
	{
		super(id, Material.piston);
		this.isSticky = sticky;
		this.size = 1;
		InitBlockMorePistonBaseFunc(id, sticky, size);
	}
	public BlockMorePistonBase(int id, boolean sticky, int size)
	{
		super(id, Material.portal);
		this.isSticky = sticky;
		this.size = size;
		InitBlockMorePistonBaseFunc(id, sticky, size);		
	}
	private void InitBlockMorePistonBaseFunc(int id, boolean sticky, int size)
	{	
		this.setStepSound(soundStoneFootstep);
		this.setHardness(0.5F);
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}
	
}

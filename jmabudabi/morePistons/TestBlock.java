package mods.jmabudabi.morePistons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class TestBlock extends Block
{	
	public TestBlock(int par1)
	{
		super(par1, Material.iron);
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setHardness(2.0F);
		this.setResistance(7.0F);
		this.setStepSound(soundMetalFootstep);
		this.setLightValue(0.2F);
	}
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("jmabudabi/morePistons:testBlock");		
	}	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {		
        par1World.setBlock(par2+1, par3, par4, Block.blockDiamond.blockID);
        return true;
    }
}
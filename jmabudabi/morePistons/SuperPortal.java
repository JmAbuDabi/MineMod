package mods.jmabudabi.morePistons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class SuperPortal extends Block
{	
	public SuperPortal(int par1)
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
		this.blockIcon = par1IconRegister.registerIcon("jmabudabi/morePistons:superPortal");		
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;		
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {		
		par1World.setBlock(par2-1, par3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2, par3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+1, par3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+2, par3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2-1, par3+1, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+2, par3+1, par4, Block.obsidian.blockID);
		par1World.setBlock(par2-1, par3+2, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+2, par3+2, par4, Block.obsidian.blockID);
		par1World.setBlock(par2-1, par3+3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+2, par3+3, par4, Block.obsidian.blockID);
		par1World.setBlock(par2-1, par3+4, par4, Block.obsidian.blockID);
		par1World.setBlock(par2, par3+4, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+1, par3+4, par4, Block.obsidian.blockID);
		par1World.setBlock(par2+2, par3+4, par4, Block.obsidian.blockID);		
		par1World.setBlock(par2, par3+1, par4, Block.fire.blockID);
        return true;
    }
}
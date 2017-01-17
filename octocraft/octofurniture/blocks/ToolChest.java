package octogeek.octocraft.octofurniture.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import octogeek.octocraft.OctoCraft;
import octogeek.octocraft.octofurniture.OctoFurniture;
import octogeek.octocraft.octofurniture.gui.GuiHandlerToolChest;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;

public class ToolChest extends BlockContainer{

	public ToolChest() {
		super(Material.ROCK);
		setCreativeTab(OctoFurniture.CREATIVE_TABFURNITURES);
	}
	
	
	public static void preInit(){

	}

	@Override
  	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityToolChest();
	}
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}	
	@Override	// open on the server side only
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) return true;
		System.out.println("OCTO: Open ToolChest inventory");
		//playerIn.worldObj.playSound(null, pos, ClientProxy.cantinasong, SoundCategory.BLOCKS, 1.0F, 1.0F);
		playerIn.openGui(OctoCraft.instance, GuiHandlerToolChest.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}	
	
	@Override // the block is smaller than a full cube, specify dimensions here
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(1/16.0F, 0, 1/16.0F, 15/16.0F, 8/16.0F, 15/16.0F);
	}
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()	{
		return BlockRenderLayer.SOLID;
	}	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

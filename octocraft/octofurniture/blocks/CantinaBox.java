package octogeek.octocraft.octofurniture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import octogeek.octocraft.octofurniture.OctoFurniture;

public class CantinaBox extends Block {
	public CantinaBox() {
		super(Material.IRON);
		setCreativeTab(OctoFurniture.CREATIVE_TABCHEAT);
		setHardness(1.0F);
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		// Uses the gui handler registered to your mod to open the gui for the given gui id
		// open on the server side only  (not sure why you shouldn't open client side too... vanilla doesn't, so we better not either)
		if (worldIn.isRemote) return true;
		playerIn.worldObj.playSound(null, pos, OctoFurniture.cantinasong, SoundCategory.BLOCKS, 1.0F, 1.0F);
		return true;
	}
}

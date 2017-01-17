package octogeek.octocraft.octofurniture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import octogeek.octocraft.octofurniture.OctoFurniture;
import octogeek.octocraft.octofurniture.tileentity.TileEntityVerticalTeleporter;

public class VerticalTeleporter extends Block implements ITileEntityProvider {

	public VerticalTeleporter() {
		super(Material.IRON);
		setHardness(0.8F);
		setLightOpacity(10);
		setCreativeTab(OctoFurniture.CREATIVE_TABCHEAT);
		setLightLevel(2);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityVerticalTeleporter();
	}
	@Override
	public boolean isFullCube(IBlockState state) {
	
		return true;
	}

}

package octogeek.octocraft.octofurniture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octofurniture.OctoFurniture;

public class LightCeillings extends Block{

	public LightCeillings(float hardness,float LightLevel) {
		super(Material.REDSTONE_LIGHT);

		setCreativeTab(OctoFurniture.CREATIVE_TABFURNITURES);
		setLightLevel(LightLevel);
		setHardness(hardness);
		setSoundType(SoundType.METAL);
		setLightOpacity(1);
	}

	public static void init() {
		addLight("Lava_Ceiling", 0.8F, 1.0F, 0, 0, 0, 16,16,16);
		addLight("Glow_Ceiling",0.5F,1.0F, 1, 0, 1, 15,4,15);
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}	
	@Override 
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override // the block is smaller than a full cube, specify dimensions here
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {		
		return new AxisAlignedBB(1/16.0F, 12/16.0F, 1/16.0F, 15/16.0F, 16/16.0F, 15/16.0F);
	}
	
	private static void addLight(String name,float hardness,float LightLevel,int sizeXmin,int sizeXmax,int sizeYmin,int sizeYmax,int sizeZmin,int sizeZmax){
		final Block lightceiling;
		lightceiling = Register.registerBlock(new LightCeillings(hardness, LightLevel),name, OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
	}
	
}


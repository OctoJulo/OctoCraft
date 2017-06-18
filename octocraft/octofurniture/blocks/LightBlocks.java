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
import octogeek.octocraft.octofurniture.OctoFurniture;


import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.OctoMineralogy.RockType;
import octogeek.octocraft.octomineralogy.blocks.Rock;

public class LightBlocks extends Block{

	public LightBlocks(float hardness,float LightLevel) {
		super(Material.REDSTONE_LIGHT);
		setCreativeTab(OctoFurniture.CREATIVE_TABFURNITURES);
		setLightLevel(LightLevel);
		setHardness(hardness);
		setSoundType(SoundType.METAL);
		setLightOpacity(1);
	}

	public static void init() {
		addLight("Block_LavaLamp", 0.8F, 1.0F);
		addLight("Block_GlowLight",0.5F, 1.0F);
		addLight("Block_SteampunkLamp",0.5F, 1.0F);
		addLight("Block_LaboLamp",0.5F, 1.0F);
		addLight("Block_IndustryLight",0.5F, 1.0F);

	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}	
	@Override 
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	private static void addLight(String name,float hardness,float LightLevel){
		final Block light;
		light = Register.registerBlock(new LightBlocks(hardness, LightLevel),name, OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
	}
}

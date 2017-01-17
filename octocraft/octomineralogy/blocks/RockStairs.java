package octogeek.octocraft.octomineralogy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import octogeek.octocraft.octomineralogy.OctoMineralogy;

public class RockStairs extends net.minecraft.block.BlockStairs{

	public RockStairs(Block materialBlock,float hardness,float blastResistance,int toolHardnessLevel,SoundType sound,CreativeTabs tab){
		super(materialBlock.getDefaultState());
		this.setHardness((float)hardness); // dirt is 0.5, grass is 0.6, stone is 1.5,iron ore is 3, obsidian is 50
		this.setResistance((float)blastResistance); // dirt is 0, iron ore is 5, stone is 10, obsidian is 2000
		this.setSoundType(SoundType.STONE); // sound for stone
		this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(tab);
		this.useNeighborBrightness = true;
	}
}

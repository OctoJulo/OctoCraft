package octogeek.octocraft.octomineralogy.blocks;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
//import octogeek.octocore.OctoCraft;
//import octogeek.octocore.Reference;
//import octogeek.octomineralogy.OctoMineralogy;
//import octogeek.octomineralogy.items.Dust;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.items.Dust;

public class Ore extends Block {
	
	private final Item dropItem;
	private final int dropAdduct;
	private final int dropRange;
	public Ore(String name, Item oreDrop, int minNumberDropped, int maxNumberDropped, int toolHardnessLevel) {
		super(Material.ROCK);
		this.setUnlocalizedName(OctoReference.MOD_ID +"_"+ name);
		this.setHardness((float)3); // dirt is 0.5, grass is 0.6, stone is 1.5,iron ore is 3, obsidian is 50
		this.setResistance((float)5); // dirt is 0, iron ore is 5, stone is 10, obsidian is 2000
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(OctoMineralogy.CREATIVE_TABORES);
		dropItem = oreDrop;
		dropAdduct = minNumberDropped;
		dropRange = (maxNumberDropped - minNumberDropped) + 1;
	}
	@Override 
	public Item getItemDropped(IBlockState bs, Random prng, int p_149650_3_) {
        return dropItem;
    }
	@Override 
	public int quantityDropped(Random prng) {
        return prng.nextInt(dropRange)+dropAdduct;
    }
//	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
//	config.load();
	public static void init(Configuration config) {
		 
		addOre("sulfur_ore","oreSulfur",Dust.sulphurPowder,1,8,0,
				config.getInt("sulphur_ore.minY", "ores", 16, 1, 255, "Minimum ore spawn height"),
				config.getInt("sulphur_ore.maxY", "ores", 64, 1, 255, "Maximum ore spawn height"),
				config.getFloat("sulphur_ore.frequency", "ores", 1, 0, 63, "Number of ore deposits per chunk"),
				config.getInt("sulphur_ore.quantity", "ores", 16, 0, 63, "Size of ore deposit"));
		//OreDictionary.registerOre("oreSulphur",sulfurore); 
	
	}
    public static void addOre(String oreName, String oreDictionaryName, Item oreDropItem, int numMin, int numMax, int pickLevel,int minY, int maxY, float spawnFrequency, int spawnQuantity) {
    	String oreBlockName = OctoReference.MOD_ID+"."+oreName;
    	Block oreBlock = new Ore(oreName,oreDropItem,numMin,numMax,pickLevel).setUnlocalizedName(oreBlockName);
    	Register.registerBlock(oreBlock, oreName,OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
    	OreDictionary.registerOre(oreDictionaryName, oreBlock);
    	//GameRegistry.registerWorldGenerator(new OreSpawner(oreBlock,minY,maxY,spawnFrequency,spawnQuantity, (oreWeightCount * 25214903917L)+11L), oreWeightCount++);
    	//return oreBlock;
    }
	
	
}
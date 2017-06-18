package octogeek.octocraft.octomineralogy.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.OctoMineralogy.RockType;
import octogeek.octocraft.octomineralogy.OctoMineralogy.SandType;
import octogeek.octocraft.octomineralogy.items.CrushedRock;

public class Sand  extends BlockFalling {
    public static final List<Block> aggregateSands = new ArrayList<Block>();		
    public static final List<Block> oceanSands = new ArrayList<Block>();
    public static final List<Block> desertSands = new ArrayList<Block>();

	private String sandname;
	public Sand(String name,float hardness,float blastResistance,int toolHardnessLevel,SoundType sound,CreativeTabs tab) {
		super(Material.SAND);
//		this.isStoneEquivalent = isStoneEquivalent;
		this.setHardness((float)hardness); // dirt is 0.5, grass is 0.6, stone is 1.5,iron ore is 3, obsidian is 50
		this.setResistance((float)blastResistance); // dirt is 0, iron ore is 5, stone is 10, obsidian is 2000
		this.setSoundType(sound); // sound for stone
		//this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(tab);
		this.sandname = name;
	}
	public static void init() {
		System.out.println("Octo registerBlock SAND");
		addSandType(SandType.ANY,"quick",1.5,10,0,Items.FLINT,1,5);
		
		addSandType(SandType.OCEAN,"white",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.DESERT,"grey",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.AGGREGATE,"black",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.OCEAN,"pink",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.DESERT,"red",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.OCEAN,"green",1.5,10,0,Items.FLINT,1,5);
		addSandType(SandType.DESERT,"brun",1.5,10,0,Items.FLINT,1,5);		
//		blond
//		AUTRE!
	}
	private static void addSandType(SandType type, String name,double hardness,double blastResistance,int toolHardnessLevel,Item AggregateDrop,int minNumberDropped, int maxNumberDropped){
		
		final Block sand;
		sand = Register.registerBlock(new Sand(name,(float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.SAND,OctoMineralogy.CREATIVE_TABROCKS),name + "_sand",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);

		switch(type){
			case AGGREGATE:
				aggregateSands.add(sand);
				break;
		
			case DESERT:
				desertSands.add(sand);
			break;
	
			case OCEAN:
				oceanSands.add(sand);			
				break;
		
			case ANY:
				aggregateSands.add(sand);
				desertSands.add(sand);
				oceanSands.add(sand);
				break;

		}
		OreDictionary.registerOre("sand",sand);

	}	
	
	
	
	
	
	
	
	
	
}

package octogeek.octocraft.octofurniture.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octofurniture.OctoFurniture;
import octogeek.octocraft.octofurniture.OctoFurniture.ConstructionStyle;
import octogeek.octocraft.octofurniture.OctoFurniture.UtilityType;

public class ConstructionBlock extends Block {
    public static final List<Block> constructionLabo = new ArrayList<Block>();		 // Block sedimentaire
	private String name;
	public ConstructionBlock(String name,float hardness,float blastResistance,int toolHardnessLevel,SoundType sound,CreativeTabs tab) {
		super(Material.IRON);
		this.setHardness((float)hardness); // dirt is 0.5, grass is 0.6, stone is 1.5,iron ore is 3, obsidian is 50
		this.setResistance((float)blastResistance); // dirt is 0, iron ore is 5, stone is 10, obsidian is 2000
		this.setSoundType(sound); // sound for stone
		this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(tab);
		this.name = name;
	}
	public static void init() {
		System.out.println("Octo registerBlock Construction");
		
		
//		public enum ConstructionType {
//			LABORATORY, WAREHOUSE, INDUSTRIAL, RUSTY,HOME,ANY
//			}
//		public enum UtilityType {
//			GROUND,WALL,ROOF,TECHNICAL,OTHER
//			
//		}	
		//ground
		addConstructionBlock (ConstructionStyle.ANY,UtilityType.GROUND,"ground",1.5,10,0);
		
		addConstructionBlock (ConstructionStyle.ANY,UtilityType.WALL,"wall",1.5,10,0);
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallgate",1.5,10,0);
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallvent",1.5,10,0);
		addConstructionBlock (ConstructionStyle.ANY,UtilityType.WALL,"wallbop",1.5,10,0);
		addConstructionBlock (ConstructionStyle.ANY,UtilityType.WALL,"walltop",1.5,10,0);
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallsignleft",1.5,10,0);		
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallsignright",1.5,10,0);			
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallsigntop",1.5,10,0);			
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallsignbot",1.5,10,0);			
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.WALL,"wallsignstop",1.5,10,0);			
		
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.OTHER,"conduite",1.5,10,0);
		addConstructionBlock (ConstructionStyle.LABORATORY,UtilityType.OTHER,"corner",1.5,10,0);		
				
		
	}
	private static void addConstructionBlock(ConstructionStyle style, UtilityType Utype, String name,double hardness,double blastResistance,int toolHardnessLevel){
		final Block constructionlab,constructionhome,constructionrusty,constructionwarehouse,constructionindus, rockStairs, rockSlab;
		
		//construction = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"labo_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
		//rockStairs = Register.registerBlock(new RockStairs(rock, (float)hardness, (float)blastResistance, toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_rockstairs",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		//rockSlab = Register.registerBlock(new RockSlab((float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_rockslab",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		
		switch(style){
//		case IGNEOUS:
//			igneousStones.add(rock);
//			break;
		case LABORATORY:
			constructionlab = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"labo_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			
			break;
		case INDUSTRIAL:
			//igneousIntrusiveStones.add(rock);
			constructionindus = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"indus_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			
			break;
		case WAREHOUSE:
		//	metamorphicStones.add(rock);
			
			break;
		case HOME:
	//		metamorphicStones.add(rock);
			constructionhome = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"home_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			
			break;
		case RUSTY:
			constructionrusty = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"rusty_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			
			break;

		case ANY:
			constructionlab = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"labo_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			constructionhome = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"home_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			constructionindus = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"indus_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
			
			constructionrusty = Register.registerBlock(new ConstructionBlock(name, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.ANVIL,OctoFurniture.CREATIVE_TABCONSTRUCTION),"rusty_"+name,OctoFurniture.FurnitureBlockRegistry,OctoFurniture.FurnitureItemRegistry);
						
			
		//	sedimentaryStones.add(rock);
		//	metamorphicStones.add(rock);
		//	igneousExtrusiveStones.add(rock);
		//	igneousIntrusiveStones.add(rock);
			
			//igneousStones.add(rock);
			break;
	}	
		
		
		
	}	
}


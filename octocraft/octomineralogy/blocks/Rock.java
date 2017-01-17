package octogeek.octocraft.octomineralogy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.register.Register;
//import octogeek.octocore.OctoCraft;
//import octogeek.octomineralogy.OctoMineralogy;
//import octogeek.octomineralogy.OctoMineralogy.RockType;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.OctoMineralogy.RockType;
import octogeek.octocraft.octomineralogy.items.CrushedRock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rock extends Block {
    public static final List<Block> sedimentaryStones = new ArrayList<Block>();		 // Block sedimentaire
    public static final List<Block> metamorphicStones = new ArrayList<Block>(); // Block metamorphique
    public static final List<Block> igneousExtrusiveStones = new ArrayList<Block>(); // Block volcanique
    public static final List<Block> igneousIntrusiveStones = new ArrayList<Block>(); // Block volcanique
	private String rockname;
	public Rock(String name,boolean isStoneEquivalent,float hardness,float blastResistance,int toolHardnessLevel,SoundType sound,CreativeTabs tab) {
		super(Material.ROCK);
		this.isStoneEquivalent = isStoneEquivalent;
		this.setHardness((float)hardness); // dirt is 0.5, grass is 0.6, stone is 1.5,iron ore is 3, obsidian is 50
		this.setResistance((float)blastResistance); // dirt is 0, iron ore is 5, stone is 10, obsidian is 2000
		this.setSoundType(sound); // sound for stone
		this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(tab);
		this.rockname = name;
	}

//	private String rockname(String name) {
//		return name; 
//		
//	}

	public final boolean isStoneEquivalent;
	
	@Override 
	public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, com.google.common.base.Predicate<IBlockState> target) { 
		return isStoneEquivalent; 
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		if(OctoMineralogy.DROP_COBBLESTONE){
			return Arrays.asList(new ItemStack(Blocks.COBBLESTONE));
		} else {
			return Arrays.asList(new ItemStack(Item.getItemFromBlock(OctoMineralogy.mineralogyBlockRegistry.get(this.rockname+"_aggregate"))));
			//return Arrays.asList(new ItemStack(Item.getItemFromBlock(this)));
		}
	}
	
	public static void init() {
		System.out.println("Octo registerBlock ROCK");
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"andesite",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"basalt",5,100,2,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"dacite",5,100,2,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"rhyolite",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"pumice",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSEXTRUSIVE,"trachyte",5,100,2,Items.FLINT,1,5);
				
		addStoneType(RockType.IGNEOUSINTRUSIVE,"diorite",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSINTRUSIVE,"gabbro",5,100,2,Items.FLINT,1,5);	
		addStoneType(RockType.IGNEOUSINTRUSIVE,"granite",3,15,1,Items.FLINT,1,5);
		addStoneType(RockType.IGNEOUSINTRUSIVE,"pegmatite",1.5,10,0,Items.FLINT,1,5);		
		
		addStoneType(RockType.SEDIMENTARY,"shale",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"conglomerate",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"dolomite",3,15,1,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"limestone",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"argillite",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"chalk",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"chert",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.SEDIMENTARY,"claystone",1.5,10,0,Items.FLINT,1,5);
		
		addStoneType(RockType.METAMORPHIC,"slate",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"schist",3,15,1,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"gneiss",3,15,1,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"phyllite",1.5,10,0,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"amphibolite",3,15,1,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"marble",5,100,2,Items.FLINT,1,5);
		addStoneType(RockType.METAMORPHIC,"quartzite",5,100,2,Items.FLINT,1,5);

	}
	private static void addStoneType(RockType type, String name,double hardness,double blastResistance,int toolHardnessLevel,Item AggregateDrop,int minNumberDropped, int maxNumberDropped){
		final Block rock, rockStairs, rockSlab;
		final Block brick, brickStairs, brickSlab;
		final Block polished, polishedStairs, polishedSlab;
		final Block aggregate;
		final Item CrushedRock;
//		final Block smoothBrick, smoothBrickStairs, smoothBrickSlab;
		rock = Register.registerBlock(new Rock(name,true, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABROCKS),name+"_rock",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		brick= Register.registerBlock(new Rock(name,true, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_brick",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);		
		polished= Register.registerBlock(new Rock(name,true, (float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_polished",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		 										//RockStairs(Block materialBlock,float hardness,float blastResistance,int toolHardnessLevel,SoundType sound){
		rockStairs = Register.registerBlock(new RockStairs(rock, (float)hardness, (float)blastResistance, toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_rockstairs",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		brickStairs = Register.registerBlock(new RockStairs(brick, (float)hardness, (float)blastResistance, toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_brickstairs",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		polishedStairs = Register.registerBlock(new RockStairs(polished, (float)hardness, (float)blastResistance, toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_polishedstairs",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		
		rockSlab = Register.registerBlock(new RockSlab((float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_rockslab",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		brickSlab = Register.registerBlock(new RockSlab((float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_brickslab",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		polishedSlab = Register.registerBlock(new RockSlab((float)hardness,(float)blastResistance,toolHardnessLevel, SoundType.STONE,OctoMineralogy.CREATIVE_TABCONSTRUCTION),name+"_polishedslab",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		
		aggregate = Register.registerBlock(new Aggregate(name,AggregateDrop,minNumberDropped, maxNumberDropped),name + "_aggregate",OctoMineralogy.mineralogyBlockRegistry,OctoMineralogy.mineralogyItemRegistry);
		CrushedRock = Register.registerItem(new CrushedRock(name, OctoMineralogy.CREATIVE_TABOREPARTS), name+"_crushed", OctoMineralogy.mineralogyItemRegistry);
		
		switch(type){
//			case IGNEOUS:
//				igneousStones.add(rock);
//				break;
			case IGNEOUSEXTRUSIVE:
				igneousExtrusiveStones.add(rock);
				
				break;
			case IGNEOUSINTRUSIVE:
				igneousIntrusiveStones.add(rock);
				
				break;
			case METAMORPHIC:
				metamorphicStones.add(rock);
				
				break;
			case SEDIMENTARY:
				sedimentaryStones.add(rock);
				
				break;
			case ANY:
				sedimentaryStones.add(rock);
				metamorphicStones.add(rock);
				igneousExtrusiveStones.add(rock);
				igneousIntrusiveStones.add(rock);
				
				//igneousStones.add(rock);
				break;
		}
		OreDictionary.registerOre("stone",rock);
		
		//GameRegistry.addSmelting(rock, new ItemStack(Blocks.STONE),0.1F);
	}
}
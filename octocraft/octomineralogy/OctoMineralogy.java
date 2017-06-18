package octogeek.octocraft.octomineralogy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import octogeek.octocraft.octocore.PatchHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octomineralogy.blocks.Aggregate;
import octogeek.octocraft.octomineralogy.blocks.Ore;
import octogeek.octocraft.octomineralogy.blocks.Rock;
import octogeek.octocraft.octomineralogy.blocks.Sand;
import octogeek.octocraft.octomineralogy.items.CrushedRock;
import octogeek.octocraft.octomineralogy.items.Dust;
import octogeek.octocraft.octomineralogy.tabs.TabMConstruction;
import octogeek.octocraft.octomineralogy.tabs.TabOreParts;
import octogeek.octocraft.octomineralogy.tabs.TabOres;
import octogeek.octocraft.octomineralogy.tabs.TabRocks;
import octogeek.octocraft.octomineralogy.worldgen.StoneReplacer;


public class OctoMineralogy {

	public enum RockType {
		SEDIMENTARY, METAMORPHIC, IGNEOUSINTRUSIVE, IGNEOUSEXTRUSIVE,ANY
		}
	public enum SandType {
		DESERT, OCEAN, AGGREGATE, ANY
		}
	
	public static boolean DROP_COBBLESTONE = false;
//
//	public static boolean SMELTABLE_GRAVEL = true;
	public static final Map<String,Block> mineralogyBlockRegistry = new HashMap<String,Block>();
	public static final Map<String,Item> mineralogyItemRegistry = new HashMap<String,Item>();	

	public static final CreativeTabs CREATIVE_TABROCKS = new TabRocks();
	public static final CreativeTabs CREATIVE_TABORES = new TabOres();
	public static final CreativeTabs CREATIVE_TABOREPARTS = new TabOreParts();
	public static final CreativeTabs CREATIVE_TABCONSTRUCTION = new TabMConstruction();

	private List<String> igneousWhitelist = new ArrayList<String>();
	private List<String> igneousBlacklist = new ArrayList<String>();
	private List<String> sedimentaryWhitelist = new ArrayList<String>();
	private List<String> sedimentaryBlacklist  = new ArrayList<String>();
	private List<String> metamorphicWhitelist = new ArrayList<String>();
	private List<String> metamorphicBlacklist  = new ArrayList<String>();

    public static double ROCK_LAYER_NOISE = 32; 
    /** size of mineral biomes */
    public static int GEOME_SIZE = 100; 
    /** thickness of rock layers */
    public static int GEOM_LAYER_THICKNESS = 8;
	public static boolean PATCH_UPDATE = true;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event, Configuration config) {
		System.out.println("OctoMineralogy:preInit");
		Rock.init();
		Sand.init();
		//Aggregate.init();
		Ore.init(config);
		Dust.init();
		//CrushedRock.init();
    }
	
    @EventHandler
    public static void init(FMLInitializationEvent event) {	
		PatchHandler.getInstance().init(PATCH_UPDATE);
    	GameRegistry.registerWorldGenerator(new StoneReplacer(), 10);

    	
    	
    	if(event.getSide().isClient()){
    		Register.registerItemRenders(mineralogyItemRegistry);
    	}
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }    

}

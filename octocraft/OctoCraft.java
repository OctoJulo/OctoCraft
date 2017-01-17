package octogeek.octocraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import octogeek.octocraft.octocore.Config;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.proxy.CommonProxy;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octoworldgen.WorldTypeTuto;;

@Mod(modid = OctoReference.MOD_ID, name = OctoReference.NAME, version = OctoReference.VERSION, acceptedMinecraftVersions = OctoReference.ACCPEPTED_VERSIONS)//, guiFactory = Reference.GUI_FACTORY)
public class OctoCraft {

	public static WorldTypeTuto worldTypeTuto;

	

	public static void BiomeListTuto()

	{

		

	}
	
	
	
	
	
	@Instance
	public static OctoCraft instance;

	@SidedProxy(clientSide = OctoReference.CLIENT_PROXY_CLASS, serverSide = OctoReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	//public static final CreativeTabs CREATIVE_TAB = new ElevatorModTab();
	//public static final CreativeTabs CREATIVE_TABBLOCKS = new TabBlocks();	
	//public static final CreativeTabs CREATIVE_TABMISC = new TabMisc();
	//public static final CreativeTabs CREATIVE_TABCHEAT = new TabCheat();
	
//	public static SoundEvent teleport;
//	public static SoundEvent cantinasong;
	
	private static final String[] colorSuffixes = {"black","red","green","brown","blue","purple","cyan",
			"silver","gray","pink","lime","yellow","light_blue","magenta","orange","white"};
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	
		System.out.println("Octo preInit:");
//		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
//    	config.load();
		//Configuration conf = Config.init(event.getSuggestedConfigurationFile());
		
//		OctoMineralogy.preInit(event,conf);
//		OctoIndustry.preInit();
		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {		
//		OctoMineralogy.init(event);
//		OctoIndustry.init(event);
		proxy.init(event);
		BiomeListTuto.BiomeList();

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		BiomeListTuto.worldTypeTuto = new WorldTypeTuto(null);
	}

}

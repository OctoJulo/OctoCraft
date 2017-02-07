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
import octogeek.octocraft.octoworldgen.WorldTypeTuto;
import octogeek.octocraft.octoworldgen.biome.BiomeListTuto;;

@Mod(modid = OctoReference.MOD_ID, name = OctoReference.NAME, version = OctoReference.VERSION, acceptedMinecraftVersions = OctoReference.ACCPEPTED_VERSIONS)//, guiFactory = Reference.GUI_FACTORY)
public class OctoCraft {

	@Instance
	public static OctoCraft instance;

	@SidedProxy(clientSide = OctoReference.CLIENT_PROXY_CLASS, serverSide = OctoReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	private static final String[] colorSuffixes = {"black","red","green","brown","blue","purple","cyan",
			"silver","gray","pink","lime","yellow","light_blue","magenta","orange","white"};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	
		System.out.println("Octo preInit:");
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {		
		System.out.println("Octo Init:");
		proxy.init(event);
		//test
		//BiomeListTuto.BiomeList();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Octo postInit:");
		//test
		//BiomeListTuto.worldTypeTuto = new WorldTypeTuto(null);
	}

}

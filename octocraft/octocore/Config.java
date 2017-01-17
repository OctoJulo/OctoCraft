package octogeek.octocraft.octocore;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraftforge.common.config.Configuration;

public class Config {
	public static Configuration config;
	public static boolean enablemineralogy;
	public static boolean enableindustry;
	public static boolean enabledeco;
	public static boolean enable;
	public static int geologicsize = 100;
    public static int geologicthickness = 8;
    public static double geologicnoise = 32; 
	private static List<String> igneousExtrusiveWhitelist = new ArrayList<String>();
	private static List<String> igneousExtrusiveBlacklist = new ArrayList<String>();
	private static List<String> igneousIntrusiveWhitelist = new ArrayList<String>();
	private static List<String> igneousIntrusiveBlacklist = new ArrayList<String>();
	private static List<String> sedimentaryWhitelist = new ArrayList<String>();
	private static List<String> sedimentaryBlacklist  = new ArrayList<String>();
	private static List<String> metamorphicWhitelist = new ArrayList<String>();
	private static List<String> metamorphicBlacklist  = new ArrayList<String>();
	public static Configuration init(File file)
	{
		config = new Configuration(file);
		
		config.load();
		init();
		return config;
	}
	public static void init() 
	{
		enablemineralogy = config.getBoolean("EnableMineralogy", "Options", true, "Enable OctoCraft:mineralogy");
		enableindustry = config.getBoolean("EnableIndustry", "Options", true, "Enable OctoCraft:industry");
		enabledeco = config.getBoolean("Enabledeco", "Options", true, "Enable OctoCraft:Decoration");
		enable = config.getBoolean("Enable", "Options", true, "Enable OctoCraft:bullshit");
    	geologicsize = config.getInt("GEO_size", "world-gen", (Integer) geologicsize, 4, Short.MAX_VALUE, "Change la taille general pour la generation des biome geologique");
    	geologicthickness = config.getInt("GEO_tickness","world-gen", (Integer) geologicthickness,1,255, "Change l'epaisseur des couches de roche");
    	geologicnoise = config.getFloat("GEO_noise","world-gen", (float) geologicnoise,1.0f,(float)Short.MAX_VALUE, "Change l'epaisseur des couches de roche");
    	
    	
    	igneousExtrusiveBlacklist.addAll(asList(config.getString("igneousExtrusive_blacklist", "world-gen", "", "Ban blocks from spawning in rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	igneousIntrusiveBlacklist.addAll(asList(config.getString("igneousIntrusive_blacklist", "world-gen", "", "Ban blocks from spawning in rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	sedimentaryBlacklist.addAll(asList(config.getString("sedimentary_blacklist", "world-gen", "", "Ban blocks from spawning in rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	metamorphicBlacklist.addAll(asList(config.getString("metamorphic_blacklist", "world-gen", "", "Ban blocks from spawning in rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	
    	igneousExtrusiveWhitelist.addAll(asList(config.getString("igneousExtrusive_whitelist", "world-gen", "", "Adds blocks to rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	igneousIntrusiveWhitelist.addAll(asList(config.getString("igneousIntrusive_whitelist", "world-gen", "", "Adds blocks to rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	sedimentaryWhitelist.addAll(asList(config.getString("sedimentary_whitelist", "world-gen", "", "Adds blocks to rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));
    	metamorphicWhitelist.addAll(asList(config.getString("metamorphic_whitelist", "world-gen", "", "Adds blocks to rock layers (format is mod:block as a semicolin (;) delimited list)"),";"));


    	
    	
    	
    	config.save();
		
	}
    private static List<String> asList(String list, String delimiter){
    	String[] a = list.split(delimiter);
    	return Arrays.asList(a);
    }
	
	
}

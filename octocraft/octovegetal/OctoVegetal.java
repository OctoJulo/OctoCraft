package octogeek.octocraft.octovegetal;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import octogeek.octocraft.octofurniture.tabs.TabFurnitures;
import octogeek.octocraft.octovegetal.tabs.TabFoods;
import octogeek.octocraft.octovegetal.tabs.TabPlantations;
import octogeek.octocraft.octovegetal.tabs.TabTrees;

public class OctoVegetal {
	public static final CreativeTabs CREATIVE_TABTREES = new TabTrees();
	public static final CreativeTabs CREATIVE_TABFOODS = new TabFoods();
	public static final CreativeTabs CREATIVE_TABPLANTATIONS = new TabPlantations();	
	public static final Map<String,Block> VegetalBlockRegistry = new HashMap<String,Block>();
	public static final Map<String,Item> VegetalItemRegistry = new HashMap<String,Item>();	
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event, Configuration config) {
	
	
	}
	
	@EventHandler
    public static void init(FMLInitializationEvent event) {	
    }
	
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

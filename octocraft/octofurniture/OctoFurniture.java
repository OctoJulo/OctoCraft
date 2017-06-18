package octogeek.octocraft.octofurniture;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.OctoCraft;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.GuiHandlerRegistry;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octofurniture.blocks.CantinaBox;
import octogeek.octocraft.octofurniture.blocks.ConstructionBlock;
import octogeek.octocraft.octofurniture.blocks.LightBlocks;
import octogeek.octocraft.octofurniture.blocks.LightCeillings;
import octogeek.octocraft.octofurniture.blocks.ToolChest;

import octogeek.octocraft.octofurniture.blocks.VerticalTeleporter;
import octogeek.octocraft.octofurniture.gui.GuiHandlerToolChest;
import octogeek.octocraft.octofurniture.tabs.TabCheat;
import octogeek.octocraft.octofurniture.tabs.TabFConstruction;
import octogeek.octocraft.octofurniture.tabs.TabFurnitures;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;
import octogeek.octocraft.octofurniture.tileentity.TileEntityVerticalTeleporter;
import octogeek.octocraft.octoindustry.gui.GuiHandlerToolBox;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.blocks.Ore;
import octogeek.octocraft.octomineralogy.blocks.Rock;
import octogeek.octocraft.octomineralogy.items.Dust;
import octogeek.octocraft.octomineralogy.tabs.TabRocks;

public class OctoFurniture {
	public enum ConstructionStyle {
		LABORATORY, WAREHOUSE, INDUSTRIAL, RUSTY,HOME,ANY
		}
	public enum UtilityType {
		GROUND,WALL,ROOF,TECHNICAL,OTHER
		
	}
	public static Block CantinaBox;
	public static Block VerticalTeleporter;
	public static Block BlockToolChest;
	public static Block BlockVaultChest;
	public static ItemBlock ItemBlockToolChest; 
	public static SoundEvent cantinasong;
	public static SoundEvent teleport;
	
	public static final CreativeTabs CREATIVE_TABFURNITURES = new TabFurnitures();
	public static final CreativeTabs CREATIVE_TABCONSTRUCTION = new TabFConstruction();	
	public static final CreativeTabs CREATIVE_TABCHEAT = new TabCheat();	
	
	public static final Map<String,Block> FurnitureBlockRegistry = new HashMap<String,Block>();
	public static final Map<String,Item> FurnitureItemRegistry = new HashMap<String,Item>();	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event, Configuration config) {
		System.out.println("OctoFurniture:preInit");
		LightBlocks.init();
		LightCeillings.init();
		ConstructionBlock.init();
		CantinaBox = Register.registerBlock(new CantinaBox(),"CantinaBox", FurnitureBlockRegistry,FurnitureItemRegistry);
		cantinasong = Register.registerSound("cantinasong");	
		
		VerticalTeleporter = Register.registerBlock(new VerticalTeleporter(),"VerticalTeleporter", FurnitureBlockRegistry,FurnitureItemRegistry);
		teleport = Register.registerSound("teleport");

		BlockToolChest = Register.registerBlock(new ToolChest(),"ToolChest", FurnitureBlockRegistry,FurnitureItemRegistry);
		NetworkRegistry.INSTANCE.registerGuiHandler(OctoCraft.instance, GuiHandlerRegistry.getInstance());
		GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerToolChest(), GuiHandlerToolChest.getGuiID());
		GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerToolChest(), GuiHandlerToolBox.getGuiID());
    }

	@EventHandler
    public static void init(FMLInitializationEvent event) {	
		GameRegistry.registerTileEntity(TileEntityVerticalTeleporter.class, "VerticalTeleporter");
		GameRegistry.registerTileEntity(TileEntityToolChest.class, "ToolChest");

		if(event.getSide().isClient()){
    		Register.registerItemRenders(FurnitureItemRegistry);
  		
    	}
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    } 
	
}

package octogeek.octocraft.octoindustry;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;
import octogeek.octocraft.octoindustry.items.tools.Axe_Tools;
import octogeek.octocraft.octoindustry.items.tools.Pickaxe_Tools;
import octogeek.octocraft.octoindustry.items.tools.Tools;
import octogeek.octocraft.octoindustry.tabs.TabTools;
import octogeek.octocraft.octoindustry.tileentity.TileEntityToolBox;

public class OctoIndustry {

	public enum ToolMaterialType {
		PRIMITIVE, IRON, STEEL, ADVANCED, ULTIMATE, ANY
		}
	private static final float damageVsEntities = 2.0F;
	public static final Map<String,Block>IndustryBlockRegistry = new HashMap<String,Block>();
	public static final Map<String,Item> IndustryItemRegistry = new HashMap<String,Item>();	
	public static final CreativeTabs CREATIVE_TABTOOLS = new TabTools();
	//"NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability
	public static ToolMaterial PRIMITIVE = EnumHelper.addToolMaterial("PRIMITIVE", 1, 50, 1.0F, damageVsEntities, 10); 
	public static ToolMaterial IRON = EnumHelper.addToolMaterial("IRON", 2, 200, 4.0F, damageVsEntities, 10);
	public static ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 300, 6.0F, damageVsEntities, 10);
	public static ToolMaterial ADVANCED = EnumHelper.addToolMaterial("ADVANCED", 3, 2000, 10.0F, damageVsEntities, 20);
	public static ToolMaterial ULTIMATE = EnumHelper.addToolMaterial("ULTIMATE", 4, 5000, 12.0F, damageVsEntities, 30);
	
	@EventHandler
	public static void preInit() {
		System.out.println("OctoIndustry:preInit");
		Axe_Tools.init();
		Pickaxe_Tools.init();
		Tools.init();
	}	
    @EventHandler
    public static void init(FMLInitializationEvent event) {	
		GameRegistry.registerTileEntity(TileEntityToolBox.class, "ToolBox");
		//GameRegistry.registerTileEntity(TileEntityToolChest.class, "ToolChest");
    	if(event.getSide().isClient()){
    		Register.registerItemRenders(IndustryItemRegistry);
    	}
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {	
    }
//    private static void registerItemRenders(){
//		System.out.println("Octo itemRender technology:");
//		for(String name : IndustryItemRegistry.keySet()){
//			System.out.println(name);
//			Item i = OctoIndustry.IndustryItemRegistry.get(name);
//    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(OctoReference.MOD_ID+":"+name, "inventory"));
//    	}
//    }
//	public static Item registerItem(Item i, String name) {
//		GameRegistry.register(i.setRegistryName(OctoReference.MOD_ID,name));
//		IndustryItemRegistry.put(name,i);
//		i.setUnlocalizedName(OctoReference.MOD_ID+"."+name);
//		//if(!(i instanceof ItemBlock))FMLLog.info("%s: added %s=%s",MODID,i.getUnlocalizedName(),formatName(name));
//		return i;
//	}  
}

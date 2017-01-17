package octogeek.octocraft.octoindustry.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.OctoCraft;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.GuiHandlerRegistry;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octofurniture.blocks.ToolChest;
import octogeek.octocraft.octofurniture.gui.GuiHandlerToolChest;
import octogeek.octocraft.octoindustry.OctoIndustry;
import octogeek.octocraft.octoindustry.gui.GuiHandlerToolBox;

public class Tools extends Item {
	

	
	public static Item AdvancedWrench;
	public static Item Wrench;
	//public static Item Saw;
	public static Item Screwdriver;
	public static Item SonicScrewdriver;
	public static Item Hammer;
	
	public static Item ToolBox;
	//	Wrench
	public Tools(String itemName){
		super();
		this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(OctoIndustry.CREATIVE_TABTOOLS);
	}
//	public void CustomPickAxe(String itemName, ToolMaterial material){
//		super(material);
//		this.setUnlocalizedName(Reference.MOD_ID +"."+ itemName);
//		this.setCreativeTab(OctoIndustry.CREATIVE_TABTOOLS);
//	}
	public static void init(){
		Wrench = Register.registerItem(new Tools("wrench"), "wrench",OctoIndustry.IndustryItemRegistry);
		AdvancedWrench = Register.registerItem(new Tools("advancedwrench"), "advancedwrench",OctoIndustry.IndustryItemRegistry);
		Screwdriver = Register.registerItem(new Tools("screwdriver"),"screwdriver",OctoIndustry.IndustryItemRegistry);
		SonicScrewdriver = Register.registerItem(new Tools("sonicscrewdriver"),"sonicscrewdriver",OctoIndustry.IndustryItemRegistry);

		Hammer = Register.registerItem(new Tools("hammer"),"hammer",OctoIndustry.IndustryItemRegistry);
		ToolBox = Register.registerItem(new ToolBox("toolbox"),"toolbox",OctoIndustry.IndustryItemRegistry);
		
		
		
	//	BlockToolChest = Register.registerBlock(new ToolChest(),"ToolChest", FurnitureBlockRegistry,FurnitureItemRegistry);
		NetworkRegistry.INSTANCE.registerGuiHandler(OctoCraft.instance, GuiHandlerRegistry.getInstance());
		GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerToolBox(), GuiHandlerToolBox.getGuiID());
	}

}

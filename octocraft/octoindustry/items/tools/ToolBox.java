package octogeek.octocraft.octoindustry.items.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import octogeek.octocraft.OctoCraft;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octoindustry.OctoIndustry;
import octogeek.octocraft.octoindustry.gui.GuiHandlerToolBox;

public class ToolBox extends Item{


	
	public ToolBox(String itemName){
		super();
		this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(OctoIndustry.CREATIVE_TABTOOLS);
		this.maxStackSize = 1;
	}
	
	
//@Override
//public Item setContainerItem(Item containerItem) {
//	// TODO Auto-generated method stub		
//	System.out.println("OCTO: Open ToolBox inventory2");
//	return super.setContainerItem(containerItem);
//}
	
	
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		System.out.println("OCTO: Open ToolBox inventory");
		player.openGui(OctoCraft.instance, GuiHandlerToolBox.getGuiID(), world, (int) player.posX, (int) player.posY, (int) player.posZ);
		return stack;

	}
	
}

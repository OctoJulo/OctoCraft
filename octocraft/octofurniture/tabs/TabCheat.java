package octogeek.octocraft.octofurniture.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octofurniture.OctoFurniture;
import octogeek.octocraft.octomineralogy.OctoMineralogy;

public class TabCheat extends CreativeTabs {
	public TabCheat() {
		super("tabcheat");
		//this.setBackgroundImageName("octocheat.png");
		this.setBackgroundImageName(OctoReference.MOD_ID+"_logo.png");
	}

	@Override
	public Item getTabIconItem() {
		
		ItemStack iStack = new ItemStack(OctoFurniture.FurnitureBlockRegistry.get("VerticalTeleporter"));
	//	ItemStack iStack = new ItemStack(OctoFurniture.FurnitureItemRegistry.get("BlockCantina"));
		return iStack.getItem();
		
		
		//return ModItems.advancedwrench;

	}
}



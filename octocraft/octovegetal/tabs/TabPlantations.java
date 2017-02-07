package octogeek.octocraft.octovegetal.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octofurniture.OctoFurniture;

public class TabPlantations extends CreativeTabs{
	public TabPlantations() {
		super("Tabplantations");
	}

	@Override
	public Item getTabIconItem() {
		
	//	ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("sulfur_ore"));
		ItemStack iStack = new ItemStack(OctoFurniture.FurnitureItemRegistry.get("Block_LavaLamp"));
		return iStack.getItem();
		
		
		//return ModItems.advancedwrench;

	}

}

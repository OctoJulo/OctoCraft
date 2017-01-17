package octogeek.octocraft.octomineralogy.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import net.minecraft.item.ItemBlock;

public class TabOres extends CreativeTabs {
	public TabOres() {
		super("tabores");
	}

	@Override
	public Item getTabIconItem() {	
		ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("sulfur_ore"));
		return iStack.getItem();

	}
}

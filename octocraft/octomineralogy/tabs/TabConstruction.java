package octogeek.octocraft.octomineralogy.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octomineralogy.OctoMineralogy;

public class TabConstruction extends CreativeTabs {
	
	public TabConstruction() {
		super("tabconstruction");
	}

	@Override
	public Item getTabIconItem() {
		ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("basalt_brick"));
		return iStack.getItem();
	}
}


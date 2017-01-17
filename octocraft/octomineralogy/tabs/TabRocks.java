package octogeek.octocraft.octomineralogy.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octomineralogy.OctoMineralogy;


public class TabRocks extends CreativeTabs {
	public TabRocks() {
		super("tabrocks");
	}

	@Override
	public Item getTabIconItem() {
		ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("basalt_rock"));
		return iStack.getItem();
	}
}

package octogeek.octocraft.octomineralogy.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octomineralogy.OctoMineralogy;


public class TabRocks extends CreativeTabs {
	public TabRocks() {
		super("tabrocks");
		this.setBackgroundImageName(OctoReference.MOD_ID+"_Rock.png");
	
	}

	@Override
	public Item getTabIconItem() {
		ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("basalt_rock"));
		return iStack.getItem();
	}

	@Override
	public boolean hasSearchBar() {
		return getTabIndex() == this.getTabIndex();
	}
}
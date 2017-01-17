package octogeek.octocraft.octomineralogy.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octomineralogy.OctoMineralogy;

public class TabOreParts extends CreativeTabs {
	public TabOreParts() {
		super("taboreparts");
	}

	@Override
	public Item getTabIconItem() {
		
		ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("sulfur_dust"));
		return iStack.getItem();
		
		
		//return ModItems.advancedwrench;

	}
}

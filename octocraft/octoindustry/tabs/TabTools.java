package octogeek.octocraft.octoindustry.tabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octoindustry.items.tools.Tools;


public class TabTools extends CreativeTabs {
	public TabTools() {
		super("tabtools");
	}

	@Override
	public Item getTabIconItem() {
	//	ItemStack iStack = new ItemStack(ModBlocks.lavalamp);
		ItemStack iStack = new ItemStack(Tools.ToolBox);
		return iStack.getItem();
	}
}

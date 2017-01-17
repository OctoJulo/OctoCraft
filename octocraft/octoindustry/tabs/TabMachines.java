package octogeek.octocraft.octoindustry.tabs;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octoindustry.items.tools.Tools;
import net.minecraft.item.ItemBlock;

public class TabMachines extends CreativeTabs {
	public TabMachines() {
		super("tabmachines");
	}

	@Override
	public Item getTabIconItem() {
		ItemStack iStack = new ItemStack(Tools.ToolBox);
		//ItemStack iStack = new ItemStack(ModBlocks.lavalamp);
		return iStack.getItem();
		
		
		//return ModItems.advancedwrench;

	}
}



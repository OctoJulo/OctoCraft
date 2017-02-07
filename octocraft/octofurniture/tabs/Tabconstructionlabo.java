package octogeek.octocraft.octofurniture.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import octogeek.octocraft.octofurniture.OctoFurniture;

public class Tabconstructionlabo  extends CreativeTabs {


		public Tabconstructionlabo() {
			super("Tabconstructionlabo");
		}

		@Override
		public Item getTabIconItem() {
			
		//	ItemStack iStack = new ItemStack(OctoMineralogy.mineralogyItemRegistry.get("sulfur_ore"));
			ItemStack iStack = new ItemStack(OctoFurniture.FurnitureItemRegistry.get("Block_Labo_wall"));
			return iStack.getItem();
			
			
			//return ModItems.advancedwrench;

		}
}


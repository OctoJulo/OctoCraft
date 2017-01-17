package octogeek.octocraft.octomineralogy.items;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.OctoMineralogy.RockType;
import octogeek.octocraft.octomineralogy.blocks.Rock;

public class CrushedRock extends Item {

	public CrushedRock(String itemName,CreativeTabs tab){
		super();
		//this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(tab);
	}
}

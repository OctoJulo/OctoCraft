package octogeek.octocraft.octomineralogy.items;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octomineralogy.OctoMineralogy;


public class Dust extends Item {
	//public final static String itemName = "sulfur_dust";
	public static Item sulphurPowder;
	public Dust(String itemName){
		super();
		this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(OctoMineralogy.CREATIVE_TABOREPARTS);
	}
	
	
	
	public static void init() {
		
		sulphurPowder = Register.registerItem(new Dust("sulfur_dust"), "sulfur_dust",OctoMineralogy.mineralogyItemRegistry);
		OreDictionary.registerOre("dustSulfur", sulphurPowder);
//		OreDictionary.registerOre("sulfur", sulphurPowder);
//		OreDictionary.registerOre("sulphur", sulphurPowder);
//		OreDictionary.registerOre("dustSulphur", sulphurPowder);
		
	}
	
}

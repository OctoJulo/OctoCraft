package octogeek.octocraft.octoindustry.items.tools;

import net.minecraft.item.ItemAxe;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octoindustry.OctoIndustry;

public class Axe_Tools extends ItemAxe{
	
	public static ItemAxe primitive_axe;
	public static ItemAxe iron_axe;
	public static ItemAxe steel_axe;
	public static ItemAxe advanced_axe;
	public static ItemAxe steel_saw;
	public static ItemAxe advenced_saw;
	public static ItemAxe steel_chainsaw;
	public static ItemAxe advanced_chainsaw;
	
	public Axe_Tools(ToolMaterial material, String itemName, float damage, float speed) {
		super(material, damage, speed);
		this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(OctoIndustry.CREATIVE_TABTOOLS);
		//this.set
	}
	public static void init(){

		//primitive_axe = OctoIndustry.registerItem(new Axe_Tools(OctoIndustry.PRIMITIVE, "primitive_axe", OctoIndustry.PRIMITIVE.getDamageVsEntity(), OctoIndustry.PRIMITIVE.getHarvestLevel()), "primitive_axe");
		primitive_axe = (ItemAxe) Register.registerItem(new Axe_Tools(OctoIndustry.PRIMITIVE, "primitive_axe", OctoIndustry.PRIMITIVE.getDamageVsEntity(), OctoIndustry.PRIMITIVE.getHarvestLevel()), "primitive_axe",OctoIndustry.IndustryItemRegistry);
		steel_saw = (ItemAxe) Register.registerItem(new Axe_Tools(OctoIndustry.STEEL, "steel_saw", OctoIndustry.STEEL.getDamageVsEntity(), OctoIndustry.STEEL.getHarvestLevel()), "steel_saw",OctoIndustry.IndustryItemRegistry);
		advanced_chainsaw = (ItemAxe) Register.registerItem(new Axe_Tools(OctoIndustry.ADVANCED, "advanced_chainsaw", OctoIndustry.ADVANCED.getDamageVsEntity(), OctoIndustry.ADVANCED.getHarvestLevel()), "advanced_chainsaw",OctoIndustry.IndustryItemRegistry);
		advanced_axe = (ItemAxe) Register.registerItem(new Axe_Tools(OctoIndustry.ADVANCED, "advanced_axe", OctoIndustry.ADVANCED.getDamageVsEntity(), OctoIndustry.ADVANCED.getHarvestLevel()), "advanced_axe",OctoIndustry.IndustryItemRegistry);
		}
	
	
	
	
}

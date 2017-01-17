package octogeek.octocraft.octoindustry.items.tools;


import net.minecraft.item.ItemPickaxe;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octoindustry.OctoIndustry;
import net.minecraft.item.Item.ToolMaterial;

public class Pickaxe_Tools extends ItemPickaxe{
	
	public static ItemPickaxe primitive_pickaxe;
	public static ItemPickaxe iron_pickaxe;
	public static ItemPickaxe steel_pickaxe;
	public static ItemPickaxe advanced_pickaxe;
	public static ItemPickaxe steel_drill;
	public static ItemPickaxe advanced_drill;	
	public Pickaxe_Tools(ToolMaterial material, String itemName, float damage, float speed) {
		super(material);

		this.setUnlocalizedName(OctoReference.MOD_ID +"."+ itemName);
		this.setCreativeTab(OctoIndustry.CREATIVE_TABTOOLS);
	}
	
	public static void init(){

		//primitive_axe = OctoIndustry.registerItem(new Axe_Tools(OctoIndustry.PRIMITIVE, "primitive_axe", OctoIndustry.PRIMITIVE.getDamageVsEntity(), OctoIndustry.PRIMITIVE.getHarvestLevel()), "primitive_axe");
		primitive_pickaxe = (ItemPickaxe) Register.registerItem(new Pickaxe_Tools(OctoIndustry.PRIMITIVE, "primitive_pickaxe", OctoIndustry.PRIMITIVE.getDamageVsEntity(), OctoIndustry.PRIMITIVE.getHarvestLevel()), "primitive_pickaxe",OctoIndustry.IndustryItemRegistry);
		steel_pickaxe = (ItemPickaxe) Register.registerItem(new Pickaxe_Tools(OctoIndustry.STEEL, "steel_pickaxe", OctoIndustry.STEEL.getDamageVsEntity(), OctoIndustry.STEEL.getHarvestLevel()), "steel_pickaxe",OctoIndustry.IndustryItemRegistry);
		advanced_pickaxe = (ItemPickaxe) Register.registerItem(new Pickaxe_Tools(OctoIndustry.ADVANCED, "advanced_pickaxe", OctoIndustry.ADVANCED.getDamageVsEntity(), OctoIndustry.ADVANCED.getHarvestLevel()), "advanced_pickaxe",OctoIndustry.IndustryItemRegistry);
		}

}

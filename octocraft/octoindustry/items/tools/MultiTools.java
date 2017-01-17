package octogeek.octocraft.octoindustry.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octoindustry.OctoIndustry;


public class MultiTools extends ItemTool{

    private final String name;
    private final EnumRarity rarity;
    private final ItemStack repairItem;
    private String repairOredict;

    public MultiTools(float attack, float speed, ToolMaterial toolMat, String repairItem, String unlocalizedName, EnumRarity rarity, Set<Block> effectiveStuff){
        this(attack, speed, toolMat, (ItemStack)null, unlocalizedName, rarity, effectiveStuff);
        this.repairOredict = repairItem;
    }

    public MultiTools(float attack, float speed, ToolMaterial toolMat, ItemStack repairItem, String unlocalizedName, EnumRarity rarity, Set<Block> effectiveStuff){
        super(attack, speed, toolMat, effectiveStuff);

        this.repairItem = repairItem;
        this.name = unlocalizedName;
        this.rarity = rarity;

        this.register();
    }

	private void register(){
       // ItemUtil.registerItem(this, this.getBaseName(), this.shouldAddCreative());
    	Register.registerItem(getContainerItem(), this.getBaseName(), null);
        this.registerRendering();
    }

    protected String getBaseName(){
        return this.name;
    }

    public boolean shouldAddCreative(){
        return true;
    }

    protected void registerRendering(){
        //ActuallyAdditions.proxy.addRenderRegister(new ItemStack(this), this.getRegistryName(), "inventory");
    }


    @Override
    public EnumRarity getRarity(ItemStack stack){
        return this.rarity;
    }

//    @Override
//    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack stack){
//        if(StackUtil.isValid(this.repairItem)){
//            return ItemUtil.areItemsEqual(this.repairItem, stack, false);
//        }
//        else if(this.repairOredict != null){
//            int[] idsStack = OreDictionary.getOreIDs(stack);
//            for(int id : idsStack){
//                if(OreDictionary.getOreName(id).equals(this.repairOredict)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

}

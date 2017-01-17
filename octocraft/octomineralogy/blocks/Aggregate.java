package octogeek.octocraft.octomineralogy.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octomineralogy.OctoMineralogy;
import octogeek.octocraft.octomineralogy.OctoMineralogy.RockType;

public class Aggregate extends BlockFalling {
	private final Item dropItem;
	private final int dropAdduct;
	private final int dropRange;
	private String rockSubType;
	public Aggregate(String rockSubtype,Item AggregateDrop, int minNumberDropped, int maxNumberDropped) {
		super(Material.SAND);
		//this.setUnlocalizedName(OctoReference.MOD_ID +"_"+ name);
		this.setHardness((float)1); // dirt 0.5, stone 1.5,ironore  3, obsidian 50
		this.setResistance((float)0); // dirt 0, iron ore 5, stone 10, obsidian  2000
		this.setSoundType(SoundType.SAND);
		//this.setHarvestLevel("pickaxe", toolHardnessLevel);
		this.setCreativeTab(OctoMineralogy.CREATIVE_TABROCKS);
		this.rockSubType = rockSubtype;
		dropItem = AggregateDrop;
		dropAdduct = minNumberDropped;
		dropRange = (maxNumberDropped - minNumberDropped) + 1;
	}
	@Override 
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        
		final Item itemDropped; 
		if (fortune > 3)
        {
            fortune = 3;
        }
		itemDropped = rand.nextInt(4 - fortune * 3) == 0 ? dropItem : OctoMineralogy.mineralogyItemRegistry.get(this.rockSubType+"_crushed");
		return itemDropped;
       // return rand.nextInt(10 - fortune * 3) == 0 ? dropItem : Item.getItemFromBlock(this);
    }
	@Override 
	public int quantityDropped(Random prng) {
        return prng.nextInt(dropRange)+dropAdduct;
    }

}
	
	

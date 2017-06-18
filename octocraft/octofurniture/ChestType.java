package octogeek.octocraft.octofurniture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import octogeek.octocraft.octofurniture.container.ValidatingSlot;

import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;

public enum ChestType implements IStringSerializable{


	IRON(54, 9, true, "Iron Chest", "ironchest.png", 0, Arrays.asList("ingotIron", "ingotRefinedIron"), "mmmmPmmmm", "mGmG3GmGm");
//	COPPER(54, 9, true, "copper Chest", "ironchest.png", 0, Arrays.asList("ingotIron", "ingotRefinedIron"), TileEntityCommonChest.class, "mmmmPmmmm", "mGmG3GmGm"),
//	TOOL(18,9,true,"Tool Chest","toolchest.png",1, Arrays.asList("ingotIron", "ingotRefinedIron"), TileEntityCommonChest.class, "mmmmPmmmm", "mGmG3GmGm" );
	
	
	public int size;
    private int rowLength;
    public String friendlyName;
    private boolean tieredChest;
    private String modelTexture;
    private int textureRow;
//    public Class<? extends TileEntityCommonChest> clazz;
    private String[] recipes;
    private ArrayList<String> matList;
	ChestType(int size, int rowLength, boolean tieredChest, String friendlyName, String modelTexture, int textureRow, List<String> mats, String... recipes)
    {
        this(size, rowLength, tieredChest, friendlyName, modelTexture, textureRow, mats, (Item)null, recipes);
    }
    ChestType(int size, int rowLength, boolean tieredChest, String friendlyName, String modelTexture, int textureRow, List<String> mats, Item itemFilter, String... recipes)
    {
        this.size = size;
        this.rowLength = rowLength;
        this.tieredChest = tieredChest;
        this.friendlyName = friendlyName;
        this.modelTexture = modelTexture;
        this.textureRow = textureRow;
  
        this.recipes = recipes;
        this.matList = new ArrayList<String>();
        matList.addAll(mats);
    }
//	public ChestType(int size2, int rowLength2, boolean tieredChest2, String friendlyName2, String modelTexture2,
//			int textureRow2, List<String> mats, Class<? extends TileEntityCommonChest> clazz2, Item item,
//			String[] recipes2) {
//	}

	@Override
	public String getName() {
		
		return name().toLowerCase();
	}
    public String getModelTexture()
    {
        return modelTexture;
    }

    public int getTextureRow()
    {
        return textureRow;
    }
    public int getRowCount()
    {
        return size / rowLength;
    }
    public int getRowLength()
    {
        return rowLength;
    }
    public static int validateMeta(int i)
    {
        if (i < values().length && values()[i].size > 0)
        {
            return i;
        }
        else
        {
            return 0;
        }
    }

    public boolean isValidForCreativeMode()
    {
        return validateMeta(ordinal()) == ordinal();
    }
    public Slot makeSlot(IInventory chestInventory, int index, int x, int y)
    {
        return new ValidatingSlot(chestInventory, index, x, y, this);
    }

    public boolean acceptsStack(ItemStack itemstack)
    {
        return itemstack == null;
    }
    
    
    
    
    
    
    
    
    
}

package octogeek.octocraft.octocore.register;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octofurniture.OctoFurniture;

public class Register {

    public static Block registerBlock(Block b, String name, Map<String, Block> blockregistry, Map<String, Item> itemregistry) {
		GameRegistry.register(b.setRegistryName(name));
		b.setUnlocalizedName(OctoReference.MOD_ID+"."+name);
		registerItem(new ItemBlock(b), name, itemregistry);
		//ItemRegister.registerItem(new ItemBlock(b),name);
		blockregistry.put(name,b);
		//FMLLog.info("%s: added %s=%s",MODID,b.getUnlocalizedName(),formatName(name));
		return b;
	}
	
	public static Item registerItem(Item i, String name,Map<String, Item> itemregistry) {
		GameRegistry.register(i.setRegistryName(OctoReference.MOD_ID,name));
		itemregistry.put(name,i);
		i.setUnlocalizedName(OctoReference.MOD_ID+"."+name);
		//if(!(i instanceof ItemBlock))FMLLog.info("%s: added %s=%s",MODID,i.getUnlocalizedName(),formatName(name));
		return i;
	}
	
	public static SoundEvent registerSound(String soundName) {
		ResourceLocation loc = new ResourceLocation(OctoReference.MOD_ID ,soundName);
		SoundEvent e = new SoundEvent(loc);
		return GameRegistry.register(e, loc);
		
	}
	
    public static void registerItemRenders(Map<String, Item> itemregistry){
		System.out.println("OctoMineralogy:itemRender");
		for(String name : itemregistry.keySet()){
//			System.out.println(name);
			Item i = itemregistry.get(name);
    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(OctoReference.MOD_ID+":"+name, "inventory"));
    	}
    }
//	public static void registerTileEntity() {
//		
//		GameRegistry.registerTileEntity(c, regName);
//	}
	
	
	
	
}

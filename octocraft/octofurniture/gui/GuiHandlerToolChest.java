package octogeek.octocraft.octofurniture.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import octogeek.octocraft.octofurniture.container.ContainerToolChest;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;
import octogeek.octocraft.octoindustry.items.tools.ToolBox;

public class GuiHandlerToolChest implements IGuiHandler {
	private static final int GUIID = 30;
	public static int getGuiID() {return GUIID;}

	// Gets the server side element for the given gui id- this should return a container
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID != getGuiID()) {
			System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
		}

		BlockPos xyz = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(xyz);
//		if (tileEntity instanceof TileEntityToolChest) {
//			TileEntityToolChest tileEntityInventoryToolChest = (TileEntityToolChest) tileEntity;
//			return new ContainerToolChest(player.inventory, tileEntityInventoryToolChest);
//		}
		switch (ID){
		
		case 0:
			// The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
			// Condition to check if the player has the right item in hand
//			if (player.getHeldItem(null) == null || !(player.getHeldItem().getItem() instanceof ToolBox)) return null;
//			return new ContainerToolBox(player.inventory, new InventoryToolBox(player.getHeldItem(null), 54));
		case 30: 
			if (tileEntity instanceof TileEntityToolChest) {
				System.out.println("OCTO - CLIENTGUICHEST");
				TileEntityToolChest tileEntityInventoryToolChest = (TileEntityToolChest) tileEntity;
				return new ContainerToolChest(player.inventory, tileEntityInventoryToolChest);
			}	
		
		
		}
		
		
		
		
		
		return null;
	}

	// Gets the client side element for the given gui id- this should return a gui
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID != getGuiID()) {
			System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
		}

		BlockPos xyz = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(xyz);
		if (tileEntity instanceof TileEntityToolChest) {
			TileEntityToolChest tileEntityInventoryToolChest = (TileEntityToolChest) tileEntity;
			return new GuiToolChest(player.inventory, tileEntityInventoryToolChest);
		}
		return null;
	}
}

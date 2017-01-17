package octogeek.octocraft.octoindustry.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import octogeek.octocraft.octofurniture.container.ContainerToolChest;
import octogeek.octocraft.octofurniture.gui.GuiToolChest;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;
import octogeek.octocraft.octoindustry.container.ContainerToolBox;
import octogeek.octocraft.octoindustry.items.tools.ToolBox;
import octogeek.octocraft.octoindustry.tileentity.TileEntityToolBox;

public class GuiHandlerToolBox implements IGuiHandler {
	private static final int GUIID = 31;
	public static int getGuiID() {return GUIID;}

	// Gets the server side element for the given gui id- this should return a container
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID != getGuiID()) {
			System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
		}

		BlockPos xyz = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(xyz);

		switch (ID){
			case 31:
				System.out.println("OCTO - SERVERGUIBOX");
				if (player.getHeldItemMainhand() == null || !(player.getHeldItemMainhand().getItem() instanceof ToolBox)) return null;
				return new ContainerToolBox(player.inventory, new TileEntityToolBox());
			//return new ContainerToolChest(player.inventory, tileEntityInventoryToolChest);
		}
		return null;
	}		
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID != getGuiID()) {
			System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
		}
		switch (ID) {	
			case 31:
				System.out.println("OCTO - CLIENTGUIBOX");
			//	TileEntityToolBox tileEntityInventoryToolBox = (TileEntityToolBox) tileEntity;
				//return new ContainerToolBox(player.inventory,new TileEntityToolBox());
			//	TileEntityToolBox tileEntityInventoryToolBox = (TileEntityToolBox) tileEntity;
				if (player.getHeldItemMainhand() == null || !(player.getHeldItemMainhand().getItem() instanceof ToolBox)) return null;
				return new GuiToolBox(player.inventory, new TileEntityToolBox());

		}
		return null;
	}
}
	

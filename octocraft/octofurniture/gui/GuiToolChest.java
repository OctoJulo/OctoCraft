package octogeek.octocraft.octofurniture.gui;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import octogeek.octocraft.octofurniture.container.ContainerToolChest;
import octogeek.octocraft.octofurniture.tileentity.TileEntityToolChest;

@SideOnly(Side.CLIENT)
public class GuiToolChest extends GuiContainer {
	private static final ResourceLocation texturegui = new ResourceLocation("octocraft", "textures/gui/Inventory_ToolChest.png");
	private TileEntityToolChest tileEntityInventoryToolChest;

	public GuiToolChest(InventoryPlayer invPlayer, TileEntityToolChest tile) {
		super(new ContainerToolChest(invPlayer, tile));
		tileEntityInventoryToolChest = tile;
		// Set the width and height of the gui.  Should match the size of the texture!
		xSize = 176;
		//ySize = 133;
		ySize = 151;
	}

	// draw the background for the GUI - rendered first
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y) {
		// Bind the image texture of our custom container
		Minecraft.getMinecraft().getTextureManager().bindTexture(texturegui);
		// Draw the image
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	// draw the foreground for the GUI - rendered after the slots, but before the dragged items and tooltips
	// renders relative to the top left corner of the background
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		final int LABEL_XPOS = 5;
		final int LABEL_YPOS = 5;
		fontRendererObj.drawString(tileEntityInventoryToolChest.getDisplayName().getUnformattedText(), LABEL_XPOS, LABEL_YPOS, Color.darkGray.getRGB());
	}
}

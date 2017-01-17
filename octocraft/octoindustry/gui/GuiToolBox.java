package octogeek.octocraft.octoindustry.gui;

import java.awt.Color;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import octogeek.octocraft.octoindustry.container.ContainerToolBox;
import octogeek.octocraft.octoindustry.tileentity.TileEntityToolBox;

public class GuiToolBox extends GuiContainer {

	private static final ResourceLocation texturegui = new ResourceLocation("octocraft", "textures/gui/Inventory_ToolBox.png");
	private TileEntityToolBox tileEntityInventoryToolBox;

	public GuiToolBox(InventoryPlayer invPlayer, TileEntityToolBox tile) {
		super(new ContainerToolBox(invPlayer, tile));
		tileEntityInventoryToolBox = tile;
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
		fontRendererObj.drawString(tileEntityInventoryToolBox.getDisplayName().getUnformattedText(), LABEL_XPOS, LABEL_YPOS, Color.darkGray.getRGB());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static final ResourceLocation texture = new ResourceLocation("textures/gui/container/generic_54.png");
//
//	protected InventoryBackPack inv;
//
//	protected InventoryPlayer playerInv;
//
//	public int rows;
//
//
//
//	public GuiToolBox(InventoryPlayer playerInv, InventoryBackPack inv) {
//
//		super(new ContainerBackPack(playerInv, inv));
//
//		this.playerInv = playerInv;
//
//		this.inv = inv;
//
//		this.allowUserInput = false;
//
//		// Calculate the number of rows
//
//		this.rows = inv.getSizeInventory() / 9;
//
//		// Height of the GUI using the number of rows
//
//		this.ySize = 114 + this.rows * 18;
//
//	}
//
//
//
//	@Override
//
//	protected void drawGuiContainerForegroundLayer(int x, int y) {
//
//		this.fontRendererObj.drawString(I18n.format(this.inv.getInventoryName(), new Object[0]), 8, 6, 4210752);
//
//		this.fontRendererObj.drawString(this.playerInv.hasCustomInventoryName() ? this.playerInv.getInventoryName() : I18n.format(this.playerInv.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
//
//	}
//
//
//
//	@Override
//
//	protected void drawGuiContainerBackgroundLayer(float prt, int x, int y) {
//
//		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//
//		this.mc.getTextureManager().bindTexture(texture);
//
//
//
//		// Centering GUI
//
//		int k = (this.width - this.xSize) / 2;
//
//		int l = (this.height - this.ySize) / 2;
//
//
//
//		// Drawing the first part of the GUI (slots of the backpack)
//
//		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.rows * 18 + 17);
//
//		// And after the slots from the player's inventory
//
//		this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 126, this.xSize, 96);
//
//	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	


package RubyCraft.Gui;

import org.lwjgl.opengl.GL11;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Gui.Container.ContainerMesadeTrabajodeRuby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GuiMesadeRuby extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(Referencia.MOD_ID + ":" + "textures/gui/mesa_de_trabajo_de_ruby.png");
	
	public GuiMesadeRuby(InventoryPlayer invPlayer, World world, BlockPos pos) {
		super(new ContainerMesadeTrabajodeRuby(invPlayer, world, pos));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		this.fontRendererObj.drawString(I18n.format("gui.Fabricacion.name"), 106 , 9, 0xFF4626);
		this.fontRendererObj.drawString(I18n.format("gui.Mesa_de_Ruby.name"), 102, 80,  0xFF1500);
		this.fontRendererObj.drawString(I18n.format("gui.Inventario.name"),5 , 96, 0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}

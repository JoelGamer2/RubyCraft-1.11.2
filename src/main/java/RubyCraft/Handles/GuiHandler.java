package RubyCraft.Handles;

import RubyCraft.Gui.GuiMesadeRuby;
import RubyCraft.Gui.GuiMesadeZafiro;
import RubyCraft.Gui.Container.ContainerMesadeTrabajodeRuby;
import RubyCraft.Gui.Container.ContainerMesadeTrabajodeZafiro;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Registrar.Registros;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	

	@Override 
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = null;

		if(ID == Bloques.guiIDMesadeTrabajodeRuby){
			return ID == Bloques.guiIDMesadeTrabajodeRuby  ? new ContainerMesadeTrabajodeRuby(player.inventory, world, pos) : null;
		}
		if(ID == Bloques.guiIDMesadeTrabajodeZafiro){
			return ID == Bloques.guiIDMesadeTrabajodeZafiro  ? new ContainerMesadeTrabajodeZafiro(player.inventory, world, pos) : null;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = null;
		if(ID == Bloques.guiIDMesadeTrabajodeRuby){
			return ID == Bloques.guiIDMesadeTrabajodeRuby  ? new GuiMesadeRuby(player.inventory, world, pos) : null;
		}
		if(ID == Bloques.guiIDMesadeTrabajodeZafiro){
			return ID == Bloques.guiIDMesadeTrabajodeZafiro  ? new GuiMesadeZafiro(player.inventory, world, pos) : null;
		}
		
		return null;
	}

}

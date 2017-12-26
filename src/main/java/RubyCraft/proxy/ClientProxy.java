package RubyCraft.proxy;

import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Control_de_Version;
import RubyCraft.Eventos_Calendario;
import RubyCraft.RubyCraft;
import RubyCraft.Handles.GuiHandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Escaleras;
import RubyCraft.Iniciar.RItems;
import net.minecraftforge.fml.common.network.NetworkRegistry;


public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		
		RItems.RegistrarRenders();
		Bloques.RegistarRenders();
		Escaleras.RegistrarRenderizado();
		Herramientas.RegistrarRenders();
		Armaduras.RegistrarRenders();
		NetworkRegistry.INSTANCE.registerGuiHandler(RubyCraft.instance, new GuiHandler());

		if(RubyCraft.Navidad) {
			
			Eventos_Calendario.Texturas_Navidad();
			
		}else if(RubyCraft.Hallowen) {
			
			Eventos_Calendario.Texturas_Hallowen();
			
			
		}else if(RubyCraft.Dia_de_Los_Inocentes) {
			
			Eventos_Calendario.Texturas_Normales();
			
		}else if(Control_de_Version.Navidad_Activar == false) {
			
			Eventos_Calendario.Texturas_Normales();
			
		}else if(Control_de_Version.Navidad_Activar == true) {
			Eventos_Calendario.Texturas_Navidad();
		}else {
			
			Eventos_Calendario.Texturas_Normales();
		}
	}

}

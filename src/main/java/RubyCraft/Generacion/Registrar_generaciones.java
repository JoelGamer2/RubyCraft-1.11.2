package RubyCraft.Generacion;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registrar_generaciones {

	public static void Iniciar(){
		
		GameRegistry.registerWorldGenerator(new Generacion_Ruby(), 100);
		GameRegistry.registerWorldGenerator(new Generacion_Zafiro(), 100);
		GameRegistry.registerWorldGenerator(new Generacion_Materiales_Preciosos(), 100);
		
	}
	
}

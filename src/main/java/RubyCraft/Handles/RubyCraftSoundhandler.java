package RubyCraft.Handles;

import RubyCraft.Referencia;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class RubyCraftSoundhandler {

	public static int size = 0;
	
	public static SoundEvent mesa_de_conjuraciones_error;
	public static SoundEvent mesa_de_conjuraciones_hechizo;
	public static SoundEvent cancion_sans;
	
	public static void Iniciar(){
		size = SoundEvent.REGISTRY.getKeys().size();
		
		mesa_de_conjuraciones_error = registrar("block.mesa_de_conjuraciones_error");
		mesa_de_conjuraciones_hechizo = registrar("block.mesa_de_conjuraciones_hechizo");
		cancion_sans = registrar("record.cancion_sans");
	}
	public static SoundEvent registrar(String name){
		ResourceLocation location = new ResourceLocation(Referencia.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;
		return e;
	}
	
	
}

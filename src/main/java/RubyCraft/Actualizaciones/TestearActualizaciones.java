package RubyCraft.Actualizaciones;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TestearActualizaciones {

	private boolean Iniciadosesion = false;
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String UltimaVersion = "0";
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";

	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(Buscar_Actualizaciones.HayNuevaVersion() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Hay Una Nueva Version Disponible: " + TextFormatting.RED + UltimaVersion));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje1));
			if(Mensaje2a == true){
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje2));
			}if(Mensaje3a == true){
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje3));
			}
			Iniciadosesion = true;
		}
	}
	
}

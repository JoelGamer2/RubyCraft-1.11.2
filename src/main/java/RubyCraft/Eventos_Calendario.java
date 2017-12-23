package RubyCraft;

import java.util.Calendar;

import RubyCraft.Registrar.Crafteos;

public class Eventos_Calendario {

	public static void Iniciar_Test_de_Calendario() {
		
		 
		 /** Testear Calendario **/
		 
		//Testear Navidad
			Calendar calendar = Calendar.getInstance();
		if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 31 && Control_de_Version.Navidad_Activar == false){
	        RubyCraft.Navidad = true;
	        Crafteos.IniciarCrafteosNavidad();
	        Texturas_Navidad();
	    }else{
	    	//Testear Hallowen
	    	if(calendar.get(2) + 1 == 10 && calendar.get(5) == 31){
	    		RubyCraft.Hallowen = true;
	    		Crafteos.IniciarCrafteosHallowen();
	    		Texturas_Hallowen();
	    	}else{
	    		//Testear el Dia de Los Inocentes
	    		if(calendar.get(2) + 1 == 12 && calendar.get(5) == 28){
	    			Crafteos.IniciarCrafteosDiadelosInocentes();
	    			Texturas_Normales();
	    			RubyCraft.Dia_de_Los_Inocentes = true;
	    					
	    		} else if (Control_de_Version.Navidad_Activar == false){
	    			RubyCraft.Navidad = false;
	    			RubyCraft.Hallowen = false;
	    			RubyCraft.Dia_de_Los_Inocentes = false;
	    			
	    			Texturas_Normales();
	    		}else if(Control_de_Version.Navidad_Activar == true) {
	    			
	    			Texturas_Navidad();
	    			RubyCraft.Navidad = true;
	    			
	    		}
	    	}
	      }
	    }
		
	
	public static void Texturas_Normales() {
			
		
	}
	
	public static void Texturas_Navidad() {
		
		
	}
	public static void Texturas_Hallowen() {
		
		
	}
	
}

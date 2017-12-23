package RubyCraft.Actualizaciones;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.apache.logging.log4j.core.config.plugins.ResolverUtil.Test;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;

public class Buscar_Actualizaciones {

	private static final String Actualizacion_Url = "https://www.dropbox.com/s/y52p9naek5yrgjr/RubyCraft-Updates.txt?raw=1";
	private static boolean NuevaVersion = false;
	
	public static void MirarActualizaciones(){
		new Thread("Actualizaciones"){
			
			public void run(){
				try {
					URL url = new URL(Actualizacion_Url);
					Scanner scanner = new Scanner(url.openStream());
					String Mensaje11 = scanner.nextLine();
					String Mensaje22 = scanner.nextLine();
					String Mensaje33 = scanner.nextLine();
					String Mensaje44 = scanner.nextLine();
					String Mensaje55 = scanner.nextLine();
					String Mensaje66 = scanner.nextLine();
					String UltimaVersion = scanner.nextLine();
					String Mensaje1 = scanner.nextLine();
					String Mensaje2 = scanner.nextLine();
					String Mensaje3 = scanner.nextLine();
					scanner.close();
					if(!Referencia.VERSION.equals(UltimaVersion)){
						RubyCraft.logger.info(UltimaVersion + " Esta es la Ultima Version de RubyCraft Disponible");
						if(!Mensaje1.equals("")){
						RubyCraft.logger.info(Mensaje1);
						TestearActualizaciones.Mensaje1 = Mensaje1;
						}if(!Mensaje2.equals("")){
							RubyCraft.logger.info(Mensaje2);
							TestearActualizaciones.Mensaje2 = Mensaje2;
						}else{
							TestearActualizaciones.Mensaje2a = false;
						}	
						if(!Mensaje3.equals("")){
							RubyCraft.logger.info(Mensaje3);
							TestearActualizaciones.Mensaje3 = Mensaje3;
						}else{
							TestearActualizaciones.Mensaje3a = false;
						}
						if(Mensaje1.equals("") && Mensaje2.equals("") && Mensaje3.equals("")){			
							RubyCraft.logger.info("No hay cambios en actualizacion");
							TestearActualizaciones.Mensaje1 = "No hay Cambios en actualizacion";
						}
						
						TestearActualizaciones.UltimaVersion = UltimaVersion;
						FijarNuevaVersion();
					}
				} catch (MalformedURLException e) {
					System.err.println("La Url No Sirve");
				} catch (IOException e) {
				   System.out.println("Error 9090");
				}
			}
			
		}.start();
	}
	
	public static synchronized void FijarNuevaVersion(){
		NuevaVersion = true;
	}
	
	public static synchronized boolean HayNuevaVersion(){
		return NuevaVersion;
	}
	
}

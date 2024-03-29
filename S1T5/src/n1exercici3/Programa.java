package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {

	public static void programa() {
		
		crearArchivo("ListaLista.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la ruta del directori");
		String rutaArxiu = sc.nextLine();
		
		File file = new File(rutaArxiu);
		imprimirDirectorio (file);
		
		System.out.println("Ja s'ha guardat el llistat d'arxius al document .txt");
		
	}
	
	
	private static void escribirArchivo(String ruta, String contenido) {
		File file = new File(ruta);
		
		try (PrintWriter salida = new PrintWriter(new FileWriter(file, true))) {
		
			salida.println(contenido);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void crearArchivo(String ruta) {
		File file = new File(ruta);
		
		try (PrintWriter salida = new PrintWriter(file)){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void imprimirDirectorio (File file) {
		
		String[] listaEscritorio = file.list();
		
		if (listaEscritorio!=null) {
			
			Arrays.sort(listaEscritorio);
			
				for (int i = 0; i<listaEscritorio.length;i++) {
			
					File f = new File(file.getAbsolutePath(),listaEscritorio[i]);
						
					if (f.isDirectory()) {
							
						Date fecha = new Date (f.lastModified());
							
						escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (D)" + fecha);
								
						imprimirDirectorio(f);
							
					} else {
						Date fecha = new Date (f.lastModified());
			
						escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (F)" + fecha);			
					}
				} 
		} else {
			System.out.println("La ruta es nula");
		}
	}
}



package n1exercici2;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Programa {

	public static void programa() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la ruta del directori");
		String rutaArxiu = sc.nextLine();
		
		File file = new File(rutaArxiu);
		imprimirDirectorio (file);
		
		
	}
	
	public static void imprimirDirectorio (File file) {
		
			String[] listaEscritorio = file.list();
			
			if (listaEscritorio!=null) {
			
				for (int i = 0; i<listaEscritorio.length;i++) {
		
					File f = new File(file.getAbsolutePath(),listaEscritorio[i]);
					
					if (f.isDirectory()) {
						
						Date fecha = new Date (f.lastModified());
						
						System.out.println(listaEscritorio[i] + " (D)" + fecha);
							
						imprimirDirectorio(f);
						
					} else {
						
						Date fecha = new Date (f.lastModified());
						
						System.out.println(listaEscritorio[i] + " (F)" + fecha);
					}	
				} 
			} else {
				System.out.println("La ruta es nula");
			}
	}
}

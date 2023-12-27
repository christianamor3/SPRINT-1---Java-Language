package n1exercici2;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/Cristian/PruebaRuta");
		imprimirDirectorio (file);
		
		
	}
	
	public static void imprimirDirectorio (File file) {
		
		String[] listaEscritorio = file.list();
		
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
	}

}

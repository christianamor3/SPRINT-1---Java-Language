package n1exercici2;

import java.io.File;
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
				
				System.out.println(listaEscritorio[i] + " (D)");
					
				imprimirDirectorio(f);
				
			} else {
				
				System.out.println(listaEscritorio[i] + " (F)");
				
			}
		}
	}

}

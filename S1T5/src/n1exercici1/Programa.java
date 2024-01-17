package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {

	public static void programa() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la ruta del directori");
		String rutaArxiu = sc.nextLine();
		
		File file = new File(rutaArxiu);
		
		imprimirDirectorio (file);
		
	}
	
	private static void imprimirDirectorio (File file) {
		
		String[] listaEscritorio = file.list();
			
		if (listaEscritorio!=null) {
			
			Arrays.sort(listaEscritorio);
			
				for (int i = 0; i<listaEscritorio.length;i++) {
						System.out.println(listaEscritorio[i]);
				}
		} else {
			System.out.println("La ruta es nula");
		}
	} 
}
	

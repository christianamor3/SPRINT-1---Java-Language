package n1exercici1;

import java.io.File;
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
		
		String[] listaEscritorio = file.list();
		
		llistarDirectoriAlfabeticament(listaEscritorio);
	}
	
	private static void llistarDirectoriAlfabeticament(String[] listaEscritorio) {
			ArrayList<String> listaEscritorioArray = new ArrayList<>(Arrays.asList(listaEscritorio));
			
			listaEscritorioArray.stream().sorted(Comparator.comparing(str -> str.toLowerCase().charAt(0))).forEach(System.out::println);
	}

}

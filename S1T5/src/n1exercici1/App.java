package n1exercici1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {

		File file = new File("C:/Users/Cristian/Desktop");
		
		String[] listaEscritorio = file.list();
		
		llistarDirectoriAlfabeticament(listaEscritorio);
	}
	
	public static void llistarDirectoriAlfabeticament(String[] listaEscritorio) {
			ArrayList<String> listaEscritorioArray = new ArrayList<>(Arrays.asList(listaEscritorio));
			
			listaEscritorioArray.stream().sorted(Comparator.comparing(str -> str.toLowerCase().charAt(0))).forEach(System.out::println);
	}

}

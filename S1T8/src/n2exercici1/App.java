package n2exercici1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		ArrayList<String> noms = new ArrayList<>();
		
		noms.add("Christian");
		noms.add("Juan");
		noms.add("Gloria");
		noms.add("Mariona");
		noms.add("Alicia");
		noms.add("Ari");
		
		ArrayList<String> nomsAmbO = nomsAmbA3(noms);
		
		for (String str : nomsAmbO) {
			System.out.println(str);
		}
	}
	
	private static ArrayList<String> nomsAmbA3 (ArrayList<String> noms){
		ArrayList<String> nomsAmbA3 = new ArrayList<>(noms.stream().filter(str -> str.startsWith("A") && str.length()==3).collect(Collectors.toList()));
		return nomsAmbA3;
	}

}
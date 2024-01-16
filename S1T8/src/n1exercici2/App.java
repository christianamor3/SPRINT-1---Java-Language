package n1exercici2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		ArrayList<String> noms = new ArrayList<>();
		
		noms.add("Christian");
		noms.add("Juan");
		noms.add("Gloria");
		noms.add("Mariona");
		noms.add("Rosa");
		noms.add("Claudia");
		
		ArrayList<String> nomsAmbO = nomsAmbO(noms);
		
		for (String str : nomsAmbO) {
			System.out.println(str);
		}
	}
	
	private static ArrayList<String> nomsAmbO (ArrayList<String> noms){
		ArrayList<String> nomsAmbO = new ArrayList<>(noms.stream().filter(str -> str.contains("o") && str.length() >5).collect(Collectors.toList()));
		return nomsAmbO;
	}

}

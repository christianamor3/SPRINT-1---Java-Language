package n1exercici1;

import java.util.List;

import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		List<String> names = List.of("Christian","Juan","Gloria","Mariona","Rosa","Claudia");
		
		List<String> namesWithO = namesWithO(names);
		
		for (String str : namesWithO) {
			System.out.println(str);
		}
	}
	
	private static List<String> namesWithO (List<String> names){
		List<String> nomsAmbO = names.stream().filter(str -> str.contains("o")).collect(Collectors.toList());
		return nomsAmbO;
	}

}

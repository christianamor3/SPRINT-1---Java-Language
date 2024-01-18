package n1exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		List<String> names = List.of("Christian","Juan","Gloria","Mariona","Rosa","Claudia");
		
		List<String> namesWithOAndFiveChar = namesWithOAndFiveChar(names);
		
		for (String str : namesWithOAndFiveChar) {
			System.out.println(str);
		}
	}
		
	
	private static List<String> namesWithOAndFiveChar (List<String> names){
		List<String> namesWithOAndFiveChar = names.stream().filter(str -> str.contains("o") && str.length() >5).collect(Collectors.toList());
		return namesWithOAndFiveChar;
	}

}

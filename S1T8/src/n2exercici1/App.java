package n2exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> names = List.of("Christian","Juan","Gloria","Mariona","Alicia","Ari");
		
		List<String> namesWithAandThreeChar = namesWithAandThreeChar(names);
		
		for (String str : namesWithAandThreeChar) {
			System.out.println(str);
		}
	}
	
	private static List<String> namesWithAandThreeChar (List<String> names){
		List<String> namesWithAandThreeChar = names.stream().filter(str -> str.startsWith("A") && str.length()==3).collect(Collectors.toList());
		return namesWithAandThreeChar;
	}

}
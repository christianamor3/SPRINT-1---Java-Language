package n2exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<Integer> num = List.of(1,33,44,53);
		
		System.out.println(numerosEO(num));
		
	}
	
	private static String numerosEO (List<Integer> num){
		return num.stream().map(n -> (n%2==0 ? "e" : "o") + n)
												.collect(Collectors.joining(", "));
	}

}

package n2exercici2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(33);
		numeros.add(44);
		numeros.add(53);
	
		
		System.out.println(numerosEO(numeros));
		
	}
	
	public static String numerosEO (ArrayList<Integer> numeros){
		return numeros.stream().map(num -> (num%2==0 ? "e" : "o") + num)
				.collect(Collectors.joining(", "));
	}

}

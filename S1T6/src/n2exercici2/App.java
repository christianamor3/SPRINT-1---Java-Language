package n2exercici2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList <String> palabras = new ArrayList<>();
		palabras.add("Hola");
		palabras.add("Adios");
		
		ArrayList <Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		
		// Funciona con una arraylist de Strings
		GenericMethods.imprimirArguments(palabras);
		
		// Funciona con una arraylist de numeros
		GenericMethods.imprimirArguments(numeros);

	}

}

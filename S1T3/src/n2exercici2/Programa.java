package n2exercici2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Programa {

	public static void programa() {
		
		Scanner sc = new Scanner (System.in);

		HashSet <Restaurant> restaurantsHash = new HashSet<>(); // Creamos el HashSet
		
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			String nom=pedirString("Introdueix el nom del restaurant");
			
			int puntuacio=pedirInt("Introdueix la puntuacio del restaurant");
			
			restaurantsHash=introduirRestaurantsHashSet(restaurantsHash, crearRestaurants(nom, puntuacio));
			
			System.out.println("Aquest és el llistat de restaurants ordenats per nom i puntuacio");
			
			TreeSet<Restaurant> restaurantsTree= new TreeSet<Restaurant>(restaurantsHash);
			
			for (Restaurant rts : restaurantsTree) {
				System.out.println(rts.getNom() + " " + rts.getPuntuacio());
			}
			
			System.out.println("Vols seguir creant restaurants? Si | No");
			String resposta= sc.nextLine();
			
			if (resposta.equalsIgnoreCase("si")) {
				seguirBucle=true;
			} else {
				seguirBucle=false;
			}
			
		}
		
		System.out.println("Adios!!");
		

	}
	
	private static Restaurant crearRestaurants(String nom, int puntuacio) {
		Restaurant r1 = new Restaurant(nom, puntuacio);
		return r1;
	}
	
	
	
	private static HashSet <Restaurant>  introduirRestaurantsHashSet(HashSet <Restaurant> restaurants, Restaurant r1) {	
		if (!restaurants.contains(r1)) {
			restaurants.add(r1);
		}
		return restaurants;
	}
	
	
	// Metodo para pedir numero
	private static int pedirInt(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextInt();
	}
		
	private static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine().toUpperCase();
	}

}

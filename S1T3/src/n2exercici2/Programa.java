package n2exercici2;

import java.util.Scanner;
import java.util.TreeSet;

public class Programa {

	public static void programa() {
		
		Scanner sc = new Scanner (System.in);

		TreeSet <Restaurant> restaurantsTree = new TreeSet<>(); // Creamos el HashSet
		
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			String nom=pedirString("Introdueix el nom del restaurant");
			
			int puntuacio=pedirInt("Introdueix la puntuacio del restaurant");
			
			restaurantsTree=introduirRestaurantsTreeSet(restaurantsTree, crearRestaurants(nom, puntuacio));
			
			System.out.println("Aquest és el llistat de restaurants ordenats per nom i puntuacio");
			
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
	
	
	
	private static TreeSet <Restaurant>  introduirRestaurantsTreeSet(TreeSet <Restaurant> restaurantsTree, Restaurant r1) {	
		if (!restaurantsTree.contains(r1)) {
			restaurantsTree.add(r1);
		}
		return restaurantsTree;
	}
	
	
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

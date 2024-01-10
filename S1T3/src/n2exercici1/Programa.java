package n2exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programa {

	public static void programa() {
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Restaurant> restaurantsArrayList = new ArrayList<>(); // Creamos arraylist por que la lista será variable
		HashSet <Restaurant> restaurants = new HashSet<>(); // Creamos el HashSet
		
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			String nom=pedirString("Introdueix el nom del restaurant");
			
			int puntuacio=pedirInt("Introdueix la puntuacio del restaurant");
			
			restaurantsArrayList=introduirRestaurantsEnArrayList(restaurantsArrayList, crearRestaurants(nom, puntuacio));
			
			restaurants=introduirRestaurantsHashSet(restaurants, restaurantsArrayList);
			
			System.out.println("Aquest és el llistat de restaurants");
			for (Restaurant rts : restaurants) {
				System.out.println(rts.getNom());
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
	
	public static Restaurant crearRestaurants(String nom, int puntuacio) {
		Restaurant r1 = new Restaurant(nom, puntuacio);
		return r1;
	}
	
	public static ArrayList<Restaurant> introduirRestaurantsEnArrayList(ArrayList<Restaurant> restaurantsArrayList, Restaurant r1) {
		if (restaurantsArrayList.isEmpty() || validacionElementos(restaurantsArrayList, r1)) {
			restaurantsArrayList.add(r1);
		}
		return restaurantsArrayList;
	}
	
	public static HashSet <Restaurant>  introduirRestaurantsHashSet(HashSet <Restaurant> restaurants, ArrayList<Restaurant> restaurantsArrayList) {	
		for (int i=0; i<restaurantsArrayList.size();i++) {
			restaurants.add(restaurantsArrayList.get(i));
		}
		return restaurants;
	}
	
	public static boolean validacionElementos(ArrayList<Restaurant> restaurantsArrayList, Restaurant r1) {
		boolean validacion=true;
		try {
			for (int i=0; i<restaurantsArrayList.size();i++) {
				if ((restaurantsArrayList.get(i).getNom().equalsIgnoreCase(r1.getNom()) && (restaurantsArrayList.get(i).getPuntuacio()==(r1.getPuntuacio())))) {
					validacion=false;
					throw new ExcepcioRestaurantCreat();
				}
			} 
		} catch (ExcepcioRestaurantCreat e) {
			System.err.println(e.getMessage());
		}
		return validacion;
	}
	
	// Metodo para pedir numero
	static int pedirInt(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextInt();
	}
		
	static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine().toUpperCase();
	}

}

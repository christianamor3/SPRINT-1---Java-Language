package n1exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class Programa {

	public static void programa() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdueix la ruta de l'arxiu countries:");
		String rutaArxiu = sc.nextLine();
		
		HashMap<String, String> paisesCapitales = leerArchivo(rutaArxiu);
		String [] paisesClave = paisesCapitales.keySet().toArray(new String[0]);
		
		System.out.println("Introdueix el teu nom");
		String nomUsuari = sc.nextLine();
		
		crearArchivo("classificacio.txt");
		
		int puntuacio=0;

		for (int i=1; i<=10;i++) {
			String paisClave = generarPaisRandom(generarNumRandom(paisesClave),paisesClave);
			
			System.out.println(i + ". Introduce la capital de " + paisClave);
			String respuesta = sc.nextLine();
			
			if (respuesta.equalsIgnoreCase(paisesCapitales.get(paisClave))) {
				puntuacio++;
			}
		}
		System.out.println("Has conseguido " + puntuacio + " puntos");
		System.out.println("Has acabado el juego");
		
		escribirArchivo("classificacio.txt", nomUsuari, puntuacio);
		
	}
	
	public static HashMap<String, String> leerArchivo(String rutaArchivo){
		HashMap<String, String> paisesCapitales = new HashMap<>();
		FileReader archivo = null;
		BufferedReader lector=null;
		try {
			archivo = new FileReader(rutaArchivo);
			lector = new BufferedReader(archivo);
			String linea;
			while ((linea=lector.readLine())!=null) {
				String [] paisesCapitalesArray = linea.split(" ");
				String paises = paisesCapitalesArray[0];
				String capitales = paisesCapitalesArray[1];
				paisesCapitales.put(paises, capitales);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				lector.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return paisesCapitales;
	}
	
	public static int generarNumRandom(String [] paisesClave) {
		Random random = new Random();
		int numRandom = random.nextInt(paisesClave.length);
		return numRandom;
	}
	
	public static String generarPaisRandom(int numRandom, String [] paisesClave) {
		return paisesClave[numRandom];
	}
	
	public static void crearArchivo(String rutaArchivo) {
		File archivo = new File(rutaArchivo);
		PrintWriter salida=null;
		try {
			salida = new PrintWriter(archivo);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			salida.close();
		}
	}

	public static void escribirArchivo(String rutaArchivo, String nomUsuari, int puntuacio) {
		File archivo = new File(rutaArchivo);
		
		try (FileWriter fw = new FileWriter(archivo);
			PrintWriter salida = new PrintWriter(fw)) {
		
			salida.print(nomUsuari);
			salida.print(" - ");
			salida.print(puntuacio);
			salida.close();
			System.out.println("Se ha pasado la puntuacion de " + nomUsuari + " al archivo correctamente");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

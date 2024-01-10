
package n3exercici1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import n2exercici1.ExcepcioRestaurantCreat;
import n2exercici1.Restaurant;

public class Programa {

	public static void programa() {
	
		ArrayList<Persona> personas = new ArrayList<>();
		String rutaArchivo = crearArchivoCSV("archivoPrueba - Hoja 1.csv");
		introducirColumnas(rutaArchivo, new Persona (pedirString("Nombre de la primera Columna"), pedirString("Nombre de la segunda columna"), pedirString("Nombre de la tercera columna")));
		
		boolean seguirBucle=true;
		
		while(seguirBucle) {
			seguirBucle=menuOpciones(personas, imprimirMenu(), seguirBucle, rutaArchivo);
		}

	}

	public static int imprimirMenu() {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Indica cual de estas funciones deseas realizar");
		System.out.println();
		System.out.println("1. Introducir persona.");
		System.out.println();
		System.out.println("2. Mostrar les persones ordenades per nom (A-Z).");
		System.out.println();
		System.out.println("3. Mostrar les persones ordenades per nom (Z-A).");
		System.out.println();
		System.out.println("4. Mostrar les persones ordenades per cognoms (A-Z).");
		System.out.println();
		System.out.println("5. Mostrar les persones ordenades per cognoms (Z-A).");
		System.out.println();
		System.out.println("6. Mostrar les persones ordenades per DNI (1-9).");
		System.out.println();
		System.out.println("7. Mostrar les persones ordenades per DNI (9-1).");
		System.out.println();
		System.out.println("0. Salir de la aplicacion");
		System.out.println();
		return scanner.nextInt();
	}
	
	public static boolean menuOpciones(ArrayList <Persona> personas, int numEleccion, boolean seguirBucle, String rutaArchivo) {
		switch (numEleccion) {
			case 1:
				introducirPersonasArchivoCSV(rutaArchivo, crearPersona(pedirString("Introduce el nombre de la persona"), pedirString("Introduce el apellido de la persona"), pedirString("Introduce el DNI de la persona")));
				break;
			case 2:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirOrdenAlfabeticoAsc(personas);
				break;
			case 3:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirOrdenAlfabeticoDes(personas);
				break;
			case 4:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirApellidoOrdenAlfabeticoAsc(personas);
				break;
			case 5:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirApellidoOrdenAlfabeticoDes(personas);
				break;
			case 6:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirDNIOrdenAsc(personas);
				break;
			case 7:
				leerArchivoCSV(rutaArchivo, personas);
				imprimirDNIOrdenDes(personas);
				break;
			case 0: 
				System.out.println("Has decidido salir de la aplicacion. ¡Hasta pronto!");
				seguirBucle=false; 
				break;
			default:
				System.out.println("No has seleccionado una opcion disponible.");
				break;
				}
		return seguirBucle;
		}	
	
	public static Persona crearPersona(String nom, String cognom, String DNI){
		Persona persona = new Persona(nom, cognom, DNI);
		return persona;
	}
	
	public static void introducirPersonasArchivoCSV(String rutaArchivo, Persona persona) {
			File archivo = new File(rutaArchivo);
		
			try (FileWriter fw = new FileWriter(archivo,true)){
				PrintWriter salida = new PrintWriter(fw);
				salida.println(persona.pasarDatosCSV()); 
				salida.close();
				System.out.println("Se ha añadido la persona correctamente");
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public static void introducirColumnas(String rutaArchivo, Persona persona) {
		File archivo = new File(rutaArchivo);
	
		try (FileWriter fw = new FileWriter(archivo,true)){
			PrintWriter salida = new PrintWriter(fw);
			salida.println(persona.pasarDatosCSV()); 
			salida.close();
			System.out.println("Se han creado las columnas correctamente");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static String crearArchivoCSV(String rutaArchivo) {
		File file = new File(rutaArchivo);
		
		try {
			PrintWriter lector = new PrintWriter(file);
			lector.close();
			System.out.println("Se ha creado el archivo csv correctamete");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return rutaArchivo;
	}
	public static void leerArchivoCSV(String rutaArchivo, ArrayList<Persona> personas) {
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
			String linea;
				while((linea=lector.readLine())!=null) {
					String[] nomCognomDNI=linea.split(",");
					String nom=nomCognomDNI[0];
					String cognom=nomCognomDNI[1];
					String DNI=nomCognomDNI[2];
						if (nom.equalsIgnoreCase("nom") || cognom.equalsIgnoreCase("cognoms") || DNI.equalsIgnoreCase("dni")){
							
						} else if (personas.size()==0){
							Persona persona = new Persona(nom, cognom, DNI);
							personas.add(persona);
						} else {
							Persona persona = new Persona(nom, cognom, DNI);
							 if (validacionPersonas(personas, persona)) {
									personas.add(persona);
								}
						}
				}
	
			lector.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean validacionPersonas(ArrayList<Persona> personas, Persona p1) {
		boolean validacion=true;
			for (int i=0; i<personas.size();i++) {
				if ((personas.get(i).getDNI().equalsIgnoreCase(p1.getDNI()))) {
					validacion=false;
				}
			} 
		return validacion;
	}
	
	public static void imprimirOrdenAlfabeticoAsc(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getNom)).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	public static void imprimirOrdenAlfabeticoDes(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getNom).reversed()).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	public static void imprimirApellidoOrdenAlfabeticoAsc(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getCognom)).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	public static void imprimirApellidoOrdenAlfabeticoDes(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getCognom).reversed()).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	public static void imprimirDNIOrdenAsc(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getDNI)).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	public static void imprimirDNIOrdenDes(ArrayList<Persona> personas) {
		System.out.println("___NOM___COGNOMS___DNI___");
		personas.stream().sorted(Comparator.comparing(Persona::getDNI).reversed()).forEach(prs -> System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI()));
	} 
	
	
	// Metodo para pedir String 
	static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine().toUpperCase();
	}
}

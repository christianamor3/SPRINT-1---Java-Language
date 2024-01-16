package n3exercici1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;



public class Programa {

	public static void programa() {
	

		String rutaArchivo = crearArchivoCSV("archivoPrueba - Hoja 1.csv");
		introducirColumnas(rutaArchivo, new Persona (pedirString("Nombre de la primera Columna"), pedirString("Nombre de la segunda columna"), pedirString("Nombre de la tercera columna")));
		TreeSet<Persona> personas = new TreeSet<>();
		
		boolean seguirBucle=true;
		
		while(seguirBucle) {
			seguirBucle=menuOpciones(personas, imprimirMenu(), seguirBucle, rutaArchivo);
		}

	}

	private static int imprimirMenu() {
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
	
	private static boolean menuOpciones(TreeSet<Persona> personas, int numEleccion, boolean seguirBucle, String rutaArchivo) {
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
	
	private static Persona crearPersona(String nom, String cognom, String DNI){
		Persona persona = new Persona(nom, cognom, DNI);
		return persona;
	}
	
	private static void introducirPersonasArchivoCSV(String rutaArchivo, Persona persona) {
			File archivo = new File(rutaArchivo);
		
			try (FileWriter fw = new FileWriter(archivo,true);
					PrintWriter salida = new PrintWriter(fw)) {
				
				salida.println(persona.pasarDatosCSV()); 
				salida.close();
				System.out.println("Se ha añadido la persona correctamente");
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	private static void introducirColumnas(String rutaArchivo, Persona persona) {
		File archivo = new File(rutaArchivo);
	
		try (FileWriter fw = new FileWriter(archivo, true);
				PrintWriter salida = new PrintWriter(fw)) {
			
			salida.println(persona.pasarDatosCSV()); 
			salida.close();
			System.out.println("Se han creado las columnas correctamente");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private static String crearArchivoCSV(String rutaArchivo) {
		File file = new File(rutaArchivo);
		PrintWriter lector = null;
		
		try {
			lector = new PrintWriter(file);
			System.out.println("Se ha creado el archivo csv correctamete");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			lector.close();
		}
		return rutaArchivo;
	}
	
	private static void leerArchivoCSV(String rutaArchivo,TreeSet<Persona> personas) {
		BufferedReader lector = null;
		try {
			lector = new BufferedReader(new FileReader(rutaArchivo));
			String linea;
				while((linea=lector.readLine())!=null) {
					String[] nomCognomDNI=linea.split(",");
					String nom=nomCognomDNI[0];
					String cognom=nomCognomDNI[1];
					String DNI=nomCognomDNI[2];
						if (nom.equalsIgnoreCase("nom") || cognom.equalsIgnoreCase("cognoms") || DNI.equalsIgnoreCase("dni")){
							
						} else {
							Persona persona = new Persona(nom, cognom, DNI);
							 if (!personas.contains(persona)) {
									personas.add(persona);
								}
						}
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				lector.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	private static void imprimirOrdenAlfabeticoAsc(TreeSet<Persona> personas) {
		for (Persona prs : personas) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
		}
	}
	
	private static void imprimirOrdenAlfabeticoDes(TreeSet<Persona> personas) {
        TreeSet<Persona> treeSetNombreDescendente = new TreeSet<>(Comparator.comparing(Persona::getNom).reversed()); // Creamos un nuevo treeset que ordenará de la siguiente forma.
        treeSetNombreDescendente.addAll(personas); // Añadimos los elementos del treeset personas al treeset nuevo.

        for (Persona prs: treeSetNombreDescendente) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
        }
	}
	
	private static void imprimirApellidoOrdenAlfabeticoAsc(TreeSet<Persona> personas) {
		TreeSet<Persona> treeSetApellido = new TreeSet<>(Comparator.comparing(Persona::getCognom));
		treeSetApellido.addAll(personas);

        for (Persona prs: treeSetApellido) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
        }
	}
	
	
	private static void imprimirApellidoOrdenAlfabeticoDes(TreeSet<Persona> personas) {
		TreeSet<Persona> treeSetApellidoDescendente = new TreeSet<>(Comparator.comparing(Persona::getCognom).reversed());
		treeSetApellidoDescendente.addAll(personas);

        for (Persona prs: treeSetApellidoDescendente) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
        }
	}
		
	private static void imprimirDNIOrdenAsc(TreeSet<Persona> personas) {
		TreeSet<Persona> treeSetDNI= new TreeSet<>(Comparator.comparing(Persona::getDNI));
		treeSetDNI.addAll(personas);

        for (Persona prs: treeSetDNI) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
        }
	}
	
	private static void imprimirDNIOrdenDes(TreeSet<Persona> personas) {
		TreeSet<Persona> treeSetDNIDescendente = new TreeSet<>(Comparator.comparing(Persona::getDNI).reversed());
		treeSetDNIDescendente.addAll(personas);

        for (Persona prs: treeSetDNIDescendente) {
			System.out.println(prs.getNom() + " " + prs.getCognom() + " " + prs.getDNI());
        }
	}
	
	
	// Metodo para pedir String 
	private static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine().toUpperCase();
	}
}

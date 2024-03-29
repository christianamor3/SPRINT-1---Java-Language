package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {

	public static void programa() {
		
		crearArchivo("ListaLista.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la ruta del directori");
		String rutaArxiu = sc.nextLine();
		
		File file = new File(rutaArxiu);
		imprimirDirectorio (file);
		
		System.out.println("Ja s'ha guardat el llistat d'arxius al document .txt");
		
		System.out.println("Introdueix la ruta de l'arxiu .txt que vols llegir");
		String rutaArxiu2 = sc.nextLine();
		
		leerArchivoTXT(rutaArxiu2);
		
		System.out.println();	

		System.out.println("Ahora vamos a serializar un objeto en un archivo .ser");	
		
		Persona persona = new Persona("Christian", "Amor");
		
		serializar(persona);
		deserializar();
			
	}
	
	private static void serializar(Persona persona) {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("ObjecteSerialitzat.ser"));
			objectOutputStream.writeObject(persona);
		} catch (IOException e) {
			e.getMessage();
		} finally {
			try {
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	
		System.out.println("Se ha serializado el objeto correctamente");
	}
	
	private static void deserializar() {
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("ObjecteSerialitzat.ser"));
			Persona personaDeserializado = (Persona) objectInputStream.readObject();
			
			System.out.println(personaDeserializado.getNom());
		} catch (IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Se ha DEserializado el objeto correctamente");
	}
			
	private static void leerArchivoTXT(String ruta) {
		File file = new File(ruta);
		BufferedReader salida = null;
				
		try {
			salida = new BufferedReader(new FileReader(file));
			String linea="";
			while ((linea=salida.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (Exception e) {
			System.out.println("El archivo no se ha encontrado");
		} finally {
			try {
				salida.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	private static void escribirArchivo(String ruta, String contenido) {
		File file = new File(ruta);
		
		try (PrintWriter salida = new PrintWriter(new FileWriter(file, true))) {
		
			salida.println(contenido);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void crearArchivo(String ruta) {
		File file = new File(ruta);
		
		try (PrintWriter salida = new PrintWriter(file)){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void imprimirDirectorio (File file) {
		
		String[] listaEscritorio = file.list();
		
		if (listaEscritorio!=null) {
			
			Arrays.sort(listaEscritorio);
			
				for (int i = 0; i<listaEscritorio.length;i++) {
			
					File f = new File(file.getAbsolutePath(),listaEscritorio[i]);
						
					if (f.isDirectory()) {
							
						Date fecha = new Date (f.lastModified());
							
						escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (D)" + fecha);
								
						imprimirDirectorio(f);
							
					} else {
						Date fecha = new Date (f.lastModified());
			
						escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (F)" + fecha);			
					}
				} 
		} else {
			System.out.println("La ruta es nula");
		}
	}
}

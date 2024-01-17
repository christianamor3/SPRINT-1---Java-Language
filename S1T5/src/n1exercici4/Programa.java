package n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
				
				
		}
			
	private static void leerArchivoTXT(String ruta) {
		File file = new File(ruta);
		BufferedReader salida =	null;
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
	}

}


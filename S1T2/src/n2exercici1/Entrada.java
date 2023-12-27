package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	static Scanner sc = new Scanner(System.in);
	

	// Metodes per InputMismatchException
	
	public static byte llegirByte(String missatge) {
		byte edat=0;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				edat = sc.nextByte();
				seguirBucle=false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		return edat;
	}
	
	public static int llegirInt(String missatge) {
		int preu=0;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				preu = sc.nextInt();
				seguirBucle=false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		return preu;
	}
	
	public static float llegirFloat(String missatge) {
		float alçada=0;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				alçada = sc.nextFloat();
				seguirBucle=false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		return alçada;
	}
	
	public static double llegirDouble(String missatge) {
		double preuCotxe=0;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				preuCotxe = sc.nextDouble();
				seguirBucle=false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.nextLine();
			}
		}
		return preuCotxe;
	}
	
	// Metodes per Exception
	
	public static char llegirChar(String missatge) {
		char letra = 0;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				letra = sc.nextLine().charAt(0);
				seguirBucle=false;
			} catch (Exception e) {
				System.out.println("Error de format");
			}
		}
		return letra;
	}
	
	public static String llegirString(String missatge) {
		String nombre = "";
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				nombre = sc.nextLine();
				if (nombre.length()<=2) {
					throw new Exception();
				}
				seguirBucle=false;
			} catch (Exception e) {
				System.out.println("Error de format");
			}
		}
		return nombre;
	}
	
	public static boolean llegirSiNo(String missatge) {
		String resposta="";
		boolean resultat=true;
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			try {
				System.out.println(missatge);
				resposta = sc.nextLine();
				if (resposta.equalsIgnoreCase("s")) {
					resultat=true;
				} else if (resposta.equalsIgnoreCase("n")) {
					resultat=false;
				} else {
					throw new Exception();
				}
				seguirBucle=false;
			} catch (Exception e) {
				System.out.println("Error de format");
			}
		}
		return resultat;
	}
	
}

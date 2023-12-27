package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	static ArrayList <Redactor> redaccio= new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Benvingut a l'aplicacio de la redaccio!");
		
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			seguirBucle=menuOpcions(imprimirOpcions(),seguirBucle);
		}	
	}
	
		public static int imprimirOpcions() {
			Scanner scanner = new Scanner(System.in);	
			System.out.println("Indica quina d'aquestes funcions vols realitzar");
			System.out.println();
			System.out.println("1. Introduir un redactor.");
			System.out.println();
			System.out.println("2. Eliminar un redactor.");
			System.out.println();
			System.out.println("3. Introduir noticia a un redactor.");
			System.out.println();
			System.out.println("4. Eliminar noticia de redactor.");
			System.out.println();
			System.out.println("5. Mostrar totes les noticies per redactor/a.");
			System.out.println();
			System.out.println("6. Calcular puntuacio de la noticia.");
			System.out.println();
			System.out.println("7. Calcular preu-noticia");
			System.out.println();
			System.out.println("0. Sortir de l'aplicacio.");
			System.out.println();
			return scanner.nextInt();
		}
		
		public static boolean menuOpcions(int eleccio, boolean seguirBucle) {
			switch (eleccio) {
			case 1:
				introduccioRedactor(pedirString("Introdueix el nom del redactor"), pedirString("Introdueix el seu DNI"));
				break;
			case 2:
				if (redaccio.size()==0) {
						System.out.println("No hi ha redactors disponibles");
				} else {
					imprimirRedactors();
					int indexRedactor=buscarIndexRedactor(pedirString("Introdueix el nom del redactor que vols eliminar"), pedirString("Introdueix el seu DNI"));
					eliminarRedactor(indexRedactor);
				}
				break;
			case 3:
				if (redaccio.size()==0) {
					System.out.println("No hi ha redactors disponibles per a introduir noticies");
				} else {
					imprimirRedactors();
					int indexRedactor=buscarIndexRedactor(pedirString("Introdueix el nom del redactor al que vols introduir una noticia"), pedirString("Introdueix el seu DNI"));
					introduirNoticiaRedactor(crearNoticia(), indexRedactor);
				}
				break;
			case 4:
				if (redaccio.size()==0) {
					System.out.println("No hi ha redactors disponibles per a poder eliminar noticies");
				} else {
					imprimirRedactors();
					int indexRedactor=buscarIndexRedactor(pedirString("Introdueix el nom del redactor al que vols eliminar alguna noticia"), pedirString("Introdueix el seu DNI"));
					if (indexRedactor==-1 || redaccio.get(indexRedactor).noticies.size()==0){
						System.out.println("El redactor que busques no està a la redaccio o no te cap noticia");
					} else {
						imprimirTitulars(indexRedactor);
						int indexNoticia=buscarIndexNoticiaRedactor(indexRedactor, pedirString("Introdueix el titular de la noticia que vols eliminar"));
						eliminarNoticiaRedactor(indexRedactor, indexNoticia); 
					}
				}
				break;
			case 5:
				if (redaccio.size()==0) {
					System.out.println("No hi ha redactors disponibles per a poder mostrar les noticies");
				} else {
					imprimirRedactorMesTitulars();
				}
				break;
			case 6:
				if (redaccio.size()==0) {
					System.out.println("No hi ha redactors disponibles per a poder calcular puntuacions");
				} else {
					imprimirRedactors();
					int indexRedactor=buscarIndexRedactor(pedirString("Introdueix el nom del redactor del que vulguis calcular la puntuacio d'una noticia"), pedirString("Introdueix el seu DNI"));
					if (indexRedactor==-1 || redaccio.get(indexRedactor).noticies.size()==0){
						System.out.println("El redactor que busques no està a la redaccio o no te cap noticia");
					} else {
						imprimirTitulars(indexRedactor);
						int indexNoticia=buscarIndexNoticiaRedactor(indexRedactor, pedirString("Introdueix el titular de la noticia que vols saber-ne la puntuacio"));
						obtenirPuntuacioNoticia(indexRedactor, indexNoticia);
					}
				}
				break;
			case 7:
				if (redaccio.size()==0) {
					System.out.println("No hi ha redactors disponibles per a poder calcular preus");
				} else {
					imprimirRedactors();
					int indexRedactor=buscarIndexRedactor(pedirString("Introdueix el nom del redactor del que vulguis calcular el preu d'una noticia"), pedirString("Introdueix el seu DNI"));
					if (indexRedactor==-1 || redaccio.get(indexRedactor).noticies.size()==0){
						System.out.println("El redactor que busques no està a la redaccio o no te cap noticia");
					} else {
						imprimirTitulars(indexRedactor);
						int indexNoticia=buscarIndexNoticiaRedactor(indexRedactor, pedirString("Introdueix el titular de la noticia que vols saber-ne la puntuacio"));
						obtenirPreuNoticia(indexRedactor, indexNoticia);
					}
				}
				break;
			case 0:
				System.out.println("Has decidit sortir de l'aplicacio. Fins aviat!");
				seguirBucle=false;
				break;
			default:
				System.out.println("No has seleccionat una opció disponible");
				break;
			}
			
			return seguirBucle;
		}
	
		// Metodo para introducir un redactor
		public static void introduccioRedactor(String nom, String DNI) {
			redaccio.add(crearRedactor(nom, DNI));
		}
				
		// Metode per a crear un redactor
		public static Redactor crearRedactor(String nom, String DNI) {
			Redactor redactor1 = new Redactor(nom, DNI);
			System.out.println("El redactor s'ha creat correctament.");
			return redactor1;
		}
		
		// Metodo para introducir una noticia a un redactor
		public static void introduirNoticiaRedactor(Noticia noticia, int indexRedactor) {
			if (indexRedactor==-1) {
				System.out.println("No s'ha trobat el redactor.");
			} else {
				redaccio.get(indexRedactor).getNoticies().add(noticia);
			}
		}
		
		// Metodo para crear noticia
		public static Noticia crearNoticia() {
			Scanner sc = new Scanner(System.in);
			System.out.println("De quin esport tracta la noticia?");
			String deporte = pedirString("Futbol, Basquet, Tenis, F1 o Motociclisme");
			Noticia noticia = null;
			
			switch (deporte) {
				case "FUTBOL":
					noticia = crearNoticiaFutbol(pedirString("Afegeix un titular"), pedirString("Afegeix de quina competicio tracta"), pedirString("De quin club tracta?"), pedirString("De quin jugador parla?"));
					break;
				case "BASQUET":
					noticia = crearNoticiaBasquet(pedirString("Afegeix un titular"), pedirString("Afegeix de quina competicio tracta"), pedirString("De quin club tracta?"));
					break;
				case "TENIS":
					noticia = crearNoticiaTenis(pedirString("Afegeix un titular"), pedirString("Afegeix de quina competicio tracta"), pedirString("De quin tenistes parla?"));
					break;
				case "F1":
					noticia = crearNoticiaF1(pedirString("Afegeix un titular"), pedirString("Afegeix de quina escuderia parla"));
					break;
				case "MOTOCICLISME":
					noticia = crearNoticiaMotociclisme(pedirString("Afegeix un titular"), pedirString("Afegeix de quin equip parla"));
					break;
				default:
					System.out.println("No has introduit un esport disponible");
				}
			return noticia;
		}
		
		
		// Metodo para crear noticia de futbol
		public static Futbol crearNoticiaFutbol(String titular, String competicio, String club, String jugador) {
			Futbol noticiaFutbol = new Futbol(titular, competicio, club, jugador);
			System.out.println("S'ha creat la noticia de futbol correctament");
			return noticiaFutbol;
		}
		
		// Metodo para crear noticia de basquet
		public static Basquet crearNoticiaBasquet(String titular, String competicio, String club) {
			Basquet noticiaBasquet = new Basquet(titular, competicio, club);
			System.out.println("S'ha creat la noticia de basquet correctament");
			return noticiaBasquet;
		}
		
		// Metodo para crear noticia de basquet
		public static Tenis crearNoticiaTenis(String titular, String competicio, String tenistes) {
			Tenis noticiaTenis = new Tenis(titular, competicio, tenistes);
			System.out.println("S'ha creat la noticia de tenis correctament");
			return noticiaTenis;
		}
		
		// Metodo para crear noticia de basquet
		public static F1 crearNoticiaF1(String titular, String escuderia) {
			F1 noticiaF1 = new F1(titular, escuderia);
			System.out.println("S'ha creat la noticia de F1 correctament");
			return noticiaF1;
		}
		
		// Metodo para crear noticia de basquet
		public static Motociclisme crearNoticiaMotociclisme(String titular, String equip) {
			Motociclisme noticiaMotociclisme = new Motociclisme(titular, equip);
			System.out.println("S'ha creat la noticia de motociclisme correctament");
			return noticiaMotociclisme;
		}
		
		// Metodo para eliminar un redactor
		public static void eliminarRedactor(int indexRedactor) {
			if (indexRedactor==-1) { 
				System.out.println("No s'ha pogut eliminar el redactor");
			} else { 
				redaccio.remove(indexRedactor);
				System.out.println("El redactor s'ha eliminat correctament.");
			}
		}
		
		// Metodo para buscar redactor
		public static int buscarIndexRedactor(String nom, String DNI) {
			int posicioIndex=-1;
			int i=0;
			while(i<redaccio.size() && posicioIndex==-1) {
				if (nom.equalsIgnoreCase(redaccio.get(i).getNom()) && DNI.equalsIgnoreCase(redaccio.get(i).getDNI())) {
					posicioIndex=i;
				}
				i++;
			}
			return posicioIndex;
		}
		
		// Metodo para buscar redactor
		public static int buscarIndexNoticiaRedactor(int indexRedactor, String titular) {
			int posicioIndexNoticia=-1;
			int i=0;
				while (i<redaccio.get(indexRedactor).noticies.size() && posicioIndexNoticia==-1) { 
					if (titular.equalsIgnoreCase(redaccio.get(indexRedactor).noticies.get(i).getTitular())) {
						posicioIndexNoticia=i;
					} 
						i++;			
				}
				return posicioIndexNoticia;	
			}
		
		// Metodo para imprimir los redactores de la redaccion
		public static void imprimirRedactors() {
			for (int i=0; i<redaccio.size();i++) {
				System.out.println(redaccio.get(i).getNom() + " ");
				System.out.println(redaccio.get(i).getDNI());
			}
		}
		
		// Metodo para imprimir los titulares noticies
		public static void imprimirRedactorMesTitulars(){
				for (int i=0; i<redaccio.size();i++) {
					if (redaccio.get(i).getNoticies().size()==0) {
						System.out.println("El redactor " + redaccio.get(i).getNom() + " amb DNI " + redaccio.get(i).getDNI() + " no te noticies");
					} else {
						System.out.println(redaccio.get(i).getNom() + " ");
						System.out.println(redaccio.get(i).getDNI());
						for (int j=0; j<redaccio.get(i).getNoticies().size();j++) {
							System.out.println("  " + redaccio.get(i).getNoticies().get(j).getTitular());
						}
					}
			}
		}

		// Metodo para imprimir los titulares noticies
		public static void imprimirTitulars(int indexRedactor){
				for (int i=0; i<redaccio.get(indexRedactor).noticies.size();i++) {
					if (redaccio.get(indexRedactor).noticies.size()==0) {
						System.out.println("El redactor " + redaccio.get(indexRedactor).getNom() + " amb DNI " + redaccio.get(indexRedactor).getDNI() + " no te noticies");
					} else {
						System.out.println(redaccio.get(indexRedactor).getNom() + " ");
						System.out.println(redaccio.get(indexRedactor).getDNI());
						for (int j=0; j<redaccio.get(indexRedactor).noticies.size();j++) {
							System.out.println("  " + redaccio.get(indexRedactor).noticies.get(j).getTitular());
						}
					}
				}
			}
	
	// Metodo para obtener la puntuacio d'una Noticia
		public static void obtenirPuntuacioNoticia(int indexRedactor, int indexNoticia) {
			if (indexNoticia==-1) {
				System.out.println("La noticia no esta a la llista del redactor");
				} else {
				if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Futbol) {
					Futbol futbol = (Futbol) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					futbol.calcularPuntuacioNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Basquet) {
					Basquet basquet = (Basquet) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					basquet.calcularPuntuacioNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Tenis) {
					Tenis tenis = (Tenis) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					tenis.calcularPuntuacioNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof F1) {
					F1 f1 = (F1) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					f1.calcularPuntuacioNoticia();
				} else {
					Motociclisme motociclisme = (Motociclisme) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					motociclisme.calcularPuntuacioNoticia();
				}
			}
	}
	
	
	// Metodo para obtener el  precio Noticia
	public static void obtenirPreuNoticia(int indexRedactor, int indexNoticia) {
		if (indexNoticia==-1) {
			System.out.println("La noticia no esta a la llista del redactor");
			} else {
				if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Futbol) {
					Futbol futbol = (Futbol) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					futbol.calcularPreuNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Basquet) {
					Basquet basquet = (Basquet) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					basquet.calcularPreuNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof Tenis) {
					Tenis tenis = (Tenis) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					tenis.calcularPreuNoticia();
				} else if (redaccio.get(indexRedactor).getNoticies().get(indexNoticia) instanceof F1) {
					F1 f1 = (F1) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					f1.calcularPreuNoticia();
				} else {
					Motociclisme motociclisme = (Motociclisme) redaccio.get(indexRedactor).getNoticies().get(indexNoticia);
					motociclisme.calcularPreuNoticia();
				}
			}
	}
	
	
	// Metodo para introducir una noticia a un redactor
	public static void eliminarNoticiaRedactor(int indexRedactor, int indexNoticia) {
		if (redaccio.size()==0) {
			System.out.println("No hi ha redactors disponibles");
		} else if (indexRedactor==-1) {
			System.out.println("El redactor no esta a la llista");
		} else {
			if (indexNoticia==-1) {
			System.out.println("La noticia no esta a la llista del redactor");
			} else {
				redaccio.get(indexRedactor).getNoticies().remove(indexNoticia);
				System.out.println("La noticia s'ha eliminat correctament.");
			}
		}
	}
	
	// Metodo para pedir String 
	static String pedirString(String mensaje) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine().toUpperCase();
	}
	
	// Metodo para pedir numero
	static int pedirInt(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextInt();
	}
}

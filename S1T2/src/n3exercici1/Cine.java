package n3exercici1;
import java.util.Scanner;

public class Cine {

	private int numeroFiles;
	private int numeroSeients;
	private GestioButaques gestioButaques;
	
	Scanner sc = new Scanner(System.in);
	
	public Cine() {
		this.gestioButaques = new GestioButaques();
		demanarDadesInicials(pedirInt("Introdueix el numero de files que té el cinema"), pedirInt("Introdueix el numero de seients que té el cinema"));
	}
	

	public void demanarDadesInicials(int files, int seients) {
		this.numeroFiles=files;
		this.numeroSeients=seients;
	}
	
	public boolean iniciar(boolean seguirBucle) {
		return menuOpcions(imprimirMenu(), seguirBucle);
	}
	
	public int imprimirMenu() {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Indica quines d'aquestes funcions vols realitzar");
		System.out.println();
		System.out.println("1. Mostrar totes les butaques reservades");
		System.out.println();
		System.out.println("2. Mostrar les butaques reservades per una persona");
		System.out.println();
		System.out.println("3. Reservar una butaca");
		System.out.println();
		System.out.println("4. Anul·lar la reserva d'una butaca");
		System.out.println();
		System.out.println("5. Anul·lar totes les reserves d'una persona");
		System.out.println();
		System.out.println("0. Salir de la aplicacion");
		System.out.println();
		return scanner.nextInt();
	}
	
	public boolean menuOpcions(int numEleccion, boolean seguirBucle) {
		int posicionIndice;
		switch (numEleccion) {
			case 1:
				if (gestioButaques.butaques.size()==0) {
					System.out.println("El cinema encara no té butaques reservades");
				} else {	
					mostrarButaques();
				}
				break;
			case 2:
				if (gestioButaques.butaques.size()==0) {
					System.out.println("El cinema encara no té butaques reservades");
				} else {
					mostrarButaquesPersona(pedirString("Introdueix el nom de la persona de la que vols veure les reserves"));	
				}
				break;
			case 3:
				reservarButaca(introduirFila(pedirInt("Introdueix un numero de fila")), introduirSeient(pedirInt("Introdueix un numero de seient")), introduirPersona(pedirString("Introdueix el nom de la persona")));
				break;
			case 4:
				if (gestioButaques.butaques.size()==0) {
					System.out.println("El cinema encara no té butaques reservades");
				} else {
					anularReserva(introduirFila(pedirInt("Introdueix un numero de fila")), introduirSeient(pedirInt("Introdueix un numero de seient")));
				}
				break;
			case 5:
				if (gestioButaques.butaques.size()==0) {
					System.out.println("El cinema encara no té butaques reservades");
				} else {
					anularReservaPersona(introduirPersona(pedirString("Introdueix el nom de la persona")));
				}
				break;
			case 0: 
				System.out.println("Has decidit sortir de l'aplicacio. ¡Fins aviat!");
				seguirBucle=false; 
				break;
			default:
				System.out.println("No has selecionat una opció disponible.");
				break;
				}
			return seguirBucle;
		}	
	
	public void mostrarButaques() {
		for (int i=0;i<gestioButaques.butaques.size();i++) {
			System.out.println(gestioButaques.butaques.get(i).toString());
		}
	}
	
	public void mostrarButaquesPersona(String nomPersona) {
		int i=0;
		while(i<gestioButaques.butaques.size()) {
			if (nomPersona.equalsIgnoreCase(gestioButaques.butaques.get(i).getPersona())) {
				System.out.println(gestioButaques.butaques.get(i).toString());
			}
			i++;
		}
	}
	
	public void reservarButaca (int numFila, int numSeient, String nomPersona) {
		if (numFila==-1 && numSeient==-1) {
			System.out.println("No has marcat una fila i/o seient disponible");
		} else if (nomPersona.equalsIgnoreCase("null")){
		} else {
			Butaca b1 = new Butaca(numFila, numSeient, nomPersona);
			if (gestioButaques.afegirButaca(b1)) {
				System.out.println("La butaca " + numFila + " seient " + numSeient + " s'ha reservat a nom de " + nomPersona);
			} else {
				System.out.println("La butaca no s'ha pogut reservar");
			}
		}
	}
	public void anularReserva(int numFila, int numSeient) {
		gestioButaques.eliminarButaca(numFila, numSeient);
		System.out.println("La reserva de la fila " + numFila + " seient " + numSeient + " S'ha anulat correctament");
	}
	
	public void anularReservaPersona(String nomPersona) {
		int chivato=-1;
		int i=0;
			while (i<gestioButaques.butaques.size() && chivato==-1) { 
				if (nomPersona.equalsIgnoreCase(gestioButaques.butaques.get(i).getPersona())) {
					gestioButaques.butaques.remove(i);
				} 
								
			}
			System.out.println("Les butaques reservades a nom de " + nomPersona + " s'han anulat correctament");
		}
		
	
	public String introduirPersona(String nomPersona) {
		String nomPersonaCorrecte="null";
		try {
			if (verificacioNumeros(nomPersona)) {
				throw new ExcepcioNomPersonaIncorrecte();
			} else {
				nomPersonaCorrecte=nomPersona;
			}
		} catch	(ExcepcioNomPersonaIncorrecte e) {
			System.out.println(e.getMessage());
		}
		return nomPersonaCorrecte;
	}
	
	public boolean verificacioNumeros(String nomPersona) {
		boolean resultado=false;
		for (int i=0; i<nomPersona.length();i++) {
				if (Character.isDigit(nomPersona.charAt(i))) {
					resultado=true;
				}
		}
		return resultado;
	}
	
	public int introduirFila(int numFila) {
		int numFilaCorrecte=-1;
		try {
			if (numFila>=1 && numFila <= numeroFiles) {
				numFilaCorrecte=numFila;
			} else {
				throw new ExcepcioFilaIncorrecta();
			}
		} catch	(ExcepcioFilaIncorrecta e) {
			System.out.println(e.getMessage());
		}
		return numFilaCorrecte;
	}
	
	public int introduirSeient(int numSeient) {
		int numSeientCorrecte=-1;
		try {
			if (numSeient>=1 && numSeient <= numeroSeients) {
				numSeientCorrecte=numSeient;
			} else {
				throw new ExcepcioSeientIncorrecte();
			}
		} catch	(ExcepcioSeientIncorrecte e) {
			System.out.println(e.getMessage());
		}
		return numSeientCorrecte;
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

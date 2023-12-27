package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		// InputMismatchException
		System.out.println(Entrada.llegirByte("Introdueix la teva edat"));
		System.out.println(Entrada.llegirInt("Introdueix el preu del teu telefon"));
		System.out.println(Entrada.llegirFloat("Introdueix la teva alçada"));
		System.out.println(Entrada.llegirFloat("Introdueix el preu del teu cotxe"));
		
		// Exception
		System.out.println(Entrada.llegirChar("Introdueix la primera lletra del teu nom"));
		System.out.println(Entrada.llegirString("Introdueix el teu nom"));
		System.out.println(Entrada.llegirSiNo("Introdueix una 's' o una 'n'"));

	}

}

package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		// Aquest metode ja no em serveix, ja que com a 
		// tercer parametre espera rebre un int, i li estic
		// enviant un boolean.
		// GenericMethods.imprimirArguments("Hola", 5, true);
		
		// Aquest funciona ja que el tercer parametre ha de ser un int i aqui ho es.
		GenericMethods.imprimirArguments(new Persona("Christian", "Amor", 25), "Buenos Dias", 365);

	}

}

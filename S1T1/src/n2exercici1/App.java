package n2exercici1;

public class App {

	public static void main(String[] args) {

		Smartphone sm1 = new Smartphone("Iphone", 11);
		
		// Accedeixo al metode trucar de la clase telefon 
		// a partir d'un objecte de la seva subclasse.
		sm1.trucar("658870919");
		
		// Accedeixo al metodes implementats de les interficies
		// a partir d'un objecte de la clase smartphone
		sm1.alarma();
		sm1.fotografiar();
		
	}

}

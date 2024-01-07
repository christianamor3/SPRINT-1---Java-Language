package n1exercici2;

@SuppressWarnings("deprecation")

public class App {

	public static void main(String[] args) {

		TreballadorOnline tr1 = new TreballadorOnline("Christian", "Amor", 12);
		
		tr1.decirNombre();
		
		TreballadorPresencial tr2 = new TreballadorPresencial("Bran", "Rodriguez", 15);
		
		tr2.decirGastoDeGasolina();
		
	}

}

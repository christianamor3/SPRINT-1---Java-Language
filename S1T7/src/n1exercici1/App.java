package n1exercici1;

public class App {

	public static void main(String[] args) {

		TreballadorOnline tr1 = new TreballadorOnline("Christian", "Amor", 12);
		
		System.out.println("El treballador Online cobra " + tr1.calcularSou(144));
		
		TreballadorPresencial tr2 = new TreballadorPresencial("Bran", "Rodriguez", 12);
		
		System.out.println("El treballador Presencial cobra " + tr2.calcularSou(144));
		
		
	}

}

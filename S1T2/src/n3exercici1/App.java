package n3exercici1;

public class App {

	public static void main(String[] args) {
		
		Cine cine1 = new Cine();
		boolean seguirBucle=true;
		
		while (seguirBucle) {
			seguirBucle = cine1.iniciar(seguirBucle);
		}
	}
}

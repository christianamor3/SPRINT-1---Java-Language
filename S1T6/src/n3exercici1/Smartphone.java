package n3exercici1;

public class Smartphone implements Telefon{

	
	@Override
	public void trucar(int numTelf) {
		System.out.println("El telefon " + numTelf + " esta trucant");
		
	}
	
	public void ferFotos() {
		System.out.println("Estic fent una fotografia");
		
	}

	
	
}

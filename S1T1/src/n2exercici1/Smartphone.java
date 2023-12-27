package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

	public Smartphone(String marca, int model) {
		super(marca, model);
	}

	
	@Override
	public void alarma() {
		System.out.println("Està sonant l'alarma");	

	}

	@Override
	public void fotografiar() {
		System.out.println("S'està fent una foto");	
		}

}

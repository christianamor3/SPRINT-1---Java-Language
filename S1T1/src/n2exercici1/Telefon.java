package n2exercici1;

public class Telefon {

	protected String marca;
	protected int model;
	
	public Telefon(String marca, int model) {
		this.marca = marca;
		this.model = model;
	}
	
	
	public void trucar(String numTelf) {
		System.out.println("S'està trucant al " + numTelf);
	}
}

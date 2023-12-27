package n1exercici1;

public abstract class Instrumentos {

	protected String nombre;
	protected int precio;
	
	public Instrumentos(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public abstract void tocar();
	
	
}

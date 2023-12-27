package n3exercici1;

public abstract class Noticia {

	protected String titular;
	protected String text;
	
	
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
	}


	public final String getTitular() {
		return titular;
	}


	public final void setTitular(String titular) {
		this.titular = titular;
	}


	public void calcularPreuNoticia() {
	}
	
	
	public void calcularPuntuacioNoticia() {
	}
	
}

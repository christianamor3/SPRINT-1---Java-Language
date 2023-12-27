package n3exercici1;

public class F1 extends Noticia {

	String escuderia;

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	@Override
	public void calcularPreuNoticia() {
		int precioInicial=100;
		if (escuderia.equalsIgnoreCase("Ferrari")||escuderia.equalsIgnoreCase("Mercedes")) {
			precioInicial+=50;
		}
		System.out.println("Aquesta noticia de F1 té un preu de " + precioInicial);
		}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntsInicial=4;
		if (escuderia.equalsIgnoreCase("Ferrari")||escuderia.equalsIgnoreCase("Mercedes")) {
			puntsInicial+=2;
		}
		System.out.println("Aquesta noticia de F1 té una puntuacio de " + puntsInicial);
		}
}

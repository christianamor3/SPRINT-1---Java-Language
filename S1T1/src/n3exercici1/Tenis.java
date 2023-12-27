package n3exercici1;

public class Tenis extends Noticia{

	String competicio;
	String tenistes;
	
	public Tenis(String titular, String competicio, String tenistes) {
		super(titular);
		this.competicio = competicio;
		this.tenistes = tenistes;
	}
	
	public void calcularPreuNoticia() {
		int precioInicial=150;
		if (tenistes.equalsIgnoreCase("Federer")||tenistes.equalsIgnoreCase("Nadal")||tenistes.equalsIgnoreCase("Djokovic")) {
			precioInicial+=100;
		}
		System.out.println("Aquesta noticia de Tenis té un preu de " + precioInicial);
		}
	

	@Override
	public void calcularPuntuacioNoticia() {
		int puntsInicial=4;
		if (tenistes.equalsIgnoreCase("Federer")||tenistes.equalsIgnoreCase("Nadal")||tenistes.equalsIgnoreCase("Djokovic")) {
			puntsInicial+=3;
		}
		System.out.println("Aquesta noticia de Tenis té una puntuacio de " + puntsInicial);
		}
	

	
}

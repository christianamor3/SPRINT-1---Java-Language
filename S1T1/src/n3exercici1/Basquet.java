package n3exercici1;

public class Basquet extends Noticia {

	String competicio;
	String club;
	
	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}

	@Override
	public void calcularPreuNoticia() {
		int precioInicial=250;
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			precioInicial+=75;
		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			precioInicial+=75;
		}
	
		System.out.println("Aquesta noticia de Basquet té un preu de " + precioInicial);
		}
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntsInicial=4;
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			puntsInicial+=3;
		} else if (competicio.equalsIgnoreCase("ACB")) {
			puntsInicial+=2;
		}
		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			puntsInicial+=1;
		}
		
		System.out.println("Aquesta noticia de Basquet té una puntuacio de " + puntsInicial);
	}
	
	

}

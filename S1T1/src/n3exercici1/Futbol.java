package n3exercici1;

public class Futbol extends Noticia {

	String competicio;
	String club;
	String jugador;
	
	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}

	@Override
	public void calcularPreuNoticia() {
		int precioInicial=300;
		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			precioInicial+=100;
		}
		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			precioInicial+=100;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres")||club.equalsIgnoreCase("Benzema")) {
			precioInicial+=50;
		}
		
		System.out.println("Aquesta noticia de futbol té un preu de " + precioInicial);
	}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntsInicial=5;
		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			puntsInicial+=3;
		} else if (competicio.equalsIgnoreCase("Lliga")) {
			puntsInicial+=2;
		}
		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			puntsInicial+=1;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres")||club.equalsIgnoreCase("Benzema")) {
			puntsInicial+=1;
		}
		
		System.out.println("Aquesta noticia de futbol té una puntuacio de " + puntsInicial);
	}


}

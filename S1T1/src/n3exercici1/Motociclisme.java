package n3exercici1;

public class Motociclisme extends Noticia {

	String equip;

	public Motociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}

	@Override
	public void calcularPreuNoticia() {
		int precioInicial=100;
		if (equip.equalsIgnoreCase("Honda")||equip.equalsIgnoreCase("Yamaha")) {
			precioInicial+=50;
		}
		System.out.println("Aquesta noticia de Motociclisme té un preu de " + precioInicial);
		}

	@Override
	public void calcularPuntuacioNoticia() {
		int puntsInicial=3;
		if (equip.equalsIgnoreCase("Honda")||equip.equalsIgnoreCase("Yamaha")) {
			puntsInicial+=3;
		}
		System.out.println("Aquesta noticia de F1 té una puntuacio de " + puntsInicial);
		}

}

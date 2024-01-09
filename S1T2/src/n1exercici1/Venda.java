package n1exercici1;

import java.util.ArrayList;

public class Venda {
	
	private int preuTotal;
	private ArrayList <Producte> productes;

	
	public Venda() {
		this.preuTotal=0;
		this.productes = new ArrayList<>();
	}

	public int getPreuTotal() {
		return preuTotal;
	}


	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void calcularTotal() throws VendaBuidaException {
			if (productes.size()==0) {
				throw new VendaBuidaException();
			} else {
				for (int i = 0; i<=productes.size();i++) {
					preuTotal+=productes.get(i).getPreu();
				}
			}
		System.out.println("La suma del preu de tots els productes es de " + preuTotal + " €");
	}
}


package n1exercici1;

public class VendaBuidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public VendaBuidaException() {
		super("Per fer una venda primer has d’afegir productes");
	}
	
}

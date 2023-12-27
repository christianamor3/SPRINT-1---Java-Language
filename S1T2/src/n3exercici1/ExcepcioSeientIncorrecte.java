package n3exercici1;

public class ExcepcioSeientIncorrecte extends Exception{

	private static final long serialVersionUID = 1L;

	
	public ExcepcioSeientIncorrecte() {
		super("El seient que has introduït no existeix");
	}
}

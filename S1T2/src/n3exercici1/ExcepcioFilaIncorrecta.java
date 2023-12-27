package n3exercici1;

public class ExcepcioFilaIncorrecta extends Exception{

	private static final long serialVersionUID = 1L;

	
	public ExcepcioFilaIncorrecta() {
		super("La fila que has introduït no existeix");
	}
}

package n3exercici1;

public class ExcepcioButacaOcupada extends Exception{

	private static final long serialVersionUID = 1L;

	
	public ExcepcioButacaOcupada() {
		super("La butaca ja està ocupada");
	}
}

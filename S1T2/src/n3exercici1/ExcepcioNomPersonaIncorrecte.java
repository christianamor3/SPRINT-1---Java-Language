package n3exercici1;

public class ExcepcioNomPersonaIncorrecte extends Exception{

	private static final long serialVersionUID = 1L;

	
	public ExcepcioNomPersonaIncorrecte() {
		super("El nom de la persona no respon al format");
	}
}

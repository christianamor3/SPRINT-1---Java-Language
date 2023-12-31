package n1exercici3;

public class LlençaException {

	public int saberIndice(int valorIndice) {
		
		int[] numeros = {10,33,55};
		
		int numSolucion=0;
		
		if (valorIndice==0) {
			numSolucion=10;
		} else if(valorIndice==1) {
			numSolucion=33;
		} else if(valorIndice==2) {
			numSolucion=55;
		} else if(valorIndice>2) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return numSolucion;
	}
}

package n1exercici2;

public class GenericMethods <T, F, G>{

	T tipoGenerico;
	F tipoGenerico2;
	G tipoGenerico3;
	
	public static <T, F, G> void imprimirArguments(T tipoGenerico, F tipoGenerico2, G tipoGenerico3) {
		System.out.println(tipoGenerico);
		System.out.println(tipoGenerico2);
		System.out.println(tipoGenerico3);

	}
	
	
	
	
}

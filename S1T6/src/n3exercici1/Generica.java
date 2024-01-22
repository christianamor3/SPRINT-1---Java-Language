package n3exercici1;

public class Generica <T, E>{

	public static <T extends Telefon> void returnT(T tipoGenericoLimitTelefon) {
		tipoGenericoLimitTelefon.trucar(12345678);
		// tipoGenericoLimitsTelefon.ferFotos();
		
	}
	
	public static <E extends Smartphone> void returnE(E tipoGenericoLimitSmartphone) {
		tipoGenericoLimitSmartphone.trucar(658596743);
		tipoGenericoLimitSmartphone.ferFotos();
		
	}
	
}

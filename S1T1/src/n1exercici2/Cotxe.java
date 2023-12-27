package n1exercici2;

public class Cotxe {

	private static final String marca = "Ferrari";
	private static int model = 488;
	private final int potencia;
	
	/* Els atributs marca i model pertanyen a la classe al ser static,
	la potencia és lúnic atribut que pertany a l'objecte i, que, 
	per tant, puc afegir-lo al metode constructor. *
	
	/* La marca, al ser final, un cop declarada sempre tindrà
	 el mateix valor*/
	
	public Cotxe(int potencia) {
		this.potencia = potencia;
	}
	
	public static void frenar() {
		System.out.println("El vehicle esta frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle esta accelerant");

	}
	
	
	public static void returnMarca() {
		System.out.println("El cotxe es un " + marca);
	}
	
	public static void returnModel() {
		System.out.println("El cotxe es un " + marca + " modelo " + model);

	}
	
	public void returnPotencia() {
		System.out.println("El cotxe te una potencia de " + potencia + " caballs");
	}
}

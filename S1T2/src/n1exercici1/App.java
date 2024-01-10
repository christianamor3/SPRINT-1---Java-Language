package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		Venda venda1 = new Venda();
		Venda venda2 = new Venda();
		
		/* Llamo al metodo sin añadir ningun objeto a la lista
		para provocar la primera excepcion */
		
		try {
			venda1.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		Producte pr1 = new Producte("Movil", 200);
		Producte pr2 = new Producte("Funda", 10);
		Producte pr3 = new Producte("Casco", 75);
		
		/* Creo objetos de tipo Producte y los añado a la ArrayList
		 , pero provocando una excepcion de ArrayIndexOutOfBounds al poner un =.
		 */
		venda1.getProductes().add(pr1);
		venda2.getProductes().add(pr2);
		venda1.getProductes().add(pr3);
		
		try {
			venda1.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			venda2.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		

	}

}

package n2exercici1;

public class ExcepcioRestaurantCreat extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcepcioRestaurantCreat() {
		super("Aquest restaurant ja existeix");
	}
}

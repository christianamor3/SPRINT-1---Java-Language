package n1exercici2;

public class CalculoDNI {

	public char calculoLetraDNI(int numeroDNI) {
		char letraDNI = 0;
		
		if (numeroDNI>=1555555 && numeroDNI<2000000) {
			letraDNI='A';
		} else if (numeroDNI<3000000) {
			letraDNI='B';
		} else if (numeroDNI<4000000) {
			letraDNI='C';
		} else if (numeroDNI<5000000) {
			letraDNI='D';
		} else if (numeroDNI<6000000) {
			letraDNI='E';
		} else if (numeroDNI<7000000) {
			letraDNI='F';
		} else if (numeroDNI<8000000) {
			letraDNI='G';
		} else if (numeroDNI<9000000) {
			letraDNI='H';
		} else if (numeroDNI<9999999) {
			letraDNI='I';
		}	
		
		return letraDNI;
		
	}
	
}

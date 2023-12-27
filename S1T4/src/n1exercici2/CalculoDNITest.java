package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDNITest {

	@Test
	void numDNIMenosde2MDeberiaSerA() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(1999999)=='A');
	}
	
	
	@Test
	void num15MDeberiaSerA() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(1555555)=='A');
	}
	
	@Test
	void numDNIMenosde3MDeberiaSerB() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(2999999)=='B');
	}
	
	@Test
	void numDNIMenosde4MDeberiaSerC() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(3999999)=='C');
	}
	
	@Test
	void numDNIMenosde5MDeberiaSerD() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(4999999)=='D');
	}
	
	@Test
	void numDNIMenosde6MDeberiaSerE() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(5999999)=='E');
	}
	
	@Test
	void numDNIMenosde7MDeberiaSerF() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(6999999)=='F');
	}
	
	@Test
	void numDNIMenosde8MDeberiaSerG() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(7999999)=='G');
	}
	
	@Test
	void numDNIMenosde9MDeberiaSerH() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(8999999)=='H');
	}
	
	@Test
	void num9MDeberiaSerI() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(9000000)=='I');
	}
	
	@Test
	void numDNIMenosde10MDeberiaSerI() {
		CalculoDNI calculoDNI = new CalculoDNI();
		assertTrue(calculoDNI.calculoLetraDNI(9999998)=='I');
	}

}

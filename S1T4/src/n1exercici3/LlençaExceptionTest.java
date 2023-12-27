package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LlençaExceptionTest {

	@Test
	void ArrayIndexOutOfBoundsException() {
		LlençaException llença = new LlençaException();
		assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> {
					llença.saberIndice(3);
				});
	}

	@Test
	void valorDeberiaSer44() {
		LlençaException llença = new LlençaException();
		assertEquals(55, llença.saberIndice(2));
		
	}
	
}

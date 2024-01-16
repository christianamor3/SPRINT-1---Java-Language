package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LlençaExceptionTest {
	
	LlençaException llença = null;
	
	@BeforeEach
	public void setTestUp() {
		llença = new LlençaException();
	}
	
	
	@Test
	void ArrayIndexOutOfBoundsException() {
		assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> {
					llença.saberIndice(3);
				});
	}

	
}

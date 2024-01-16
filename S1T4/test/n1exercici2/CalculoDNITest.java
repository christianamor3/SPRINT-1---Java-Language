package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculoDNITest {

	CalculoDNI calculoDNI = null;
	
	@BeforeEach
	public void setTestUp() {
		calculoDNI = new CalculoDNI();
	}
	
	
	@ParameterizedTest
	@MethodSource("numeroLetra")
	void testCalculoLetraDNI(int numDNI, char letra) {
		assertTrue(calculoDNI.calculoLetraDNI(numDNI)==letra);
	}
	
	private static Stream<Arguments> numeroLetra(){
		return Stream.of(
				Arguments.of(1999999, 'A'),
				Arguments.of(1555555, 'A'),
				Arguments.of(2999999, 'B'),
				Arguments.of(3999999, 'C'),
				Arguments.of(4999999, 'D'),
				Arguments.of(5999999, 'E'),
				Arguments.of(6999999, 'F'),
				Arguments.of(7999999, 'G'),
				Arguments.of(8999999, 'H'),
				Arguments.of(9000000, 'I'),
				Arguments.of(9999998, 'I')
				);
				
	}
	
}

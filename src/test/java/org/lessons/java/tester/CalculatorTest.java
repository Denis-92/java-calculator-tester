package org.lessons.java.tester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	static Calculator testingCalculator;
	
	@BeforeAll
	static void setupTestCalculator() {
		testingCalculator = new Calculator();
	}
	
	
	@Test
	@DisplayName("verifica somma")
	void testAdd() {
		float variablesAdded = testingCalculator.add(2.45F, 3.14F);
		assertEquals(5.59F, variablesAdded, "La somma deve essere 5.59");
	}
	
	@Test
	@DisplayName("verifica differenza")
	void testSubtract() {
		float variablesSubtracted = testingCalculator.subtract(7F, 3F);
		assertEquals(4F, variablesSubtracted, "La differenza deve essere 4");
	}
	
	@Test
	@DisplayName("verifica eccezzione nella divisione")
	void testDivideException() {
		assertThrows(IllegalArgumentException.class,
		() -> testingCalculator.divide(10F, 0F),
		"Mi aspetto il lancio dell'eccezzione IllegalArgumentException");
	}
	
	@Test
	@DisplayName("verifica divisione")
	void testDivide() {
		float variablesDivided = testingCalculator.divide(15F, 5F);
		assertEquals(3F, variablesDivided, "La divisione deve dare 3");
	}
	
	@Test
	@DisplayName("verifica prodotto")
	void testMultiply() {
		float variablesMultiplied = testingCalculator.multiply(3F, 4F);
		assertEquals(12F, variablesMultiplied, "Il prodotto deve essere 12");
	}
	
}

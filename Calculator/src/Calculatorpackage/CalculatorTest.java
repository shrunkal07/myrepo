package Calculatorpackage;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTestcase{
	
	@Test
	public void testAdd() {
		TestCalculator calculator = new TestCalculator();
		int result = calculator.add(2, 2);
		if(result != 4) {
	    Assert.fail();
		}
	}
	
	@Test
	public void testSub() {
		TestCalculator calculator = new TestCalculator();
		Assert.assertEquals(0, calculator.sub(2, 2));
     }
	
	@Test
	public void testMul() {
		TestCalculator calculator = new TestCalculator();
		Assert.assertEquals(0, calculator.mul(6,0));
	}
	
	@Test
	public void testDiv() {
		TestCalculator calculator = new TestCalculator();
		double resultDiv = calculator.div(3,0);
		Assert.assertEquals("Divide by zero",true,Double.isInfinite (resultDiv);
	}
}
	

		
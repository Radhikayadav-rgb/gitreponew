package com.staragile;
import com.staragile.Calculator;
//import junit.framework.Assert;
import org.junit.Test;
import org.junit.Assert; 
import org.junit.Before;


@SuppressWarnings("deprecation")
public class CalculatorTest {
	private Calculator objCalcUnderTest;
	@Before
	public void setUp() {
		//Arrange
		objCalcUnderTest = new Calculator();
		}
	@Test
    public void testsum() {
		int a = 15; int b = 20; 
		int expectedResult = 35;
		long result=objCalcUnderTest.sum(a, b);
    	Assert.assertEquals(expectedResult,result);
    	
    }
	@Test
    public void testsubtract() {
		int a = 30; int b = 20; 
		int expectedResult = 10;
		long result=objCalcUnderTest.subtract(a, b);
    	Assert.assertEquals(expectedResult,result);
    	
	}
	@Test
	public void testmultiply() {
		int a = 10; int b = 20; 
		int expectedResult = 200;
		long result=objCalcUnderTest.multiply(a, b);
    	Assert.assertEquals(expectedResult,result);
	}
	@Test
	public void testdivision() {
		int a = 56; int b = 10; 
		double expectedResult = 5.6; 
		double result = objCalcUnderTest.division(a, b);
		Assert.assertEquals(expectedResult, result,0.00005); 
	}
}

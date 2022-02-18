
import java.math.BigInteger;

import org.junit.Assert;

import org.junit.Test;



public class FunctionsTest {

	@Test
	public void should_calculate_factorial() {
		
//	given		
		int number = 10;
		int number2 = 7;
		int number3 = 3;
		
//	then	
		Assert.assertEquals(Functions.factorial(number),new BigInteger("3628800"));
		Assert.assertEquals(Functions.factorial(number2),new BigInteger("5040"));
		Assert.assertEquals(Functions.factorial(number3),new BigInteger("6"));
		
	}
	
	@Test
	public void should_not_calculate_factorial() {
		
//	given
		int number = 2;
		int number2 = 5;
		int number3 = 8;
		
//	then
		Assert.assertNotEquals(Functions.factorial(number),new BigInteger("10232"));
		Assert.assertNotEquals(Functions.factorial(number2),new BigInteger("1234"));
		Assert.assertNotEquals(Functions.factorial(number3),new BigInteger("534"));
		
	}
	
	@Test
	public void should_calculate_fibonacci() {
		
//		given
		
		int number = 5;		
		int number2 = 12;		
		int number3 = 2;
		
//		then
		
		Assert.assertEquals(Functions.fibonacci(number), 5);
		Assert.assertEquals(Functions.fibonacci(number2), 144);
		Assert.assertEquals(Functions.fibonacci(number3), 1);
	}
	
	@Test
	public void should_not_calculate_fibonacci() {
		
//		given
		
		int number = 13;		
		int number2 = 6;		
		int number3 = 0;
		
//		then
		
		Assert.assertNotEquals(Functions.fibonacci(number), 15);
		Assert.assertNotEquals(Functions.fibonacci(number2), 17);
		Assert.assertNotEquals(Functions.fibonacci(number3), 12);
	}
	
	@Test
	public void should_calculate_fibonacciRecursion() {
		
//		given
		
		int number = 1;		
		int number2 = 8;		
		int number3 = 11;
		
//		then
		
		Assert.assertEquals(Functions.fibonacciRecursion(number), 1);
		Assert.assertEquals(Functions.fibonacciRecursion(number2), 21);
		Assert.assertEquals(Functions.fibonacciRecursion(number3), 89);
	}
	
	@Test
	public void should_not_calculate_fibonacciRecursion() {
		
//		given
		
		int number = 3;		
		int number2 = 1;		
		int number3 = 9;
		
//		then
		
		Assert.assertNotEquals(Functions.fibonacciRecursion(number), 25);
		Assert.assertNotEquals(Functions.fibonacciRecursion(number2), 7);
		Assert.assertNotEquals(Functions.fibonacciRecursion(number3), 121);
	}
	
	
	@Test
	public void should_calculate_tribonacci() {
		
//		given
		
		int number = 10;	
		int number2 = 7;
		int number3 = 3;
		
//		then
		
		Assert.assertEquals(Functions.tribonacci(number), 44);
		Assert.assertEquals(Functions.tribonacci(number2), 7);
		Assert.assertEquals(Functions.tribonacci(number3), 1);
	}
	
	@Test
	public void should_not_calculate_tribonacci() {
		
//		given
		
		int number = 13;		
		int number2 = 6;		
		int number3 = 0;
		
//		then
		
		Assert.assertNotEquals(Functions.tribonacci(number), 1225);
		Assert.assertNotEquals(Functions.tribonacci(number2), 127);
		Assert.assertNotEquals(Functions.tribonacci(number3), 5);
	}
	
	@Test
	public void should_calculate_tribonacciRecursion() {
		
//		given
		
		int number = 1;	
		int number2 = 12;
		int number3 = 7;
		
//		then
		
		Assert.assertEquals(Functions.tribonacciRecursion(number), 0);
		Assert.assertEquals(Functions.tribonacciRecursion(number2), 149);
		Assert.assertEquals(Functions.tribonacciRecursion(number3), 7);
	}
	
	@Test
	public void should_not_calculate_tribonacciRecursion() {
		
//		given
		
		int number = 4;		
		int number2 = 2;		
		int number3 = 9;
		
//		then
		
		Assert.assertNotEquals(Functions.tribonacciRecursion(number), 125);
		Assert.assertNotEquals(Functions.tribonacciRecursion(number2), 27);
		Assert.assertNotEquals(Functions.tribonacciRecursion(number3), 1125);
	}
	
	
	
	
}

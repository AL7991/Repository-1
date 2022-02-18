
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
	
	
	
	
	
	
	
}

import java.math.BigInteger;

public class Functions {

	
	public static BigInteger factorial(int n) {
		
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
        	result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
	
	
	public static long fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		long a = 1;
		long b = 1;
		for (int i = 3;i <= n ; i++) {
			
			long c = a + b;
			a = b;
			b = c;
			
		}
		return b;
		
	}
	
	
	public static long fibonacciRecursion(int n)
    {
    if (n <= 1) {
       return n;
    }
    return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
	
	
	public static long tribonacci(int n) {
		long a = 0;
		long b = 0;
		long c = 1;
		if(n <= 0 || n == 1 || n == 2) {
			return 0;
		}
		for(int i = 4; i <= n ; i++) {		
			long newNumber = a + b + c;
			a = b;
			b = c;
			c = newNumber;
		}
		return c;
	}

	
	public static long tribonacciRecursion(int n) {
				
		if(n <= 0 || n == 1) {
			return 0;
		}else if(n == 2) { 
			return 0;
		}else if(n == 3) { 
			return 1;
		}else{
			return tribonacciRecursion(n-1) + tribonacciRecursion(n-2) + tribonacciRecursion(n-3);
		}
	}
	
}

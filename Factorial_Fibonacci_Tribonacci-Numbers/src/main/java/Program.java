import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		try {
			String numberTxt = JOptionPane.showInputDialog("Give some number");
			
			int number = Integer.parseInt(numberTxt);

			if(number > 0) {
				
				JOptionPane.showMessageDialog(null, "The Factorial for the number " + number + " is " + Functions.factorial(number));
				
				JOptionPane.showMessageDialog(null, "The Fibonacci sequence for the number " + number + " is " + Functions.fibonacci(number));
				
				JOptionPane.showMessageDialog(null, "The Fibonacci sequence(recursion) for the number " + number + " is " + Functions.fibonacciRecursion(number));
				
				JOptionPane.showMessageDialog(null, "The Tribonacci sequence for the number " + number + " is " + Functions.tribonacci(number));
				
				JOptionPane.showMessageDialog(null, "The Tribonacci sequence(recursion) for the number " + number + " is " + Functions.tribonacciRecursion(number));
				
			} else {
				JOptionPane.showMessageDialog(null, "The given number must be greater than zero.");
			}
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,
					"Other error " + e, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}

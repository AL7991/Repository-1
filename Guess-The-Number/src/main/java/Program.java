import java.util.Random;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
	Random random = new Random();
	int x = random.nextInt(1000);
	try {
		String numberTxt = JOptionPane.showInputDialog("Guess what number from 1 to 1000 I mean?");
		int number = Integer.parseInt(numberTxt);
		int attemptsNumber = 0;
		
		
		while (true)
			
		if(number > 1000 || number <= 0) {	
			JOptionPane.showMessageDialog(null,"You entered a number out of range, please try again (range from 1 to 1000)");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			
		}else if ( x < number - 100) {
			JOptionPane.showMessageDialog(null,"Try again. You entered a number too high, try a smaller number");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if ( x < number - 10) {
			JOptionPane.showMessageDialog(null,"Try again. You entered a number too high, try a smaller number but you are close");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if ( x < number ) {
			JOptionPane.showMessageDialog(null,"Try again. You entered a number too high, try a smaller number but you are very close");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if (x > number + 100) {
			JOptionPane.showMessageDialog(null,"Try again. The number is too small, try a larger number");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if (x > number + 10) {
			JOptionPane.showMessageDialog(null,"Try again. The number is too small, try a larger number but you are close");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if (x > number ) {
			JOptionPane.showMessageDialog(null,"Try again. The number is too small, try a larger number but you are very close");
			numberTxt = JOptionPane.showInputDialog("Enter the number");
			number = Integer.parseInt(numberTxt);
			attemptsNumber++;
			
		}else if (x == number) {
			JOptionPane.showMessageDialog(null,"Good Answer. Number of attempts: " + attemptsNumber);
			break;
		}
		
	} catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null,
				"Invalid number format or canceled", "Error", JOptionPane.ERROR_MESSAGE);
	} catch(Exception e) {
		JOptionPane.showMessageDialog(null,
				"Other error " + e, "Error", JOptionPane.ERROR_MESSAGE);
	}
			

	}

}

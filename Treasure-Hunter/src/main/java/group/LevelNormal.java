package group;

import java.util.Random;
import java.util.Scanner;

public class LevelNormal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int xTreasurePosition = r.nextInt(10);

		int xPlayerPosition = r.nextInt(9);

		int yTreasurePosition = r.nextInt(10);

		int yPlayerPosition = r.nextInt(9);
		
		System.out.println("Welcome to the Find Lost Treasure game");
		System.out.println("Win conditions: treasure found");
		System.out.println("Losing Conditions: How you get off the board");
		System.out.println("Navigate according to the WSAD convention");
		

		
		if(yPlayerPosition == 0) {
			yPlayerPosition++;
		}
		
		if(xPlayerPosition == 0) {
			xPlayerPosition++;
		}
		
		while(yTreasurePosition == yPlayerPosition && xTreasurePosition == xPlayerPosition) {
			xTreasurePosition = r.nextInt(10);
			yTreasurePosition = r.nextInt(10);
		}

		
		int attemptsNumber = 0;
		
		while (xTreasurePosition != xPlayerPosition || yTreasurePosition != yPlayerPosition) {
		
		System.out.println("which direction you want to go ? ");
		String direction = sc.next();
		
		direction = direction.trim().toLowerCase();
		
		switch(direction) {
		case "w":
			
		yPlayerPosition += 1;
				
			if(yTreasurePosition < yPlayerPosition) {
				System.out.println("You move away from the treasure ");
			}else {
				System.out.println("You are closer to the treasure ");
			}
		
		attemptsNumber += 1;
		break;
		
		case "s":
			
		yPlayerPosition -= 1;		
		
		if(yTreasurePosition > yPlayerPosition) {
			System.out.println("You move away from the treasure ");
		}else {
			System.out.println("You are closer to the treasure ");
		}
		
		attemptsNumber += 1;
		break;
		
		case "a":
		
		xPlayerPosition -= 1;
		
		if(xTreasurePosition > xPlayerPosition) {
			System.out.println("You move away from the treasure ");
		}else {
			System.out.println("You are closer to the treasure ");
		}
		
		attemptsNumber += 1;
		break;
		
		
		case "d":
		
		xPlayerPosition += 1;
		
		if(xTreasurePosition < xPlayerPosition) {
			System.out.println("You move away from the treasure ");
		}else {
			System.out.println("You are closer to the treasure ");
		}
		
		attemptsNumber += 1;
		break;
		
		default :
			System.out.println("Follow the WSAD convention only");
		
		}
		
		if(xPlayerPosition < 0 || yPlayerPosition < 0) {
			System.out.println("You have lost");
			System.exit(0);
		}
		if(xPlayerPosition > 9 || yPlayerPosition > 9) {
			System.out.println("You have lost");
			System.exit(0);
		}
		
		}
		
		System.out.println("Congratulations, a treasure has been found ");
		System.out.println("Number of attempts :" + attemptsNumber);
				
		
	}

}

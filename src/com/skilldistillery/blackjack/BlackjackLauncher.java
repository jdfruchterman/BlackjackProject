package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackLauncher {

	public static void main(String[] args) {
		// think ineed to rewrite this much more simple, just y/n and throw exception otherwise
		
		String yesOrNo;
		boolean playAgain = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Blackjack. Good luck!");
		
		while (playAgain = true) {
			playAgain = false;
			// run blackjackapp
			// 
			
			System.out.println("Would you like to play again?");
			System.out.println("Respond with yes or no:");
			
			yesOrNo = scanner.nextLine();
			
			if (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no")) {
				System.out.println("Error, please type yes to play again or no to quit.");
				break;
				
			}
			if ()
		}
	}

}

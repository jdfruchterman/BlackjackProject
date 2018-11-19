package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackLauncher {

	public static void main(String[] args) {
		// think ineed to rewrite this much more simple, just y/n and throw exception otherwise
		
		System.out.println("         *  *  *        ");
		System.out.println("   Welcome to Blackjack.");
		System.out.println("         *  *  *        ");
		System.out.println("Enjoy the game and good luck!");
		System.out.println("         *  *  *        ");
		System.out.println();
		System.out.println();
		
		
		do {
			BlackJackGame game = new BlackJackGame();
			game.run();
		}  while (playAgain());
	}
			
		private static boolean playAgain() {
			System.out.println("Would you like to play again? Y/N:");
			
			Scanner scanner = new Scanner(System.in);
			String yesOrNo = scanner.nextLine();
			
			return yesOrNo.equalsIgnoreCase("Y");
		}
		

}

package com.skilldistillery.cards;

import java.util.Scanner;

public class Dealing {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("How many cards would you like to draw?");
		int numberOfCards = scanner.nextInt();
		
		if (numberOfCards <= deckOfCards.size && numberOfCards > 0) {
			
		}
		else if (numberOfCards != (int)numberOfCards)
			System.out.println("Error, invalid input");
	}

}

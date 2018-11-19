package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.BlackjackHand;
import com.skilldistillery.cards.Deck;
import com.skilldistillery.cards.Hand;

public class BlackJackGame {

	public void run() {
		Scanner scanner = new Scanner(System.in);
		Deck deck = new Deck();

		deck.shuffle();

		Hand playerHand = new BlackjackHand();
		Hand dealerHand = new BlackjackHand();

		int i = 42;
		while (i == 42) {
			i = 43;

			if (playerHand.getHandValue() == 21 && dealerHand.getHandValue() == 21) {
				System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
				System.out.println("Dealer: " + dealerHand + ", Value: " + dealerHand.getHandValue());
				System.out.println("You both hit Blackjack! It's a tie!");
				break;

			}
			if (playerHand.getHandValue() == 21 && dealerHand.getHandValue() != 21) {
				System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
				System.out.println("Dealer: " + dealerHand + ", Value: " + dealerHand.getHandValue());
				System.out.println("You hit Blackjack! You win!!");
				break;

			}
			if (playerHand.getHandValue() > 21) {
				System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
				System.out.println("Dealer: " + dealerHand + ", Value: " + dealerHand.getHandValue());
				System.out.println("You went bust! You lose!");
				break;

			} else {
				// test to see what's printing out
				System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
				System.out.println("Dealer: " + dealerHand + ", Value: " + dealerHand.getHandValue());
				// should print dealerhand but only 1, and only it's value, full playerhand
				System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
				System.out.println("Dealer: " + dealerHand + " + ?");
				System.out.println("Would you like to hit or stay?");
				String hitOrStay = scanner.nextLine();

				while (hitOrStay.equalsIgnoreCase("hit")) {
					if (hitOrStay.equalsIgnoreCase("hit")) {
						playerHand.addCard(deck.dealCard());
						System.out.println("Player: " + playerHand + ", Value: " + playerHand.getHandValue());
						System.out.println("Dealer: " + dealerHand + " + ?");
					}
					
			
				}

			}

		}

	}
}

package com.skilldistillery.cards;

public class BlackJackMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
		Hand playerHand = new BlackjackHand();

		for (int i = 0; i < 2; i++) {
			playerHand.addCard(deck.dealCard());
		}
		System.out.println(playerHand);
		System.out.println(playerHand.getHandValue());

//		for (int i = 0; i < 52; i++) {
//		deck.shuffle();
//		Card card = deck.dealCard();
//		System.out.println(card);

//		}
	}

}

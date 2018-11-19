package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Hand;

public class BJDealerHand extends Hand {

	private List<Card> hand = new ArrayList<>();


	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return super.getHandValue();
	}

	@Override
	public void addCard(Card card) {
		// TODO Auto-generated method stub
		super.addCard(card);
	}

	@Override
	public void clearHand() {
		// TODO Auto-generated method stub
		super.clearHand();
	}

	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		return super.getCards();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

//	public int getDealerValue () {
//		int handValue = 0;
//		for (int i = 1; i < hand.size(); i++) {
//			// loop through hand, add up values of ranks
//		handValue = handValue + hand.get(i).getValue();
//		
//		}
//		return handValue;
//	}
//	public String dealerMysteryToString() {
//		String string = null;
//		for (int i = 1; i < (hand.size()); i++) {
//			Card card = hand.get(i);
//			string = string + card.toString();
//		}
//		return string;
//	}
//
//	@Override
//	public String get(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}


}

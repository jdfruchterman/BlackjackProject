package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> hand = new ArrayList<>();


public Hand() {
	Suit[] suits = Suit.values();
	Rank[] ranks = Rank.values();
	
}
public int getHandValue() {
	int handValue = 0;
	for (int i = 0; i < hand.size(); i++) {
		// loop through hand, add up values of ranks
	handValue = handValue + hand.get(i).getValue();
	
	}
	return handValue;
}


public void addCard(Card card) {
	// add card to hand
	hand.add(card);
	
}
public void clearHand() {
}
public List<Card> getCards(){
	return hand;
}
@Override
public String toString() {
	//needs completion
	return "" + hand;
}



}

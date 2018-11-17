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
	// loop through hand, add up values of ranks
	return handValue;
}
public void addCard() {
	// add card to hand
	hand.add();
	
}
public void clearHand() {
	// loop through list and set each value to null
}
public List<Card> getCards(){
	return hand;
}
@Override
public String toString() {
	return "Hand [hand=" + hand + "]";
}


}

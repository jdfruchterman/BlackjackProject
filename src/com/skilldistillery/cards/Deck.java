package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deckOfCards = new ArrayList<>();

	public Deck() {

		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (Rank rank : ranks) {
			for (Suit suit : suits) {

				Card card = new Card(rank, suit);

				deckOfCards.add(card);
			}

		}
	}

	public int checkDeckSize() {
		int deckSize = deckOfCards.size();
		return deckSize;
	}

	public Card dealCard() {

		return deckOfCards.remove(0);

	}

	public void shuffle() {

		Collections.shuffle(deckOfCards);
	}

}

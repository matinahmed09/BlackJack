package com.company;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Card {
    private Suit suit;
    private CardValue cardValue;
    private int number;

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
        this.number = MapCardToValue.maptocard.get(cardValue);
    }

    public Suit getSuit() {
        return suit;
    }



    public CardValue getCardValue() {
        return cardValue;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardValue=" + cardValue +
                '}';
    }
}

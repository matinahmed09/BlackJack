package com.company;

import java.util.List;

public class Card {
    private Suit suit;
    private int number;

    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", number=" + number +
                '}';
    }
}

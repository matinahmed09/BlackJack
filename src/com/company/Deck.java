package com.company;


import java.util.ArrayList;
import java.util.List;

public class Deck {
   private List<Card> card = new ArrayList<>();
   private  CardValue curCard;

   public Deck(List<Card> card, CardValue curCard) {
      this.card = card;
      this.curCard = curCard;
   }

   public List<Card> getCard() {
      return card;
   }

   public void setCard(List<Card> card) {
      this.card = card;
   }

   public CardValue getCurCard() {
      return curCard;
   }

   public void setCurCard(CardValue curCard) {
      this.curCard = curCard;
   }

   @Override
   public String toString() {
      return "Deck{" +
              "card=" + card +
              ", curCard=" + curCard +
              '}';
   }
}

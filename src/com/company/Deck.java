package com.company;


import java.util.*;

public class Deck {
   private List<Card> deckofcards = new ArrayList<>();

   public Deck(){
      for (CardValue cardValue: CardValue.values()){
         for(Suit suit:Suit.values()){
            deckofcards.add(new Card(suit,cardValue));
         }
      }
   }


   public void shuffleCardDeck(List<Card> deckofcards){

   }



   public Random random() {
      Random random = new Random();
      return random;
   }


   public List<Card> getDeckofcards() {
      return deckofcards;
   }

   public void setDeckofcards(List<Card> deckofcards) {
      this.deckofcards = deckofcards;
   }
}



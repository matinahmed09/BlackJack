package com.company;


import java.util.*;

public class Deck {
   private List<Card> deckofcards = new ArrayList<>();

   public Deck(){

   }

   public List<Card> generateDeck(){
      for (CardValue cardValue: CardValue.values()){
         for(Suit suit:Suit.values()){
            deckofcards.add(new Card(suit,cardValue));
         }
      }
      return deckofcards;
   }
   public List<Card> shuffleCards(){
      Collections.shuffle(generateDeck());
      return deckofcards;

   }
   public Card drawCard(){
      Card drawCard = deckofcards.get(0);
      deckofcards.remove(0);
      return drawCard;
   }





   public List<Card> getDeckofcards() {
      return deckofcards;
   }


   @Override
   public String toString() {
      return "Deck{" +
              "deckofcards=" + deckofcards +
              '}';
   }
}



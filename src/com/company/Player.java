package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private List<Card> inhandCard = new ArrayList<>();

    public Player(String name) {
       this.name =name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCardinHandValue(){
        int cardvalueinhand = 0;
        for (Card card: getinhandCard()){
            cardvalueinhand+= card.getNumber();
        }
        return cardvalueinhand;
    }

    public void addCardtoHand(Card card){

    }

    public List<Card> getinhandCard(){
        return inhandCard;


    }


}

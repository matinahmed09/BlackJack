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

    public Status playerMoves(){
        Status status;
        if (getCardinHandValue()< 17){
            status = Status.HIT;
        }
        else if (getCardinHandValue()>= 17 || getCardinHandValue()<21){
            status = Status.STICK;
        }
        else {
            status = Status.BUST;
        }
        return status;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", inhandCard=" + inhandCard +
                '}';
    }
}

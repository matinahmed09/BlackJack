package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapCardToValue {
    public static Map<CardValue, Integer> maptocard = new HashMap<>();
    public static void setCardValue(){
        maptocard.put(CardValue.Two, 2);
        maptocard.put(CardValue.Three, 3);
        maptocard.put(CardValue.Four, 4);
        maptocard.put(CardValue.Five, 5);
        maptocard.put(CardValue.Six, 6);
        maptocard.put(CardValue.Seven, 7);
        maptocard.put(CardValue.Eight, 8);
        maptocard.put(CardValue.Nine, 9);
        maptocard.put(CardValue.Ten, 10);
        maptocard.put(CardValue.Jack,10 );
        maptocard.put(CardValue.Queen, 10);
        maptocard.put(CardValue.King, 10);
        maptocard.put(CardValue.Ace, 11);

    }
}

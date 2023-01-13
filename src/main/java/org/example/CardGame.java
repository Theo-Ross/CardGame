package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    private static ArrayList<Card> deckOfCards = new ArrayList<>(52);

    public static ArrayList<Card> player1Cards = new ArrayList<>(52);

    public static ArrayList<Card> player2Cards = new ArrayList<>(52);




    public void setup(){

        String[] suits = {"♥","♣","♦","♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                deckOfCards.add(new Card(suits[i], symbols[j], j + 1));
            }
        }
    }

    public static void dealCards() {
        Collections.shuffle(deckOfCards);
        for (int i = 0; i < deckOfCards.size(); i++) {
            if (i % 2 == 0) {
                player1Cards.add(deckOfCards.get(i));
            } else {
                player2Cards.add(deckOfCards.get(i));
            }

        }
    }



    long timer =  60000;

    public long getTimer() {
        return timer;
    }

    public void setTimer(long timer) {
        this.timer = timer;
    }
}

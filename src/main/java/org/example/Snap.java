package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snap extends CardGame {

    Scanner scanner = new Scanner(System.in);

    public void play() {


        ArrayList<Card> winnings = new ArrayList<>(52);

        while (player1Cards.size() > 0 && player2Cards.size() > 0) {

            int counter = 2;

            Card player1Card = player1Cards.remove(0);
            Card player2Card = player2Cards.remove(0);

            if (counter % 2 == 0){
                System.out.println("Player 1's go");
                scanner.nextLine();
                System.out.println("Player 1's card is the " + player1Card.getSymbol() + " of " + player1Card.getSuit());
                System.out.println("Player 2's go");
                scanner.nextLine();
                System.out.println("Player 2's card is the " + player2Card.getSymbol() + " of " + player2Card.getSuit());
            } else {
                System.out.println("Player 2's go");
                scanner.nextLine();
                System.out.println("Player 2's card is the " + player2Card.getSymbol() + " of " + player2Card.getSuit());
                System.out.println("Player 1's go");
                scanner.nextLine();
                System.out.println("Player 1's card is the " + player1Card.getSymbol() + " of " + player1Card.getSuit());


            }


            winnings.add(player1Card);
            winnings.add(player2Card);


            if (player1Card.getValue() == player2Card.getValue()) {
                    if (scanner.nextLine().charAt(0) == 'p') {
                        System.out.println("SNAP! player 1 wins!");
                        player1Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                    } else if (scanner.nextLine().charAt(0) == 'q') {
                        System.out.println("SNAP! player 2 wins!");
                        player2Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                    }

            }

            System.out.println("Player one card count: " + player1Cards.size());
            System.out.println("Player two card count: " + player2Cards.size());


            if (player2Cards.size() == 0 & player1Cards.size() == 0) {
                System.out.println("It's a draw");

            } else if (player2Cards.size() == 0) {
                System.out.println("Congratulations Player 1 you are the winner");
            } else if (player1Cards.size() == 0) {
                System.out.println("Congratulations Player 2 you are the winner");
            }


        }


    }}











package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snap extends CardGame {

    Scanner scanner = new Scanner(System.in);
    CardGame cardGame = new CardGame();
    Random RANDOM = new Random();

    public void play() {

        String playerOneName = "user";

        ArrayList<Card> winnings = new ArrayList<>(52);

        int previousCardValue = 0;

        System.out.println(Phrases.SELECT_NAME.getPhrases() + playerOneName);
        playerOneName = scanner.nextLine();

        while (player1Cards.size() > 0 && player2Cards.size() > 0) {

            Card player1Card = player1Cards.remove(0);
            Card player2Card = player2Cards.remove(0);

            System.out.println(playerOneName + "'s go");
            scanner.nextLine();
            System.out.println(playerOneName+"'s card is the " + player1Card.getSymbol() + " of " + player1Card.getSuit());
            if (previousCardValue == player1Card.getValue()) {
                long startCount = System.currentTimeMillis();
                scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long userTime = endCount - startCount;
                long computerTime = RANDOM.nextInt( (int) cardGame.getTimer() );
                System.out.println(computerTime);
                System.out.println(userTime);
                if (userTime < computerTime) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println(playerOneName + " wins!");
                    player1Cards.addAll(winnings);
                    winnings.removeAll(winnings);

                }
                if (computerTime < userTime) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println("Computer wins!");
                    player2Cards.addAll(winnings);
                    winnings.removeAll(winnings);

                }
                if (userTime == computerTime) {
                    System.out.println(Phrases.COMPUTER_DRAW.getPhrases());
                }


                System.out.println("Scores on the doors : ");
                System.out.println("Player one card count: " + player1Cards.size());
                System.out.println("Player two card count: " + player2Cards.size());
            }


            System.out.println(" ");
            System.out.println("Computer's go");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Computer's card is the " + player2Card.getSymbol() + " of " + player2Card.getSuit());
            System.out.println(" ");

            previousCardValue = player2Card.getValue();


            winnings.add(player1Card);
            winnings.add(player2Card);


            if (player1Card.getValue() == player2Card.getValue()) {
                long startCount = System.currentTimeMillis();
                scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long userTime = endCount - startCount;
                long computerTime = RANDOM.nextInt(3000);
                System.out.println(computerTime);
                System.out.println(userTime);
                if (userTime < computerTime) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println(playerOneName + " wins!");
                    player1Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                }
                if (computerTime < userTime) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println("Computer wins!");
                    player2Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                }
                if (userTime == computerTime) {
                    System.out.println(Phrases.COMPUTER_DRAW.getPhrases());
                }
            }


            if (player2Cards.size() == 0 & player1Cards.size() == 0) {
                System.out.println("It's a draw");

            } else if (player2Cards.size() == 0) {
                System.out.println("Congratulations " + playerOneName + " you are the winner");
            } else if (player1Cards.size() == 0) {
                System.out.println("Computer is the winner");
            }


        }


    }
}











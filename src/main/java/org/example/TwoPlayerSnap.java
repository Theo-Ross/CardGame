package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TwoPlayerSnap extends CardGame {

    Scanner scanner = new Scanner(System.in);
    CardGame cardGame = new CardGame();

    public void play() {


        ArrayList<Card> winnings = new ArrayList<>(52);

        int previousCardValue = 0;

        String playerOneName = "player one";
        String playerTwoName = "player two";

        System.out.println(Phrases.SELECT_NAME.getPhrases() + playerOneName);
        playerOneName = scanner.nextLine();

        System.out.println(Phrases.SELECT_NAME.getPhrases() + playerTwoName);
        playerTwoName = scanner.nextLine();

        while (player1Cards.size() > 0 && player2Cards.size() > 0) {

            Card player1Card = player1Cards.remove(0);
            Card player2Card = player2Cards.remove(0);

            System.out.println(playerOneName + Phrases.TURN.getPhrases());
            scanner.nextLine();
            System.out.println(playerOneName +  "'s card is the " + player1Card.getSymbol() + " of " + player1Card.getSuit());
            System.out.println(" ");
            winnings.add(player1Card);

            if (previousCardValue == player1Card.getValue()) {
                boolean player2Steal = false;
                long startCount = System.currentTimeMillis();
                String playerOneInput = scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long playerOneTime = endCount - startCount;
                System.out.println(playerOneTime);
                if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime < cardGame.getTimer()) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println(playerOneName + " wins!");
                    player1Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                    System.out.println("Scores on the doors : ");
                    System.out.println(playerOneName + " card count: " + player1Cards.size());
                    System.out.println(playerTwoName + " card count: " + player2Cards.size());

                }
                if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime < cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_TYPING.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerTwoName + " to win!");
                    player2Steal = true;

                }
                if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime > cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_SLOW.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerTwoName + " to win!");
                    player2Steal = true;

                }
                if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime > cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_BOTH.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerTwoName + " to win!");
                    player2Steal = true;
                }

                if (player2Steal) {
                    startCount = System.currentTimeMillis();
                    String playerTwoInput = scanner.nextLine();
                    endCount = System.currentTimeMillis();
                    long playerTwoTime = endCount - startCount;
                    System.out.println(playerTwoTime);
                    if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < cardGame.getTimer()) {
                        System.out.println("SNAP!");
                        System.out.println(" ");
                        System.out.println(playerTwoName + " wins!");
                        player2Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                        System.out.println("Scores on the doors : ");
                        System.out.println("Player one card count: " + player1Cards.size());
                        System.out.println("Player two card count: " + player2Cards.size());
                    }
                    if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_TYPING.getPhrases());
                        System.out.println(" ");
                    }
                    if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_SLOW.getPhrases());
                        System.out.println(" ");
                    }
                    if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_BOTH.getPhrases());
                        System.out.println(" ");
                        System.out.println("Back to the game");
                    }
                }}


            System.out.println(playerTwoName + " go");
            scanner.nextLine();
            System.out.println(playerTwoName + "'s card is the " + player2Card.getSymbol() + " of " + player2Card.getSuit());
            winnings.add(player2Card);

            if (player2Card.getValue() == player1Card.getValue()) {
                boolean player1Steal = false;
                long startCount = System.currentTimeMillis();
                String playerTwoInput = scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long playerTwoTime = endCount - startCount;
                System.out.println(playerTwoTime);
                if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < cardGame.getTimer()) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println(playerTwoName + " wins!");
                    player2Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                    System.out.println("Scores on the doors : ");
                    System.out.println("Player one card count: " + player1Cards.size());
                    System.out.println("Player two card count: " + player2Cards.size());
                }
                if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_TYPING.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerOneName + " to win!");
                    player1Steal = true;

                    // test

                }
                if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_SLOW.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerOneName + " to win!");
                    player1Steal = true;

                }
                if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > cardGame.getTimer()) {
                    System.out.println(Phrases.WRONG_BOTH.getPhrases());
                    System.out.println(" ");
                    System.out.println("Chance for " + playerOneName + " to win!");
                    player1Steal = true;
                }

                if (player1Steal) {
                    startCount = System.currentTimeMillis();
                    String playerOneInput = scanner.nextLine();
                    endCount = System.currentTimeMillis();
                    long playerOneTime = endCount - startCount;
                    System.out.println(playerOneTime);
                    if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime < cardGame.getTimer()) {
                        System.out.println("SNAP!");
                        System.out.println(" ");
                        System.out.println(playerOneName + " wins!");
                        player1Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                        System.out.println("Scores on the doors : ");
                        System.out.println("Player one card count: " + player1Cards.size());
                        System.out.println("Player two card count: " + player2Cards.size());
                    }
                    if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime < cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_TYPING.getPhrases());
                        System.out.println(" ");
                    }
                    if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime > cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_SLOW.getPhrases());
                        System.out.println(" ");
                    }
                    if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime > cardGame.getTimer()) {
                        System.out.println(Phrases.STEAL_WRONG_BOTH.getPhrases());
                        System.out.println(" ");
                        System.out.println("Back to the game");
                    }

                }}



            if (player2Cards.size() == 0 & player1Cards.size() == 0) {
                System.out.println("It's a draw");

            } else if (player2Cards.size() == 0) {
                System.out.println("Congratulations " + playerOneName + " you are the winner");
            } else if (player1Cards.size() == 0) {
                System.out.println("Congratulations " + playerTwoName + " you are the winner");
            }


        }


    }


}



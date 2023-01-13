package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TwoPlayerSnap extends CardGame {

    Scanner scanner = new Scanner(System.in);

    public void play() {


        ArrayList<Card> winnings = new ArrayList<>(52);

        int previousCardValue = 0;

        while (player1Cards.size() > 0 && player2Cards.size() > 0) {

            Card player1Card = player1Cards.remove(0);
            Card player2Card = player2Cards.remove(0);

            System.out.println("Player 1's go");
            scanner.nextLine();
            System.out.println("Player 1's card is the " + player1Card.getSymbol() + " of " + player1Card.getSuit());
            System.out.println(" ");
            winnings.add(player1Card);

            if (previousCardValue == player1Card.getValue()) {
                boolean player2Steal = false;
                long startCount = System.currentTimeMillis();
                String playerOneInput = scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long playerOneTime = endCount - startCount;
                System.out.println(playerOneTime);
                if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime < 2000) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println("Player 1 wins!");
                    player1Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                    System.out.println("Scores on the doors : ");
                    System.out.println("Player one card count: " + player1Cards.size());
                    System.out.println("Player two card count: " + player2Cards.size());
                }
                if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime < 2000) {
                    System.out.println("Wrong word ... you need to be more accurate typing!");
                    System.out.println(" ");
                    System.out.println("Chance for player 2 to win!");
                    player2Steal = true;

                }
                if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime > 2000) {
                    System.out.println("Too slow .. you need to speed up");
                    System.out.println(" ");
                    System.out.println("Chance for player 2 to win!");
                    player2Steal = true;

                }
                if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime > 2000) {
                    System.out.println("Not even close ...");
                    System.out.println(" ");
                    System.out.println("Chance for player 2 to win!");
                    player2Steal = true;
                }

                if (player2Steal) {
                    startCount = System.currentTimeMillis();
                    String playerTwoInput = scanner.nextLine();
                    endCount = System.currentTimeMillis();
                    long playerTwoTime = endCount - startCount;
                    System.out.println(playerTwoTime);
                    if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < 2000) {
                        System.out.println("SNAP!");
                        System.out.println(" ");
                        System.out.println("Player 2 wins!");
                        player2Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                        System.out.println("Scores on the doors : ");
                        System.out.println("Player one card count: " + player1Cards.size());
                        System.out.println("Player two card count: " + player2Cards.size());
                    }
                    if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < 2000) {
                        System.out.println("Wrong word ... you both need to work on your typing!");
                        System.out.println(" ");
                    }
                    if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > 2000) {
                        System.out.println("Too Slow ... pair of sloths");
                        System.out.println(" ");
                    }
                    if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > 2000) {
                        System.out.println("Not even close ... I give up ....");
                        System.out.println(" ");
                        System.out.println("Back to the game");
                    }
                }}


            System.out.println("Player 2's go");
            scanner.nextLine();
            System.out.println("Player 2's card is the " + player2Card.getSymbol() + " of " + player2Card.getSuit());
            winnings.add(player2Card);

            if (player2Card.getValue() == player1Card.getValue()) {
                boolean player1Steal = false;
                long startCount = System.currentTimeMillis();
                String playerTwoInput = scanner.nextLine();
                long endCount = System.currentTimeMillis();
                long playerTwoTime = endCount - startCount;
                System.out.println(playerTwoTime);
                if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < 2000) {
                    System.out.println("SNAP!");
                    System.out.println(" ");
                    System.out.println("Player 2 wins!");
                    player2Cards.addAll(winnings);
                    winnings.removeAll(winnings);
                    System.out.println("Scores on the doors : ");
                    System.out.println("Player one card count: " + player1Cards.size());
                    System.out.println("Player two card count: " + player2Cards.size());
                }
                if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime < 2000) {
                    System.out.println("Wrong word ... you need to be more accurate typing!");
                    System.out.println(" ");
                    System.out.println("Chance for player 1 to win!");
                    player1Steal = true;

                }
                if (playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > 2000) {
                    System.out.println("Too slow .. you need to speed up");
                    System.out.println(" ");
                    System.out.println("Chance for player 1 to win!");
                    player1Steal = true;

                }
                if (!playerTwoInput.equalsIgnoreCase("snap") && playerTwoTime > 2000) {
                    System.out.println("Not even close ...");
                    System.out.println(" ");
                    System.out.println("Chance for player 1 to win!");
                    player1Steal = true;
                }

                if (player1Steal) {
                    startCount = System.currentTimeMillis();
                    String playerOneInput = scanner.nextLine();
                    endCount = System.currentTimeMillis();
                    long playerOneTime = endCount - startCount;
                    System.out.println(playerOneTime);
                    if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime < 2000) {
                        System.out.println("SNAP!");
                        System.out.println(" ");
                        System.out.println("Player 1 wins!");
                        player1Cards.addAll(winnings);
                        winnings.removeAll(winnings);
                        System.out.println("Scores on the doors : ");
                        System.out.println("Player one card count: " + player1Cards.size());
                        System.out.println("Player two card count: " + player2Cards.size());
                    }
                    if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime < 2000) {
                        System.out.println("Wrong word ... you both need to work on your typing!");
                        System.out.println(" ");
                    }
                    if (playerOneInput.equalsIgnoreCase("snap") && playerOneTime > 2000) {
                        System.out.println("Too Slow ... pair of sloths");
                        System.out.println(" ");
                    }
                    if (!playerOneInput.equalsIgnoreCase("snap") && playerOneTime > 2000) {
                        System.out.println("Not even close ... I give up ....");
                        System.out.println(" ");
                        System.out.println("Back to the game");
                    }

                }}



            if (player2Cards.size() == 0 & player1Cards.size() == 0) {
                System.out.println("It's a draw");

            } else if (player2Cards.size() == 0) {
                System.out.println("Congratulations Player 1 you are the winner");
            } else if (player1Cards.size() == 0) {
                System.out.println("Congratulations Player 2 you are the winner");
            }


        }


    }


}



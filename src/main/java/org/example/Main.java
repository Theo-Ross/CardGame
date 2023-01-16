package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        Snap snap = new Snap();
        TwoPlayerSnap twoPlayerSnap = new TwoPlayerSnap();
        boolean playing = true;

        Scanner scanner = new Scanner(System.in);

        while (playing) {
            System.out.println(Phrases.ENTER.getPhrases());
            scanner.nextLine();
            cardGame.setup();
            cardGame.dealCards();

            System.out.println("Please select difficulty level");
            System.out.println("Easy / Medium / Hard / Impossible");
            String difficulty = scanner.nextLine();
            if (difficulty.equalsIgnoreCase("easy")){
                cardGame.setTimer( 4000);
            }
            if (difficulty.equalsIgnoreCase("medium")){
                cardGame.setTimer( 3000);
            }
            if (difficulty.equalsIgnoreCase("hard")){
                cardGame.setTimer( 2000);
            }
            if (difficulty.equalsIgnoreCase("impossible")){
                cardGame.setTimer( 1000);
            }

            System.out.println("Please select the number of players");
            System.out.println("1 / 2");

            boolean gameModeSelected = false;

            while (!gameModeSelected) {
                char selection = scanner.nextLine().charAt(0);
                if (selection == '1') {
                    System.out.println("Single player selected");
                    System.out.println("______________________");
                    snap.play();
                    gameModeSelected = true;
                } else if (selection == '2') {
                    System.out.println("Two player selected");
                    System.out.println("______________________");
                    twoPlayerSnap.play();
                    gameModeSelected = true;
                }
                else {
                    System.out.println(Phrases.INPUT_INVALID.getPhrases());
                }
            }

            System.out.println(Phrases.PLAY_AGAIN.getPhrases());
            if (scanner.nextLine().equals("N")) {
                playing = false;
            }


            System.out.println(Phrases.THANKS.getPhrases());


        }


    }


}
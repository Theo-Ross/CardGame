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
            System.out.println("Welcome to Snap: press Enter to begin");
            scanner.nextLine();
            cardGame.setup();
            cardGame.dealCards();
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
//                else if (selection == ){
//                    System.out.println("Please enter valid input");
//                }
                else {
                    System.out.println("Please enter valid input");
                }
            }

            System.out.println("Would you like to play again? Y/N");
            if (scanner.nextLine().equals("N")) {
                playing = false;
            }


            System.out.println("Ok, thank you for playing");


        }


    }


}
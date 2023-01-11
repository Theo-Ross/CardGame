package org.example;


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    CardGame cardGame = new CardGame();
    Snap snap = new Snap();

    boolean playing = true;

    Scanner scanner = new Scanner(System.in);

    while (playing) {
        System.out.println("Welcome to Hangman press Enter to play");
        cardGame.setup();
        cardGame.dealCards();
        snap.play();

        System.out.println("Would you like to play again? Y/N");
        if (scanner.nextLine().equals("N")) {
            playing = false;
        }


        System.out.println("Ok, thank you for playing");


    }


}








}
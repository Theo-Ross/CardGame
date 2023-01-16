package org.example;

public enum Phrases {
    SELECT_NAME("Please select name for "),
    WELCOME("Hello Welcome to SNAP"),
    TURN("'s turn"),
    WRONG_TYPING("Wrong word ... you need to be more accurate typing!"),

    WRONG_SLOW("Too slow .. you need to speed up"),

    WRONG_BOTH("Not even close ..."),

    STEAL_WRONG_TYPING("Wrong word ... you both need to work on your typing!"),
    STEAL_WRONG_SLOW("Too Slow ... pair of sloths"),
    STEAL_WRONG_BOTH("Not even close ... I give up ...."),

    COMPUTER_DRAW("This is a draw ... the odds of this happening are crazy ... crazy!"),

INPUT_INVALID("Please enter valid input"),

    PLAY_AGAIN("Would you like to play again? Y/N"),
    THANKS("Ok, thank you for playing"),

    ENTER("Welcome to Snap: press Enter to begin"),


    ;


    private String phrases;

    Phrases(String phrases) {
        this.phrases = phrases;
    }

    public String getPhrases() {
        return phrases;
    }
}



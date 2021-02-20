package com.javaprogramming.ex2;

import java.util.Scanner;

public class GuessNumber {
    static Scanner _scanner = new Scanner(System.in);
    static int [] _numbers = new int[1000];
    static int _topGuess;
    static int _bottomGuess;

    public static void main(String [] args) {
        for (int i = 0;i < 1000; i++) {
            _numbers[i] = i+1;
        }

        System.out.println("Please pick a number between 1 and 1000");

        guessNumber();
    }

    public static void guessNumber() {
        if (_topGuess == 0 || _bottomGuess == 0) {
            _bottomGuess = _numbers[0];
            _topGuess = _numbers[_numbers.length-1];
        }
        System.out.println("Is your number (G)reater or (S)maller than "
                + ((_topGuess + _bottomGuess) / 2));

        String guess = _scanner.nextLine();

        if (guess.equalsIgnoreCase("G")) {
            _bottomGuess = (_topGuess + _bottomGuess)/2;
        } else if (guess.equalsIgnoreCase("S")) {
            _topGuess = (_topGuess + _bottomGuess)/2;
        }

        guessNumber();
    }
}

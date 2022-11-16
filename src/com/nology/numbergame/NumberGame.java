package com.nology.numbergame;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void play() {
        int targetInt;
        int enteredInt;
        int numAttempts = 0;
        int min = 0;
        int max = 100;
        boolean stopGame = false;
        List<Integer> enteredInts = new ArrayList<>();

        targetInt = new Random().nextInt(max - min + 1) + min;

        while (stopGame == false) {

            System.out.println("Guess a number from 1 to 100");
            Scanner userInput = new Scanner(System.in);

            try {
                enteredInt = Integer.parseInt(userInput.nextLine());
            } catch (Exception e) {
                System.out.println("value is not an integer.");
                continue;
            }
            if(enteredInts.contains(enteredInt)) {
                System.out.println("You have already tried this number, try another one.");
                continue;
            }
            enteredInts.add(enteredInt);
            System.out.println("Your number is: " + enteredInt);

            numAttempts++;
            System.out.println("You have guessed " + numAttempts + " times!");

            if (enteredInt == targetInt) {
                System.out.println("You won!");
                stopGame = true;
                startGame();

            } else if (enteredInt <= targetInt + 3 && enteredInt >= targetInt - 3) {
                System.out.println("Very very warm");
            } else if (enteredInt <= targetInt + 6 && enteredInt >= targetInt - 6) {
                System.out.println("Very warm");
            } else if (enteredInt <= targetInt + 10 && enteredInt >= targetInt - 10) {
                System.out.println("Warm");
            } else if (enteredInt <= targetInt + 16 && enteredInt >= targetInt - 16) {
                System.out.println("Cold");
            } else if (enteredInt <= targetInt + 25 && enteredInt >= targetInt - 25) {
                System.out.println("Freezing");
            } else if (enteredInt <= targetInt + 30 && enteredInt >= targetInt - 30) {
                System.out.println("Arctic");
            } else {
                System.out.println("No where near..");
            }

            if (numAttempts > 50) {
                System.out.println("You ran out of attempts..");
                stopGame = true;
                startGame();
            }
        }
    }
    private static void startGame() {
        char playGame = 'y';
        System.out.println("Would you like to play the Number Guessing y / n");
        Scanner scan = new Scanner(System.in);
        playGame = scan.next().charAt(0);

        if (playGame == 'y') {
            play();
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}


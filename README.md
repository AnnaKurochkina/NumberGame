# Challenge - Number game

Develop a simple game using Java.

You can use just the one if you want, but try to use methods.
Create a new package

com.nology.numbergame

```Create a class for the game.

public class NumberGame { 
 
    public void play() { 
        // play the game 
    } 
}
```

The game is as follows:
 * Game selects an number between 1 and 100 (inclusive)
 * User enters a guess.
    * If the user is correct then user has won! End of game
    * If the guess is within 3 then print “Very very warm”
    * If the guess is within 6 then print “Very warm”
    * If the guess is within 10 then print “Warm”
    * If the guess is within 16 then print “Cold”
    * If the guess is within 16 then print “Cold”
    * If the guess is within 21 then print “Very cold”
    * If the guess is within 25 then print “Freezing”
    * If the guess is within 30 then print “Artic”
    * Otherwise print “No where near..”
    
Repeat until the user guesses the number or they have 10 goes.

Finally print the number and number of guesses user took.

## Hints
* See  Scanner  for how to read a number or line from the console.
* See  Random  for how to select a random number.
* Might be an idea to validate a user’s guesses
* You could store the guesses made by user and if already tried that number 
display a suitable message and number allowed guesses is not being increased.

* The game starts with a question "Would you like to play the Number Guessing y / n"
* If the user types as a guess not an integer a message displayed - "It is not an integer. Try again." and number allowed guesses is not being increased.

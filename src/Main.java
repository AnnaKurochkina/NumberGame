import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number from 1 to 100");

        String enteredNumber = myObj.nextLine();  // Read user input
        System.out.println("Your number is: " + enteredNumber);  // Output user input
    }
}
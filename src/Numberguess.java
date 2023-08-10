import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int randomNumber =(int)(Math.random()*100) +1;
        while(true){
        System.out.println("ENTER THE NUMBBER YOU ARE GUESSING OR TYPE exit TO QUIT");
         String input = sc.nextLine();

        if (input.equalsIgnoreCase("exit")) {
        System.out.println("EXITING...");
            break;
        }
            int guess;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
        }

        sc.close();
    }
}

import java.util.Scanner;
import java.util.Random;


public class Guess {

  public static void main(String[] args) {
    Random rand = new Random();
    int myNum = rand.nextInt(100) + 1;

    int guessNum;
    int diffGuess;

    Scanner input = new Scanner(System.in);
    System.out.println("I'm thinking of a number between 1 and 100 (including both).  Can you guess what it is?");
    System.out.printf("Type a number: ");

    guessNum = input.nextInt();
    input.nextLine(); // added after discussion in class on 6/29/22, thanks Sam!  Good idea to flush line after using nextDouble() or nextInt()
    
    diffGuess = Math.abs(guessNum - myNum);

    System.out.printf("Your guess is: %d\n", guessNum);

    System.out.printf("The number I was thinking of is: %d\n", myNum);

   System.out.printf("You were off by: %d\n", diffGuess);

  }
}
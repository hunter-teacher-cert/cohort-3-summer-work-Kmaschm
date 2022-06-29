import java.util.Random;

public class Craps {

  /*
  * Simulates a game of Craps:
  *
  * Main program must take in number of rounds from the command line, then play number of rounds specified, and output status of rounds as they occur
  * 
  * Required methods: 
  * roll: takes an integer and returns a random number between 1 and the integer (inclusive)
  *
  * shoot: takes in the number of dice and max value for one die, returns result of rolling the dice 
  *
  * round: takes in no parameters, returns if round is won or lost
  *
  * Rules for a round:
  * 1. Shooter rolls/shoots dice.
  *
  * 2. If shooter rolls:
  * 2, 3, 12  --> Craps, shooter loses
  * 7, 11 --> Natural, shooter wins
  * Any other number not specified:
  * value is now called Point
  * shooter must roll until they roll Point (wins) or 7 (loses)
  *
  */

  public static void main(String[] args) {
    String result;
    int numOfRounds = Integer.parseInt(args[0]);

    System.out.println("\nWelcome to Craps!  You have chosen to play " + numOfRounds + " rounds.\n");

    for(int i = 1; i <= numOfRounds; i++) {
      System.out.println("************* Starting Round " + i + " *************");
      result = round();
      System.out.println("End of round " + i + ": Shooter " + result);
      System.out.println("");
    }
   
  }


  /**
  * Simulates rolling an n-sided die.  Takes in an integer, numSides, and returns a (pseudo)randomly-selected integer from 1 to numSides inclusive.
  *
  * @param numSides integer, represents n-sided die
  * @return integer (pseudo)randomly-chosen from 1 to numSides inclusive
  */
  public static int roll(int numSides) {
    Random rand = new Random();
    int rollVal = rand.nextInt(numSides) + 1;
    if(numSides == 6) {
     drawRoll(rollVal);
    }
    return rollVal;

  }

 /**
 * Prints ASCII art of specified result of 6-sided die roll
 *
 * Uses ACSII drawings inspired by text result in https://codereview.stackexchange.com/questions/111337/pretty-print-dice-faces-from-multiple-rolls-of-multi-sided-dices
 * 
 * @param rollVal integer, value rolled on 6-sided die
 */
 public static void drawRoll(int rollVal) {
    if(rollVal == 1) {
        System.out.println("+-----+\n|     |\n|  o  |\n|     |\n+-----+");
      } else if(rollVal == 2) {
        System.out.println("+-----+\n|     |\n| o o |\n|     |\n+-----+");
      } else if(rollVal == 3) {
        System.out.println("+-----+\n| o   |\n|  o  |\n|   o |\n+-----+");
      } else if(rollVal == 4) {
         System.out.println("+-----+\n| o o |\n|     |\n| o o |\n+-----+");
      } else if(rollVal == 5) {
         System.out.println("+-----+\n| o o |\n|  o  |\n| o o |\n+-----+");
      } else { // rolled a 6
        System.out.println("+-----+\n| o o |\n| o o |\n| o o |\n+-----+");
      }
 }



  /**
  *  Simulates rolling specified number of n-sided dice.  Takes in an integer number of dice and an integer number of sides, returns total of score of all dice rolls
*
  * @param numDice    integer, specifies number of dice we will roll
  * @param numSides   integer, specifies the number of sides on each die (aka max value of the die)
  * @return   integer, total value of all dice rolled
  */
  public static int shoot(int numDice, int numSides) {
    int rollTotal = 0;
    for(int i = 0; i < numDice; i++) {
      rollTotal += roll(numSides);
    }
    return rollTotal;
  }


  /**
  * Simulates 1 round of Craps using two six-sided die, outputting status as rolls occur.  Returns whether the shooter has won or lost the round.
  *
  * Rules for a round:
  * 1. Shooter rolls/shoots dice.
  *
  * 2. If shooter rolls:
  * 2, 3, 12  --> Craps, shooter loses
  * 7, 11 --> Natural, shooter wins
  * Any other number not specified:
  * value is now called Point
  * shooter must roll until they roll Point (wins) or 7 (loses)
  *
  * @return String, "wins!" or "loses." based on whether the shooter has won or lost the round based on the rules
  */

  public static String round() {
    final int NUM_OF_DICE = 2;
    final int NUM_OF_SIDES = 6;
    final String WIN = "wins!";
    final String LOSS = "loses.";

    int currentShot;
    int point;

    currentShot = shoot(NUM_OF_DICE, NUM_OF_SIDES);
    System.out.println("Shooter has rolled: " + currentShot);

    if(currentShot == 2 || currentShot == 3 || currentShot == 12) {
      System.out.println("Craps!");
      return LOSS;
    } else if(currentShot == 7 || currentShot == 11) {
      System.out.println("Natural!");
      return WIN;
    } else {
      point = currentShot;
      while(true) {
        currentShot = shoot(NUM_OF_DICE, NUM_OF_SIDES);
        System.out.println("Shooter has rolled: " + currentShot);

        if(currentShot == point) {
          return WIN;
        }

        if(currentShot == 7) {
          return LOSS;
        }
      }
    }
  }


}
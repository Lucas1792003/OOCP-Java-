package assigment;
import java.util.Random;

public class DiceGame {
  private static final int NUM_ROUNDS = 5;
  private static final int NUM_SIDES = 6;

  public static void main(String[] args) {
    Random random = new Random();
    int countP1 = 0;
    int countP2 = 0;
    int tie = 0;
    for (int i = 0; i < NUM_ROUNDS; i++) {
      int p1 = random.nextInt(NUM_SIDES) + 1;
      int p2 = random.nextInt(NUM_SIDES) + 1;

      System.out.println("Round " + (i + 1) + ": " + p1 + " vs. " + p2);
      if (p1 > p2) {
        countP1++;
      } else if (p2 > p1) {
        countP2++;
      } else if (p2==p1){
    	  tie++;
      }
    }

    System.out.println();
    System.out.println("Player 1 won " + countP1 + " rounds.");
    System.out.println("Player 2 won " + countP2 + " rounds.");
    System.out.println("The number of even round(s):"+ tie);
    if (countP1 > countP2) {
      System.out.println("Player 1 is the winner!");
    } else if (countP2 > countP1) {
      System.out.println("Player 2 is the winner!");
    } else {
      System.out.println("It's a tie!");
    }
  }
}
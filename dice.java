package coding_in_java;

import java.util.Random;

public class dice {
 public static void main(String[] args){

  Random diceNumber = new Random();
  int x = diceNumber.nextInt(6) + 1;
  int y = diceNumber.nextInt(6) + 1;

  System.out.println("You rolled a: " + x + " on the first roll!" );
  System.out.println("You rolled a: " + y + " on the second roll!" );

 } 
}

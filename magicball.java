package coding_in_java;

import java.util.Random;
import java.util.Scanner;

public class magicball {
 public static void main(String[] args) {

  //getting the question from the user
  System.out.println("What is your question today?");
  Scanner scan = new Scanner(System.in);
  scan.next();
  scan.close();

  //getting a random number to serve as a magic ball shake
  Random rand = new Random();
  int r = rand.nextInt(10);

  //responding to the user based on the random number
  if(r == 0) {
   System.out.println("It is certain!");
  } else if (r == 1) {
   System.out.println("Ask again later...");
  } else if (r == 2) {
   System.out.println("Don't count on it");
  } else if (r == 3) {
   System.out.println("Without a doubt!!!");
  } else if (r == 4) {
   System.out.println("I can't tell you right now.");
  } else if (r == 5) {
   System.out.println("YES!!");
  } else if (r == 6) {
   System.out.println("No, I don't think so!");
  } else if (r == 7) {
   System.out.println("Very doubtful...");
  } else if (r == 8) {
   System.out.println("Signs point to yes.");
  } else if (r == 9) {
   System.out.println("Definitely!!!!!");
  }
 }
 
}

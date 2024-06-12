package coding_in_java;

public class tictactoe {
 public static void main(String[] args) {
  char[][] gameBoard = {{' '}, {'|'}, {' '}, {'|'}, {' '},
   {'-'}, {'+'}, {'-'}, {'+'}, {'-'},
   {' '}, {'|'}, {' '}, {'|'}, {' '},
   {'-'}, {'+'}, {'-'}, {'+'}, {'-'},
   {' '}, {'|'}, {' '}, {'|'}, {' '}};
  printGameBoard(gameBoard);
 }
 public static void printGameBoard(char[][] gameBoard) {
  for(char[] row: gameBoard) {
   for(char c: row) {
    System.out.println(c);
   } 
  }
 }
}

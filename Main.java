import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a starting row from 1-8");
    System.out.println("Enter a starting column from 1-8");
    System.out.println("Enter a destination row from 1-8");
    System.out.println("Enter a destination column from 1-8");

    // Program doesn't crash when a string is inputted, repeated for every input
    if (!sc.hasNextInt()) {
      String word = sc.next();
      System.err.println("not a valid input");
      System.exit(1);
    }

    // Making sure inputs are between 1 and 8 and the program does not crash when a
    // out of bound number including negative numbers are inputted. Repeated for all
    // inputs.
    int startRow = sc.nextInt();
    if ((startRow >= 1 && startRow <= 8)) {
      System.out.println("You inputted starting row # " + startRow);
    } else if ((startRow < 1 || startRow > 8)) {
      System.out.println("Not a valid integer");
      System.exit(1); // Exits program if the input is invalid
    }

    if (!sc.hasNextInt()) {
      String word = sc.next();
      System.err.println("not a valid input");
      System.exit(1);
    }

    int startColumn = sc.nextInt();
    if ((startColumn >= 1 && startColumn <= 8)) {
      System.out.println("You inputted starting column # " + startColumn);
    } else if ((startColumn < 1 || startColumn > 8)) {
      System.out.println("Not a valid integer");
      System.exit(1);
    }

    if (!sc.hasNextInt()) {
      String word = sc.next();
      System.err.println("not a valid input");
      System.exit(1);
    }

    int endRow = sc.nextInt();
    if ((endRow >= 1 && endRow <= 8)) {
      System.out.println("You inputted ending row # " + endRow);
    } else if ((endRow < 1 || endRow > 8)) {
      System.out.println("Not a valid integer");
      System.exit(1);
    }

    if (!sc.hasNextInt()) {
      String word = sc.next();
      System.err.println("not a valid input");
      System.exit(1);
    }

    int endColumn = sc.nextInt();
    if ((endColumn >= 1 && endColumn <= 8)) {
      System.out.println("You inputted ending column # " + endColumn);
    } else if ((endColumn < 1 || endColumn > 8)) {
      System.out.println("Not a valid integer");
      System.exit(1);
    }

    // From lines 1-70 i'm getting inputs for the starting and ending rows and columns and making sure the program doesn't crash.

    int[][] moves = { { 1, 2 }, { 2, 1 }, { -1, -2 }, { -2, -1 }, { -1, 2 }, { -2, 1 }, { 1, -2 }, { -1, 2 } }; // all possible moves a knight can make on the chessboard 

    int currentRow = startRow;
    int currentColumn = startColumn;
    int moveCount = 0;

    System.out.println("Steps:");

    while (currentRow != endRow || currentColumn != endColumn) { // trys different moves until current and end match
      for (int[] move : moves) {
        int nextRow = currentRow + move[0];
        int nextColumn = currentColumn + move[1];
        if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) { //makes sure moves are between 1 & 8
          System.out.println("(" + nextRow + ", " + nextColumn + ")");
          moveCount++;
          if (nextRow == endRow && nextColumn == endColumn) {

          }
        }
      }
      currentRow = endRow; //when this is true the loop ends
      currentColumn = endColumn;
    }

    System.out.println(moveCount + " moves");
  }
}

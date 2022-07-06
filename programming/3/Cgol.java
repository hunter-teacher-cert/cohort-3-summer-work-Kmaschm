import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * collaborators: 
 * Yeidy Levels - YLevels <-- driving
 * Usman Ahmed - usman0527 <-- designated slacker
 * Rachel Kaufman - RACHELKAUFMAN <-- collab
 * Kate Maschmeyer - kmaschm <-- collab
 * 
 * 
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

// initialize our states
final static char ALIVE = 'X'; 
final static char DEAD = ' ';
  
  //create, initialize, and return empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
      char[][] board = new char[rows][cols];
      for (int i = 0; i < rows; i++) 
      {
        for (int j = 0; j < cols; j++) 
        {
          board[i][j] = DEAD;
        }
      }
      return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
      // when printing, we'll put '.' for the dead cells just to be able see it
      for (int i = 0; i < board.length; i++) 
      {
        for (int j = 0; j < board[i].length; j++) 
        {
          if (board[i][j] == ' ') 
          {
            System.out.print(". ");  
          } 
          else {
            System.out.print(board[i][j] + " ");
          }
        }
        System.out.println(); 
      }
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int counter = 0;
    int rows = board.length;
    int cols = board[0].length; 

    // r = row, c = column
    // local rows: r-1, r, r+1
    // local cols: c-1, c, c+1
 
    // r-1, c-1 | r-1, c | r-1, c+1
    // r, c-1   | r, c   | r,  c+1
    // r+1, c-1 | r+1, c | r+1, c+1
      
    // go through local rows
    for (int i = r-1; i <= r+1; i++) 
    {
      // make sure row value is valid
      if (i >= 0 && i < rows) 
      { 
        // go through local cols
        for (int j = c-1; j <= c+1; j++) 
        { 
          // make sure col value is valid
          if (j >= 0 && j < cols) 
          { 
            // check that we're not in the center
            if (!(i == r && j == c)) 
            {
              // if the neighbor is alive, count them!
              if (board[i][j] == ALIVE) 
              {
                counter++;
              }
            }
          }
        }
      }
    }
    return counter;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
  char currentStatus = board[r][c];
  int aliveNeighbours = countNeighbours(board, r, c);
    //call countNeighbour 
    //if you are dead do this
    if (currentStatus == DEAD && aliveNeighbours == 3) 
    {
      return ALIVE;
    }
    if ((currentStatus == ALIVE) && (aliveNeighbours == 2 || aliveNeighbours == 3)) 
    {
        return ALIVE;
    }
    return DEAD;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    char[][] nextBoard = new char[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) 
    {
      for (int j = 0; j < board[i].length; j++) 
      {
        setCell (nextBoard, i, j, getNextGenCell(board, i, j)); 
      }
    }
    return nextBoard;
  }


  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    //creates the empty board with dead cells
    char[][] board;
    board = createNewBoard(25,25);
    printBoard(board);
    System.out.println("--------------------------\n\n");

    //puts living cells into top left corner of board and prints it out
    // setCell(board, 0, 0, 'X');
    // setCell(board, 0, 1, 'X');
    // setCell(board, 1, 0, 'X');
    // setCell(board, 2, 2, 'X');
    // setCell(board, 3, 3, 'X');
    // setCell(board, 2, 3, 'X');
    for (int i = 0; i < board.length; i++) 
    {
      for (int j = 0; j < board[i].length; j++) 
      {
        if (Math.random() > .9) 
        {
          setCell (board, i, j, ALIVE);
        }
      }
    }
   
    System.out.println("Generation 0");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    // System.out.println(countNeighbours(board, 0, 0)); // 2
    // System.out.println(countNeighbours(board, 0, 1)); // 2
    // System.out.println(countNeighbours(board, 2, 1)); // 1
    // System.out.println(countNeighbours(board, 5, 5)); // 0

    // System.out.println(getNextGenCell(board, 1, 1)); // X
    // System.out.println(getNextGenCell(board, 1, 0)); // X
    // System.out.println(getNextGenCell(board, 1, 2)); //returned a space for DEAD
   for (int i = 1; i < 10; i++) 
    {
    board = generateNextBoard (board);
    System.out.println("Generation " + i);
    printBoard(board);
    System.out.println("--------------------------\n\n");
    }
    
    
  }//end main()

}//end class
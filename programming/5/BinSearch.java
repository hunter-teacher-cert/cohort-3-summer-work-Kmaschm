/**
 * Binary Search by Team Did You Mean Recursion?
 * Kate Maschmeyer

 * [NOTE: Did not get to this as a group, so working on this by myself!]

 * collaborators:
 * Alicia Wade
 * Marieke Thomas
 * Moo Joon Park
 */

/**
   class BinSearch
   Binary search on array of ints
*/

public class BinSearch
{

  /**
     int binSearch(int[],int) -- searches an array of ints for target int
     precondition:  input array is sorted in ascending order
     postcondition: returns index of target, or returns -1 if target not found
  */
  public static int binSearch ( int[] a, int target )
  {
    return binSearchRec( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( int[] a, int target,
                                  int loPos, int hiPos )
  {
    final int NOT_FOUND = -1; 
    //int tPos = NOT_FOUND; //init return var to flag/signal value

    // NOTE: Typo?? should be loPos, hiPos
    // int mPos = (lo + hi) / 2; //init tracker var for middle position
    int mPos = (loPos + hiPos) / 2;

    
    //exit case. If lo & hi have crossed, target not present
    if (hiPos < loPos) { // crossing happens when hi is less than lo
      System.out.println("Target, " + target + ", not found.");
      return NOT_FOUND;
    }
    
    // target found
    if ( a[mPos] == target) {
       System.out.println("Target, " + target + ", found at location " + mPos);
      return mPos;
    }
    // value at mid index higher than target
    else if (a[mPos] > target) { // we need to look at the lower half, so set hi to 1 below current middle
     // System.out.println("Target: " + target + ". Current location: " + mPos + " with value: " + a[mPos] + " is too high.");
      hiPos = mPos - 1;
    }
    // value at mid index lower than target
    else if ( a[mPos] < target) { // we need to look at the upper half, so set lo to 1 above middle location
      // System.out.println("Target: " + target + ". At location " + mPos + ". Value: " + a[mPos] + " is too low.");
      loPos = mPos + 1;
    }

    return binSearchRec(a, target, loPos, hiPos);
    
  }//end binSearchRec


  //tell whether an array is sorted in ascending order
  private static boolean isSorted( int[] arr )
  {
    boolean retBoo = true; //init to true, assume array is sorted
    
    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i] > arr[i+1] ) ) {
        return false;
      }
    }
    return retBoo; //if entire array was traversed, it must be sorted
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void printArray( int[] arr )
  {
    String output = "[ ";

    for( int c : arr )
      output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }



  //main method for testing
  public static void main ( String[] args )
  {
   
    System.out.println("\nNow testing binSearch on int array...");

    //Declare and initialize array of ints
    int[] iArr = { 2, 4, 6, 8, 6, 42 };
    printArray( iArr );
    System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

    int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
    printArray( iArr2 );
    System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );

    int[] iArr3 = new int[10000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }
    //printArray( iArr3 );
    System.out.println( "iArr3 sorted? -- " + isSorted(iArr3) );

    System.out.println("***************");
    System.out.print("Now testing binSearch on iArr2: ");
    printArray( iArr2 );
    System.out.println();
    System.out.println( binSearch(iArr2,2) );
    System.out.println( binSearch(iArr2,4) );
    System.out.println( binSearch(iArr2,6) );
    System.out.println( binSearch(iArr2,8) );
    System.out.println( binSearch(iArr2,13) );
    System.out.println( binSearch(iArr2,42) );
    //search for 43 in array2
    System.out.println( binSearch(iArr2,43) );

    System.out.println("***************");
    System.out.println( "Now testing binSearch on iArr3 (even integers 0 to 2*9999)..." );
    System.out.println( binSearch(iArr3,4) );
    System.out.println( binSearch(iArr3,8) );
    System.out.println( binSearch(iArr3,5) );

    //search for 43 in array
    System.out.println( binSearch(iArr3,43) );
        //move the bar down to uncover tests in succession...
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    /* YOUR SMART CODE HERE :: Feel free to add extra tests...*/

  }

}
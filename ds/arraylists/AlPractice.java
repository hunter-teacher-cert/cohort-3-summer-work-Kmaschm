import java.io.*;
import java.util.*;

/**
 * Self-version
 * Room 14 (7/12/22)
 * Collaborators: Shana Elizabeth Henry, Christopher de Silva, Kate Maschmeyer, Ashley Ufret
 */



/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval) ✅
public static int sumOfList(ArrayList<Integer> dataList) ✅

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB) ✅
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove) ✅

Advanced level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)  - TODO: deal with arrays that are different sizes (see method for more comments)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){

    // dealing with preconditions
    if(size < 0) {
      System.out.println("Parameter 'size' is invalid; size must be >= 0.  Returning null");
      return null;
    }

    if(maxVal <= 0) {
       System.out.println("Parameter 'maxval' is invalid; maxval must be > 0.  Returning null");
       return null;
    }

    // declare & instantiate ArrayList
    ArrayList<Integer> a = new ArrayList<Integer>();

    // declare & instatiate Random object
    Random rand = new Random();

    // add size # of random integers to ArrayList
    // random numbers are 0 to maxval (not including maxval)
    for(int i = 0; i < size; i++) {
      a.add(rand.nextInt(maxval));
    }
    
    return a;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int sum = 0;
    for(int i = 0; i < dataList.size(); i++) {
      sum += dataList.get(i);
    }
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indices of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
   
    if(index1 > 0 && index1 < dataList.size() 
      && index2 > 0 && index2 < dataList.size()) { // valid indices
      // save element at index1 to temp
      int temp = dataList.get(index1);
  
      // put the element at index2 into the location at index1
      dataList.set(index1, dataList.get(index2));
 
      // put temp into the location at index2
      dataList.set(index2, temp);
      } else {
        System.out.println("At least one of the indices is invalid.  Please try again.");
      }  
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    // set up a counter for going through dataList 
    int i = 0;

    // stop when we're at the end of the list
    while(i < dataList.size()) {

      // if we found an element to remove (it matches valueToRemove  )
      if(dataList.get(i) == valueToRemove) {
        //remove it
        dataList.remove(i);
      } else {
        // otherwise, keep going up the list
        i++;
      }
    }
   

  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> summedList = new ArrayList<Integer>();
    if(ListA.size() != ListB.size()) {
      System.out.println("Lists are of unequal size. Returning null"); 
      // TODO: summedList will eventually be Math.max(ListA.size(), ListB.size()); 
      // longer list will "add 0" and put in summedList
      return null;
    }
    
    for(int i = 0; i < ListA.size(); i++) {
      summedList.add(ListA.get(i) + ListB.get(i));
    }
    
    return summedList;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> zippedList = new ArrayList<Integer>();
    
    return null;//placeholder to compile.
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;

    //Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);

    // Testing sumOfList
    System.out.println("The sum of list al: " +sumOfList(al));


    //Uncomment these to test swapElements
    swapElements(al,2,6); // NOTE: had to include al
    System.out.println(al);

    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al); // needed al, not a
    removeValue(al,5);
    System.out.println(al); // needed al, not a

    System.out.println("Testing sumLists");
    
    ArrayList<Integer> al2 = buildRandomList(10,100);
    System.out.println("al2" + al2);
    ArrayList<Integer> al3 = buildRandomList(10,50);
    System.out.println("al3" + al3);
    System.out.println("Testing sumLists");
    ArrayList<Integer> al4 = sumLists(al2,al3);
    System.out.println(al4);
  }

}
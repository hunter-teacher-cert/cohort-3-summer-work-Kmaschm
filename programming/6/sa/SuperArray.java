/**
 * SuperArray by Team MarvelvsDC
 * Kate Maschmeyer
 * collaborators: Nicole Cojuangco, Saranii Muller, Ashley Ufret
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

/*
* According to https://github.com/hunter-teacher-cert/cs-ed-cohort-3-summer-2022/tree/main/daily/6  (toString() not listed, so added to Basic)
*
* ***Basic***
* Add/write:
* > SuperArray() ✅
*     Basic constructor that:
      1. Creates a new array of size 10 and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > SuperArray(int size) ✅
*     Constructor that:
*     1. Creates a new array of size and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > add(int value) ✅
*     adds value to the end of the SuperArray (after the last added element)
* > isEmpty() ✅
*     return true if the SuperArray is empty, false otherwise.
*  > toString() ✅ - ADDED, SINCE IT WAS NOT LISTED
*    return a String version of SuperArray in human-readable format

* ***Intermediate ***
* Add/write:
* > grow() ✅
* ** Enlarges the SuperArray. It should:
* ** Create a new array, 5 units larger
* ** Copy the old data to the new array
* ** Set the data instance variable to point to the new array
*
* Modify:
* > add(int value) ✅
*     so that if the data array is filled it will:
*     1. Grow the array using the grow method you just wrote.
*     2. Add the new value to the array.
* 
* Add/write:
* > get(index) - return the value at location index ✅
*
* ***Advanced***
* Write:
* > add(index,value) ✅
*     Adds value at location index. You should shift the data to create an open space if you need to and you can use grow() if you need to make the array larger.
* > remove(index) 
    Removes the location at index by shifting all the elements after location index and subtracting one from numberElements
*
*
*
*/

public class SuperArray
{
 
  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements

  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
   //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    this.data = new int[10]; // data can fit 10 elements
    this.numberElements = 0; // no elements actually filled yet
  }

  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    this.data = new int[size]; // data can fit size # of elements
    this.numberElements = 0; // no elements actually filled yet
  }

 

  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~

  /** 
  * Takes in an integer called value and appends the value to our SuperArray
  * Note: makes sure to check the size of underlying array & grow/copy if possible, then appends
  *
  * @param value  integer, we want to append this to our SuperArray
  */
  public void add( int value )
  {
    // test to see if we need to grow, then grow
  
    if(this.data.length == this.numberElements) { // we are currently at capacity
      //System.out.println("About to grow array");
      grow(); // grow the array first
     }
    
     //System.out.println("Added " + value + " at location " + numberElements);

    // NOTE: if numberElements fill in an array, then the last element is at (numberElements - 1).  We add the next value at the numberElements index.
    this.data[this.numberElements] = value; // add value to end 
    this.numberElements++; // make sure we update our count

  }//end add()



  /** 
  * Determines whether the SuperArray is empty (true if empty, false if not)
  *
  * @return boolean
  */
  public boolean isEmpty()
  {
    if(this.numberElements == 0) {
      return true;
    } else {
      return false; 
    }
  }

  
  /** 
  * Takes in an integer called index, and returns the value at that index
  * If we have not stored a value at that index, prints error message, will return Integer.MIN_VALUE
  *
  *
  * @param   index   integer, we want to determine value at this index 
  * @return  integer, value at given index
  */
  public int get(int index)
  {
    if(index > this.numberElements) {
      System.out.println("Index is out of bounds");
      return Integer.MIN_VALUE;
    }
    return this.data[index];
  }

  
  

  /** 
  * Returns a human-friendly String for our SuperArray
  * Example: {7, 2, 15, 4}
  *
  * @return String, human-friendly version of SuperArray
  */
  public String toString()
  {
    String sArr = ""; // initialize to empty String so that concatenated integers will be casted to Strings
    sArr = sArr + "{"; // starting to print as array
    for(int i = 0; i < this.numberElements; i++) {
      if(i == 0) { // starting element
        sArr = sArr + this.get(i);
      } else {
         sArr = sArr + ", " + this.get(i);
      }
     
    }
    sArr = sArr + "}";
    
    return sArr;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  /** 
  * Takes in an integer called index.  We will remove the value at the given index.
  * If index is out of bounds, print error message and remove nothing
  *
  * @param index   integer, we'll remove value at given index  
  */
  public void remove(int index)
  {
    if(index < numberElements) { // valid index
      // shift items down to remove the item at index
      for(int i = index; i < numberElements-1; i++) {
        this.data[i] = this.get(i+1);
      }
      // subtract fom numberElements;
      this.numberElements--;
      
    } else {
      System.out.println("Invalid index.");
    }
 
  }


 /** 
  * Takes in an integer called index and an integer called value.  
  * NOTE: gaps are not allowed in this version of  SuperArray - if index > numberElements (past appending the value to the end of the array, warning statement will be printed and nothing will be added)
  * 
  *
  * @param  index  integer, location in array to add specified value 
  * @param  value  integer, value to add at specified index
  */
  public void add(int index, int value)
  {
    // NOT ALLOWING GAPS
    // while(index >= this.data.length) { // 
    //   System.out.println("Increasing capacity to reach desired index");
    //   grow();
    // }

    
    if(index > numberElements) {
      System.out.println("Index out of bounds. Greatest index available: " + numberElements);
    
    } else {
      
      if(this.data.length == this.numberElements) { // we are currently at capacity 
        grow();
      }

       // shift elements toward the end of the array
      for(int i = this.numberElements - 1; i >= index; i--) { // start at last element, move inward
        //System.out.println("Setting location " + (i+1) + " to " + this.get(i));
        this.data[i+1] = this.get(i);
      }

      // insert new element
      // System.out.println("Inserting " + value + " at location " + index);
      this.data[index] = value;

      // increment numberElements
      this.numberElements++;
      
      // NO GAPS:
      // this.numberElements = Math.max(index+1, this.numberElements + 1);
  
    }
    
  }


  
  // ✅ SWITCHED BACK TO PRIVATE AFTER TESTING
  private void grow()
  {
    //System.out.println("Growing array");
    // create a new array that is 5 units larger (as specified!)  
    int[] grownArr = new int[this.data.length + 5];

    // copy elements from old array into new one
    for(int i = 0; i < this.numberElements; i++) {
      grownArr[i] = this.data[i];
    }

    this.data = grownArr;
    
  }//end grow()

}//end class
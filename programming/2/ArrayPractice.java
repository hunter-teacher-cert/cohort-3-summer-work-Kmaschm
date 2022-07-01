/**
 * ArrayPractice by Team BossCoders
 * collaborators: 
 * AliseBraick
 * Usman, Ahmed - usman0527
 * Maschmeyer, Kate - kmaschm

 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray ✅
   2. buildRandomArray ✅
   3. printArray ✅
   4. arraySum ✅
   5. firstOccurence 
   6. isSorted ✅
   7. findMaxValue ✅
   8. countOdds ✅
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray ✅
   - printArray ✅
   - arraySum ✅
   - firstOccurence ✅
   - findMaxValue ✅

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray ✅
   - isSorted ✅
   - countOdds ✅

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value

     Returns:
     a new array of integers

     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    // loop through each element of the array and
    /* YOUR BRILLIANT CODE HERE */
    for(int i = 0; i < data.length; i++) {
        data[i] = startValue + i*step;
    }
      

    // assign the appropriate value to each one.
    /* YOUR BRILLIANT CODE HERE */

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use

     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    /* YOUR BRILLIANT CODE HERE */
      for(int i = 0; i < size; i++) {
          data[i] = r.nextInt(maxValue);
      }

    return data;
  }


  /**
     Parameters:
     data - an array of ints

     Returns:
     nothing

     prints out the array

     Note: data.length stores the length of the array
  */
  public static void printArray( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
      for(int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
    }
      System.out.println();
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for

     Returns:
     the index (location) of the first occurence of value

     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {
    int index = -1; // if the value is NOT in the array, return -1

    for(int i = 0; i < data.length; i++) {
        if(data[i] == value && index == -1) { // make sure we haven't seen it yet
            index = i;
        }
    }
    
    return index; // change this (it is just a placeholder to "get past" the compiler)
  }


  /**
     Parameters: data - an array of ints

     Returns: an integer that is equal to the sum of all the elements in the array

     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)

  */
  public static int arraySum( int[] data )
  {
    int sum = 0;
    for(int i = 0; i < data.length; i++) {
        sum += data[i];
    }

    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not

  */
  public static boolean isSorted( int[] data )
  {
    int currVal = data[0]; // where our pointer is
      
    for(int i = 0; i < data.length; i++) {
        if(currVal > data[i]) { // if 
            return false;
        } else { // it's still good, we'll move forward
            currVal = data[i];
        }
    }  
    // int i = 0;
    // while(i < data.length && currValue <= data[i]) {
    //     currValue = data[i];
    //     i++;
    // }

    return true; 

  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     value of the largest element in the array

    ***Assumes that all values in the array are 0 or greater!***

  */
  public static int findMaxValue( int[] data ) {
    int m = data[0];  // will hold the maximum value

    for(int i = 1; i < data.length; i++) {
        if(data[i] > m) {
            m = data[i];
        }
    }

    return m;
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    for(int i = 0; i < data.length; i++) {
        if(data[i] % 2 == 1) { // if value is odd
            count += 1;
        }
    }

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data ) {
    // Note: only need to go halfway across the array
    // check if the length is even (go up to halfway) or odd (go to 1 less than halfway)

      int halfIndex = (data.length % 2 == 1) ? data.length/2 : (data.length - 1)/2;
       
      int temp; // hold value for us temporarily
      
      for(int i = 0; i < halfIndex+1; i++) {
          temp = data[i];
          data[i] = data[data.length - i - 1];
          data[data.length - i - 1]  = temp;
      }
      
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    int[] data2 = buildIncreasingArray(10,5,3);
    printArray(data);
    printArray(data2);

    // add calls to show that the methods you write work.
      System.out.println(arraySum(data2));

    // test firstOccurence:
    int testVal = 20;
    int[] data3 = new int[]{0, 15, 20, 20, 20, 50}; // mult occurence
    int[] data4 = new int[]{0, 15, 21, 22, 23, 24};  // no occurence
      
      System.out.println("The first occurence of " + testVal + " in data2 is " + firstOccurence(data2, testVal));  // 5 (single occurence)
      System.out.println("The first occurence of " + testVal + " in data3 is " + firstOccurence(data3, testVal));  // 2 (mult occurence)
      System.out.println("The first occurence of " + testVal + " in data4 is " + firstOccurence(data4, testVal));  // -1 (no occurence)

      // testing findMaxValue
      System.out.println("Max value in data2 is: " + findMaxValue(data2));

      int[] negData = new int[]{-3, -5, -10, -2, -55};
      System.out.println("Max value in negData is: " + findMaxValue(negData));

      // testing isSorted
    int[] data5 = new int[]{0, 15, 20, 20, 20, 50}; // sorted
    int[] data6 = new int[]{0, 15, 21, 24, 23, 24};  // not sorted
      System.out.println("data5 is sorted: " + isSorted(data5));
      System.out.println("data6 is sorted: " + isSorted(data6));

    // testing countOdds
      System.out.println("Array: ");
      printArray(data);
      System.out.println("# of odds: " + countOdds(data));

      System.out.println("Array: ");
      printArray(data2);
      System.out.println("# of odds: " + countOdds(data2)); 
      
      System.out.println("Array: ");
      printArray(data3);
      System.out.println("# of odds: " + countOdds(data3)); 
      
      System.out.println("Array: ");
      printArray(data4);
      System.out.println("# of odds: " + countOdds(data4)); 
      
      System.out.println("Array: ");
      printArray(data5);
      System.out.println("# of odds: " + countOdds(data5)); 
      
      System.out.println("Array: ");
      printArray(data6);
      System.out.println("# of odds: " + countOdds(data6)); 

      flip(data2);
      printArray(data2);

      flip(negData);
      printArray(negData);
      
  }
}
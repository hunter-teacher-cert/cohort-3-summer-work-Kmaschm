import java.io.*;
import java.util.*;


/**
 * Driver class for Time class by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

    	//declare a var of appropriate type to assign an instance of Time to
    	Time t;
    
    	//assign var the address of a newly-apportioned Time object
    	t = new Time();
      System.out.println(t.toString());
    
      Time t2 = new Time(10, 4, 2);
      System.out.println(t2.toString());

      Time t3 = new Time();
      t3.set(5, 6, 7);
      System.out.println(t3.toString());

      t3.add(t2);
       System.out.println(t3.toString());
  }//end main()

}//end class
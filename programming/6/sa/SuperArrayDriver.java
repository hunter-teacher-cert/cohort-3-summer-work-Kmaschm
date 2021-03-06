import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);
  
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    System.out.println("Testing debug");
    System.out.println(sa.debug());
    // Temporarily set grow to public to test grow, have since reverted back to private
    // System.out.println("Testing grow");
    // sa.grow();
    // System.out.println(sa.debug());

  
    
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());

    System.out.println("Inspecting current SA");
    System.out.println(sa.debug());
    
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    //System.out.println(sa.debug());
    System.out.println(sa);

    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);

    System.out.println("\nTesting add at 25, expecting an index out of bounds error.");
    sa.add(25, 150);

    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);

    sa.remove(5);
    System.out.println(sa);

    sa.remove(15);
    System.out.println(sa);
System.out.println("\nTesting remove at 15 again, expecting an index out of bounds error.");
    sa.remove(15);
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver
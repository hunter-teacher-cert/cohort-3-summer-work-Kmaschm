import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(13);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);

  i = ss.findSmallestIndex(5);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);

  System.out.println("Linear search:" + ss.linearSearch(4));
  System.out.println("Binary search:" + ss.binarySearch(4));
  System.out.println("Recursive binary search:" + ss.binarySearchRecursive(4, 0, 14));
      
	


	      

    }
}
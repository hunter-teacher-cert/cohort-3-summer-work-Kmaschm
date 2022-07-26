import java.io.*;
import java.util.*;

/*
Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r;  // Random number generator

    
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<15;i++){
  	    data.add(r.nextInt(1000));
	    }
	
    }
    
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<size;i++){
  	    data.add(r.nextInt(1000));
	    }	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
    	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the other hand, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  
    public int findSmallestIndex(int start){
      if(start < 0 || start >= this.data.size()) {
        System.out.println("Index " + start + " is invalid.  Returning -1.");
        return -1;
      } else {
        int smallIndex = start;
        int smallValue = this.get(start);
        for(int i = smallIndex; i < this.data.size(); i++) {
          if(this.get(i) < smallValue) {
            smallIndex = i;
            smallValue = this.get(i);
          }
        }
    	  return smallIndex; // returns index of 1st time smallest is seen
      } 
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
    public void sort(){
      int minIndex;
      int temp;
  
      for(int i = 0; i < this.data.size(); i++) {
        minIndex = this.findSmallestIndex(i); // found smallest 

        // swap
        temp = this.get(i);
        this.data.set(i, this.get(minIndex));
        this.data.set(minIndex, temp);


        // different order of swap
        // temp = this.get(minIndex);
        // this.data.set(minIndex, this.get(i));
        // this.data.set(i, temp);
      }
      
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	    int index = -1;
      for(int i = 0; i < this.data.size(); i++) {
        if(this.get(i) == value) {
          index = i;
          return index;
        }
      }
	    return index; 
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
      // check that data is sorted.  If not, sort it first
      //this.builtinSort();
        
  	  // create assign variables  representing the high, low and middle indices
      int low = 0;
      int high = this.data.size()-1; 
      int mid = (low + high)/2;
      
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      while(high >= low) { 

        if(value == this.get(mid)) {
          return mid;
        } else if(value > this.get(mid)) { // check top half
          low = mid + 1;
          mid = (low + high) / 2;
          // high remains the same
        } else { // value < this.get(mid) <-- check bottom half
          // low remains the same 
          high = mid;
          mid = (low + high) / 2;
          
        } 
      
      }
      System.out.println("Value, " + value + ", not found.");
	    return -1;  // if not found
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      final int NOT_FOUND = -1; 
    
      int midIndex = (lowIndex + highIndex) / 2;
  
      if (lowIndex >  highIndex) { // end here
        System.out.println("Value, " + value + ", not found.");
        return NOT_FOUND;
      } else if( this.get(midIndex) == value) { // target found
        return midIndex;
      }  else if (value < this.get(midIndex)) { 
        // we need to look at the lower half, so set highIndex to 1 below current middle
        highIndex = midIndex - 1;
      } else { 
      //if (value > this.get(midIndex) ) { 
        // we need to look at the upper half, so set lowIndex to 1 above middle location
        lowIndex = midIndex + 1;
        
      }

      return binarySearchRecursive(value, lowIndex, highIndex);
    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	    Collections.sort(data);
	
    }

  /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */


  // Worked with Mike Randazzo, Seth Adams, and Alise Braick on merge
  public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      // code for merge
      ArrayList<Integer> mergedData = new ArrayList<Integer>();
      int counter1 = 0, counter2 = 0;
      int size1 = list1.size();
      int size2 = list2.size();
      while(counter1 < size1 && counter2 < size2) {
          if(list1.get(counter1) < list2.get(counter2)) {
              mergedData.add(list1.get(counter1));
              counter1++; 
          } else {
              mergedData.add(list2.get(counter2));
              counter2++; 
          }
       }
       if(size1 > counter1) {
         for(int i = counter1; i < size1; i++) {
            mergedData.add(list1.get(i));
         }
       }
      if(size2 > counter2) {
        for(int j = counter2; j < size2; j++) {
          mergedData.add(list2.get(j));
        }
      } 
       return mergedData;
}
    
    //   ArrayList<Integer> mergedList = new ArrayList<Integer>();

    //   while (list1.size() > 0 && list2.size() > 0 ) { // while both lists are not empty 
    //     if(list1.get(0) < list2.get(0)) {
    //      mergedList.add(list1.get(0));
    //      list1.remove(0);
    //    } else {
    //      mergedList.add(list2.get(0));
    //      list2.remove(0);
    //    }    
    //   }
    //   if(list1.size() > 0) {
    //     for(int i = 0; i < list1.size(); i++) {
    //       mergedList.add(list1.get(i));
    //     }
    //   } 
    //   if(list2.size() > 0) {
    //      for(int i = 0; i < list2.size(); i++) {
    //       mergedList.add(list2.get(i));
    //     }
    //   }
	   //  return mergedList; 
    // }


  
public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
      int size = list.size();
      // check for base case
      if(size < 2) {
        return list;
      } else {
        ArrayList<Integer> listLeft = new ArrayList<Integer>(list.subList(0, size/2)); // lower half
        ArrayList<Integer> listRight = new ArrayList<Integer>(list.subList(size/2, size)); // upper half
        ArrayList<Integer> sortedLeft = mergeSort(listLeft); // sorted lower
        ArrayList<Integer> sortedRight = mergeSort(listRight); // sorted upper
        ArrayList<Integer> sorted = merge(sortedLeft, sortedRight);
        return sorted;
      }
    
      // if not the base case
      // split in two lists
      // meregSort the left half
      // mergeSort the right half
      // merge them together into a new list
      // return that new list 

  }


  public void msort(){
      data = mergeSort(data);
  }    

  
    
}
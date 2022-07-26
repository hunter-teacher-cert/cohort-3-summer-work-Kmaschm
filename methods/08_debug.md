# Debugging Technique: Using print statements to track flow

## Contributors:
* Alise Braick
* Michael Randazzo
* Seth Adams
* Kate Maschmeyer

## General Usage
Code compiles and runs, but does not do what we want! 

## Array Practice - Looking at for loops
Before printing the entire array on one line: we can look at each index and its corresponding element to confirm we are incrementing correctly. We can repeat that for the reversed array to confirm the decrement



```java
public class ArrayPractice{
  
  public static void main (String[] args)
  {
    /* YOUR BRILLIANT CODE HERE */

    int [] data = {5, 8, 13, 7, 27, 2};
//Array values
    System.out.println("Printing in ascending order");
//Print a title
    for(int i=0; i<data.length; i++)
//Print array beging with  5 at index 0 through 2 at index 5      
     System.out.println("index [" + i + "] = " + data[i]);
    
    System.out.println();

  System.out.println("Printing in reversed order");
    for (int i=data.length-1; i>=0; i--)
     System.out.println("index [" + i + "] = " + data[i]);
   
  }
}
```






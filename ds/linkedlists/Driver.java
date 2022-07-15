import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println("Linked list l: " + l); // Linked list l:  (blank, since nothing's in it)
    System.out.println("Size of l: " + l.size());  // 
    
    l.add("one");
    l.add("two");
    
    System.out.println("Linked list l: " + l); // Linked list l: two->one->
  
    System.out.println("Item at index 0: " + l.get(0)); // two
    System.out.println("Item at index 1: " + l.get(1)); // one
    System.out.println("Item at index 2: " + l.get(2)); // Invalid index

    System.out.println("Size of l: " + l.size());  // 2
    
  }
}
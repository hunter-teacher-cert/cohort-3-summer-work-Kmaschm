import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println("Linked list l: " + l); // Linked list l:  (blank, since nothing's in it)
    System.out.println("Size of l: " + l.size());  // 
    
    l.add("one");
    l.add("two");
    
    System.out.println("Linked list l: " + l); // Linked list l: two->one->null
  
    System.out.println("Item at index 0: " + l.get(0)); // two
    System.out.println("Item at index 1: " + l.get(1)); // one
    System.out.println("Item at index 2: " + l.get(2)); // Invalid index

    System.out.println("Size of l: " + l.size());  // 2


    LinkedList l2 = new LinkedList();
    l2.add("d");
    l2.add("c");
    l2.add("b");
    l2.add("a");
    System.out.println("Linked list l2: " + l2);

    l2.add(1, "z");
    System.out.println("Linked list l2 after adding 'z' at 1: " + l2);

    l2.add(5, "q");
    System.out.println("Linked list l2 after adding 'q' at 5: " + l2);
    l2.add(0, "f");
    System.out.println("Linked list l2 after adding 'f' at 0: " + l2);

    System.out.println("Size of l2: " + l2.size()); 
    
    l2.add(7, "g");
    System.out.println("Linked list l2 after adding 'g' at 7: " + l2);

    l2.add(9, "!"); // should fail 
   

    System.out.println("Index of 'a' in l2: " + l2.indexOf("a"));

    System.out.println("Index of 'f' in l2: " + l2.indexOf("f"));

    System.out.println("Index of 'x' in l2: " + l2.indexOf("x"));

    String[] a = l2.toArray();
    for(int i = 0; i < a.length; i++) {
      System.out.println("a[" + i +"]: " +a[i]);
    }

    System.out.println("Remove " + l2.get(2) + " from list");
    l2.remove(2); 
    System.out.println(l2);

    System.out.println("Remove " + l2.get(0) + " from list");
    l2.remove(0); 
    System.out.println(l2);

    System.out.println("Attempting to remove invalid index from list l2");
    l2.remove(9); 
    System.out.println("Linked list l2: " + l2);

     System.out.println("Remove " + l2.get(5) + " from list");
    l2.remove(5); 
    System.out.println(l2);

    
  }
}
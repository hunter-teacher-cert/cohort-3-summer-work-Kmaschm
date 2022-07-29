//Contributors: Kate, Jerusha, Will, Maxwell
//Team 10
//Date 7-29-22

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	
	// Stack s = new Stack();
    Stack s = new Stack();
    
    int size = 20;
    //Random r = new Random();
      
    for(int i = 0; i < size; i++) {
      s.push(i);
    }
    System.out.println("------------------");  
    System.out.println("Stack  s: " + s.toString());
    System.out.println("Size: " + s.size());
    System.out.println("Empty? " + s.isEmpty());  
    System.out.println("Popping top value: " + s.top());  
    s.pop();
    System.out.println("Stack after popping top: " + s.toString());
    System.out.println("------------------"); 

    Stack s2 = new Stack();
	  System.out.println("Stack s2: " + s2.toString());
    System.out.println("Size: " + s2.size());
    System.out.println("Empty? " + s2.isEmpty()); 
        
    System.out.println("Popping top value: " + s2.top());  
    s2.pop();
    System.out.println("Stack after popping top: " + s2.toString());  
    



      
	  Queue q = new Queue();
    
    // int size = 20;
    // Random r = new Random();
      
    for(int i = 0; i < size; i++) {
      q.enqueue(i);
    }
    System.out.println("------------------");  
    System.out.println("Queue q: " + q.toString());
    System.out.println("Size: " + q.size());
    System.out.println("Empty? " + q.isEmpty());  
 
    System.out.println("Dequeueing front value: " + q.front());  
    q.dequeue();
    System.out.println("Queue after dequeueing: " + q.toString());
    System.out.println("------------------"); 

    Queue q2 = new Queue();
	  System.out.println("Queue q2: " + q2.toString());
    System.out.println("Size: " + q2.size());
    System.out.println("Empty? " + q2.isEmpty()); 
    System.out.println("Dequeueing front value: " + q2.front());  
    q2.dequeue();
    System.out.println("Queue after dequeueing front: " + q2.toString());  
    }
}
//Contributors: Kate, Jerusha, Will, Maxwell
//Team 10
//Date 7-29-22


import java.io.*;
import java.util.*;

public class Queue {

  //Recall, a queue is a First In First Out structure.
  
  // Place private instance variables here
  private ArrayList<Integer> data;

  
  // Place constructors here
  // A constructor with no parameters
  public Queue() {
    data = new ArrayList<Integer>();
  }


    // Place methods here
    // void enqueue(int value) - add value to the end of the queue
  public void enqueue(int value) {
    data.add(value);
  }
  
    
  // int dequeue() - remove and return the top value from front of the queue
  public int dequeue() {
    if(this.isEmpty()) {
      System.out.println("Queue is empty, returning " + Integer.MIN_VALUE);
      return Integer.MIN_VALUE;
    } else {
      int front = data.get(0);
      //System.out.println("Removing: " + top);
      data.remove(0);
      return front;
    }
    
  }
    
  // int front() - return but do not remove the top value from the front of the queue
  public int front() {
    if(this.isEmpty()) {
      System.out.println("Queue is empty, returning " + Integer.MIN_VALUE);
      return Integer.MIN_VALUE;
    } else {
      return data.get(0);
    }
  }
    
  // boolean isEmpty() - return true of the queue is empty, false otherwise
  public boolean isEmpty() {
    return data.isEmpty();
  }
    
  // int size() - return the number of elements currently in the queue
  public int size() {
    return data.size(); 
  }
    
  // boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
  // public boolean isFull() {
  //   return false; // change this
  // }

  public String toString() {
    String s = "[";
    for(int i = 0; i < data.size(); i++) {
      s += data.get(i) + " ";
    }
    s += "]";
    return s; 
  }
  

}
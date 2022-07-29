//Contributors: Kate, Jerusha, Will, Maxwell
//Team 10
//Date 7-29-22

import java.io.*;
import java.util.*;

public class Stack{

  //Recall, a stack is a Last In First Out structure.
    // Place private instance variables here
    ArrayList<Integer> data;

    // Place constructors here
  
    // A constructor with no parameters
    public Stack() {
      data = new ArrayList<Integer>();
    }

    // Place methods here
  // You should implement the following methods
  
  // void push(int value) - add value to the top of the stack
  public void push(int value) {
    data.add(0, value); // add at the top!
  }
  
  // int pop() - remove and return the top value from the stack
  public int pop() {
    if(this.isEmpty()) {
      System.out.println("Stack is empty, returning -1");
      return -1;
    } else {
      int top = data.get(0);
      //System.out.println("Removing: " + top);
      data.remove(0);
      return top;
    }
  }
  
  // int top() - return but do not remove the top value from the stack
  public int top() {
    if(this.isEmpty()) {
      System.out.println("Stack is empty, returning -1");
      return -1;
    } else {
      return data.get(0);
    }
  }
  
  // boolean isEmpty() - return true of the stack is empty, false otherwise
  public boolean isEmpty() {
    return data.isEmpty();
  }

  // int size() - return the number of elements currently in the stack
  public int size() {
    return data.size(); // change this
  }
  
  // boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
  // public boolean isFull() {
  //   return false; // change this
  // }
  
  // String toString() 
  public String toString() {
    String s = "[";
    for(int i = 0; i < data.size(); i++) {
      s += data.get(i) + " ";
    }
    s += "]";
    return s; 
  }
  

}
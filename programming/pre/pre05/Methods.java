
public class Methods {

  public static void main(String[] args) {

    // Testting the isDivisible method
    // boolean t = isDivisible(10,5);
    // System.out.println("10 is divisible by 5: " + t);
    // boolean u = isDivisible(10, 3);
    // System.out.println("10 is divisible by 3: " + u);
    // boolean v = isDivisible(5, 10);
    // System.out.println("5 is divisible by 10: " + v);

    // Testing the isTriangle method
    // System.out.println("Side lengths 3, 4, 5 can make a triangle: " + isTriangle(3, 4, 5));
    // // trivial triangle
    // System.out.println("Side lengths 3, 4, 7 can make a triangle: " + isTriangle(3, 4, 7));
    // //non-triangles
    // System.out.println("Side lengths 10, 3, 5 can make a triangle: " + isTriangle(10, 3, 5));
    // System.out.println("Side lengths 3, 10, 5 can make a triangle: " + isTriangle(3, 10, 5));
    // System.out.println("Side lengths 3, 5, 10 can make a triangle: " + isTriangle(3, 5, 10));

    System.out.println("The Ackermann function A(0, 1) is: " + ack(0, 1));
    System.out.println("The Ackermann function A(0, 3) is: " + ack(0, 3));
    System.out.println("The Ackermann function A(1, 1) is: " + ack(1, 1));
    System.out.println("The Ackermann function A(2, 1) is: " + ack(2, 1));
    System.out.println("The Ackermann function A(2, 2) is: " + ack(2, 2));
    System.out.println("The Ackermann function A(3, 3) is: " + ack(3, 3));
  }


  /**
  * Tests whether an integer is divisble by another
  *
  * @param  n integer that we test if it is divisible by m
  * @param  m integer that we check if it divides evenly into n
  * @return true if n is divisble by m, false otherwise
  */
  public static boolean isDivisible(int n, int m) {
    if(n % m == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
  * Tests to see if 3 side lengths can make a triangle
  ^
  * @param  a 1st integer side length
  * @param  b 2nd integer side length
  * @param  c 3rd integer side length
  * @return true if side lengths a, b, and c can make a triangle, false otherwise
  *
  * Note: if the sum of two sides is equal to the third side, this is considered a (trivial) triangle 
  */

  public static boolean isTriangle(int a, int b, int c) {
    if(a > b + c) {
      return false;
    } else if(b > a + c) {
      return false;
    } else if(c > a + b) {
      return false;
    } else {
      return true;
    }
  }

  /**
  * Takes in two integers and returns the value of the Ackermann function
  A(m, n) = {
    n + 1               if m = 0
    A(m-1, 1)           if m > 0 and n = 0
    A(m-1, A(m, n-1))   if m > 0 and n > 0
  }
  *
  * @param integer m
  * @param integer n
  * @return integer A(m,n) Ackermann function
  *
  */

  public static int ack(int m, int n) {
    if(m == 0) {
      return n + 1;
    } else if(m > 0 && n == 0) {
      return ack(m-1, 1);
    } else if(m > 0 && n > 0) {
      return ack(m-1, ack(m, n-1));
    } else {
      return -1; // error, something has gone wrong!
    }
  }

}
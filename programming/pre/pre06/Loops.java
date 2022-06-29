
public class Loops {

  public static void main(String[] args){
    //System.out.println(squareRoot(9));
    //System.out.println(squareRoot(12));
     System.out.println(power(2, 10));
    // System.out.println(factorial(6));

    /* Exercise 5 not needed:
    checking with x = 0.1, 1.0, 10.0, and 100.0
    double x = 0.1;
    for(int i = 1; i < 5; i++) {
      check(x);
      x *= 10.0;
     }
    */
    
    // values very accurate for small x, but not accurate for larger x:
    // 16 digits agree for x = 0.1
    // 16 digits agree for x = 1.0
    // 1 digit agrees for x = 10.0
    // 0 digits agree for x = 100.0

   /* Exercise 5, not needed
    checking with x-valuesL -0.1, -1.0, -10.0, and -100.0
    double y = -0.1;
    for(int i = 1; i < 5; i++) {
      check(y);
      y *= 10.0;
    }
    //values accirate for -0.1 and -1.0, but widly inaccurate for -10.0 and -100.0 */

  }

  // Exercise 2: squareRoot

  /**
  * Computes an approximation of the square root of a number
  *
  * @param  a   double of which we're finding the approximation of its square root 
  * @return     approximation of square root of a
  */
  public static double squareRoot(double a) {
    double currGuess = a/2;
    double newGuess;
    double diff;
    final double MARGIN_OF_DIFF = 0.0001;
      
    while(true) {
      newGuess = (currGuess + a/currGuess) / 2;
      diff = Math.abs(newGuess - currGuess);
   
     if (diff < MARGIN_OF_DIFF) { 
        break;
      }
      currGuess = newGuess;
    }
    return newGuess;
  }

  // Exercise 3: power

  /**
  * Computes given number to a given power: x^n
  * @param x double, base of power
  * @param n int, exponent (must be positive)
  * @return x^n
  * 
  */
  public static double power(double x, int n) {
    double result = 1; // allows n = 0
    for(int i = 0; i < n; i++) {
      result *= x;
    }
    return result;  // result = x^n
  }

  // Exercise 4: factorial

  /**
  * Computes the factorial of n: n!
  *
  * @param n  integer that we are finding the factorial of.  Must be >= 0
  * @returns n!
  */
  public static int factorial(int n) {
    int result = 1;
    if(n == 0) {
      return result;
    } else {
      for(int i = n; i > 1; i--) {
        result = result*i;
      }
    }
    return result;
  }

  // Exercise 5: myexp & check

  /**
  * Computes an approximation of e^x by summing the first n terms of the Taylor series 1 + x + x^2/2! + x^3/3! + x^4/4!+ ....
  *
  * @param x double
  * @param n int
  * @return approximation of e^x using first n terms of the Taylor series for e^x
  */
 /* 
public static double myexp(double x, int n) {
    double num = 1.0;
    double denom = 1.0;
    double approx = 1.0;
    for(int i = 1; i < n; i++) {
      num = num * x;
      denom = denom * i;
      approx = approx + num / denom;
    }
    return approx;
  } 
  */

/**
* Displays x, Taylor series approximation of e^x with first n terms, and Math.exp(x)
*
* @param x double
* @param n int
* 
*/
/* 
public static void check(double x) {
  int n = 18; // nearly matching when n = 18 for e^1
  System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
} 
*/



}

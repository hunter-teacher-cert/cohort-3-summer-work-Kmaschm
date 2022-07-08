/**
 * Rational class by Team BangPi
 * Kate Maschmeyer
 * collaborators: Nicole Cojuangco, Saranii Muller, Ashley Ufret
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    this._numerator = 0;
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    if(d == 0) {
      this._numerator = 0;
      this._denominator = 1;
    } else {
      this._numerator = n;
      this._denominator = d;
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return this._numerator + "/" + this._denominator; 
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    if(this._denominator != 0) {
      return (double) this._numerator / this._denominator; 
    } else { // should not get here!
      System.out.println("Invalid demonimator for division");
      return -1.0;
    }
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    this._numerator *= r._numerator;
    this._denominator *= r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  // Multiplying by the reciprocal of a fraction is equivalent to dividing by a fraction
  public void divide( Rational r )
  {
    multiply(r.reciprocal());
  }

  // helper function
  public Rational reciprocal() {
    // determine reciprocal
    if(this._numerator == 0) {
      System.out.println("Reciprocal creates invalid rational number; defaulting to 0/1");
    } 
    
      Rational r1 = new Rational(this._denominator, this._numerator);
      return r1;
  }

}//end class
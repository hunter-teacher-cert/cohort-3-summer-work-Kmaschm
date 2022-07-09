/**
 * Recursive String Reverser by Team Palindromotosis
 * Kate Maschmeyer
 * collaborators:
 * Alicia Wade
 * Marieke Thomas
 * Moo Joon Park
 * 
 * Work in file complete ✅
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    if(s.length() <= 1) { // empty string or string 1 character long
      return s;
    } else {
      return reverseR(s.substring(1)) + s.charAt(0);
    }

    /** Visual example (idea from Yeidi Levels)
      * reverseR("Kate") returns:
      *   reverseR("ate") + 'K'
      *   
      *    reverseR("ate") returns: 
      *      reverseR("te") + 'a'
      *
      *      reverseR("te") + 'a' returns:
      *        reverseR("e") + 't'
      *
      *        reverseR("e") + 't' returns: 
      *        "e"
      *
      * So we can walk back up: 
      *  "e"
      *  "e" + 't' --> "et"
      *  "et" + 'a' --> "eta"
      *  "eta" + 'K' --> "etaK" ✅
      * With concatenation, if any part of the concatenation is a String, the whole thing will become a String
      *        
    **/  
      
    
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );
  }
}
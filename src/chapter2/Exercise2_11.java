package chapter2;

/**
 * Exercise 2.11: Which statements contain variables whose values are MODIFIED?
 *
 * a) p = i + j + k + 7;                              -> YES: p is modified
 * b) System.out.println( "variables whose values are modified" ); -> NO
 * c) System.out.println( "a = 5" );                  -> NO (just prints text)
 * d) value = input.nextInt();                        -> YES: value is modified
 *
 * Rule: a variable is modified when it appears on the LEFT of an assignment.
 */
public class Exercise2_11
{
   public static void main( String[] args )
   {
      System.out.println( "Modified: (a) p   and   (d) value" );
      System.out.println( "Not modified: (b) and (c)" );
   } // end main
} // end class Exercise2_11

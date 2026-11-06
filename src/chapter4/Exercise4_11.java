// Exercise 4.11: What happens when a Java program divides one integer by another?
package chapter4;

public class Exercise4_11
{
   public static void main( String[] args )
   {
      System.out.println( "ANSWER: dividing two ints performs INTEGER division. The fractional part is" );
      System.out.println( "discarded (truncated, NOT rounded). To keep it, make at least one operand a" );
      System.out.println( "floating-point value, e.g. with the cast operator (double), or use doubles.\n" );

      int a = 7;
      int b = 2;

      System.out.println( "7 / 2                = " + ( a / b ) );            // 3   (fraction lost)
      System.out.println( "(double) a / b       = " + ( (double) a / b ) );   // 3.5
      System.out.println( "a / (double) b       = " + ( a / (double) b ) );   // 3.5
      System.out.println( "(double) ( a / b )   = " + (double) ( a / b ) );   // 3.0 - WRONG place for the cast!
      // the last line shows a common mistake: the division already happened using ints
   } // end main
} // end class Exercise4_11

// Exercise 5.13: Factorials of 1 through 20 using long, in tabular format.
package chapter5;

public class Exercise5_13
{
   public static void main( String[] args )
   {
      System.out.printf( "%-4s%25s\n", "n", "n!" );

      long factorial = 1;

      for ( int n = 1; n <= 20; n++ )
      {
         factorial *= n;
         System.out.printf( "%-4d%,25d\n", n, factorial );
      } // end for

      // WHAT DIFFICULTY PREVENTS 100! ?
      // long holds at most 9,223,372,036,854,775,807 (about 9.2 * 10^18). 20! (about 2.4 * 10^18)
      // still fits, but 21! does not: the value silently OVERFLOWS and wraps around.
      // 100! has 158 digits, so no primitive type can hold it
      // (Java's BigInteger class is designed for numbers that large).
      factorial *= 21;
      System.out.printf( "\n21! computed with long = %d  (overflow - wrong!)\n", factorial );
   } // end main
} // end class Exercise5_13

// Exercise 5.10: What does the following program do?
package chapter5;

public class Exercise5_10
{
   public static void main( String[] args )
   {
      // The OUTER loop runs 10 times (10 rows). For each row the INNER loop prints five '@'
      // side by side, then println() starts a new line.
      // RESULT: a solid rectangle of @ symbols, 10 rows tall and 5 columns wide.
      for ( int i = 1; i <= 10; i++ )
      {
         for ( int j = 1; j <= 5; j++ )
            System.out.print( '@' );

         System.out.println();
      } // end outer for
   } // end main
} // end class Exercise5_10

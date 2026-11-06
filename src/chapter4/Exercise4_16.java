// Exercise 4.16: What does the following program print?
package chapter4;

public class Exercise4_16
{
   public static void main( String[] args )
   {
      int y;
      int x = 1;
      int total = 0;

      // prints the squares 1, 4, 9, ..., 100 (one per line), then their total
      while ( x <= 10 )
      {
         y = x * x;
         System.out.println( y );
         total += y;
         ++x;
      } // end while

      System.out.printf( "Total is %d\n", total ); // Total is 385
   } // end main
} // end class Exercise4_16

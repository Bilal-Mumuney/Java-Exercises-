// Exercise 4.6 (Self-Review): Calculate the sum of the integers from 1 to 10.
package chapter4;

public class Exercise4_06
{
   public static void main( String[] args )
   {
      int sum;
      int x;

      x = 1;   // initialize x to 1 for counting
      sum = 0; // initialize sum to 0 for totaling

      while ( x <= 10 ) // while x is less than or equal to 10
      {
         sum += x; // add x to sum
         ++x;      // increment x
      } // end while

      System.out.printf( "The sum is: %d\n", sum ); // 55
   } // end main
} // end class Exercise4_06

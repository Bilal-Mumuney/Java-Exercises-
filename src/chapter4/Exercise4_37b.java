// Exercise 4.37 (b): Estimate e = 1 + 1/1! + 1/2! + 1/3! + ...  using n terms.
package chapter4;

import java.util.Scanner;

public class Exercise4_37b
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter the number of terms: " );
      int terms = input.nextInt();

      double e = 1.0;          // the leading "1"
      double factorial = 1.0;  // double avoids long overflow for larger term counts
      int term = 1;

      while ( term <= terms )
      {
         factorial *= term;    // 1!, 2!, 3!, ...
         e += 1.0 / factorial;
         ++term;
      }

      System.out.printf( "Estimated e = %.10f\n", e );
      System.out.printf( "Math.E      = %.10f\n", Math.E );
   } // end main
} // end class Exercise4_37b

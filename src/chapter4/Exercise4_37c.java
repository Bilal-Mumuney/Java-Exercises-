// Exercise 4.37 (c): Compute e^x = 1 + x/1! + x^2/2! + x^3/3! + ...  using n terms.
package chapter4;

import java.util.Scanner;

public class Exercise4_37c
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter x: " );
      double x = input.nextDouble();

      System.out.print( "Enter the number of terms: " );
      int terms = input.nextInt();

      double result = 1.0;     // the leading "1"
      double factorial = 1.0;
      double power = 1.0;      // x^term
      int term = 1;

      while ( term <= terms )
      {
         factorial *= term;    // term!
         power *= x;           // x^term
         result += power / factorial;
         ++term;
      }

      System.out.printf( "Estimated e^%.2f = %.10f\n", x, result );
      System.out.printf( "Math.exp(%.2f)   = %.10f\n", x, Math.exp( x ) );
   } // end main
} // end class Exercise4_37c

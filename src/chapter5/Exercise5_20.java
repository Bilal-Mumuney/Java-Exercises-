// Exercise 5.20: Calculating pi from the series  pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
// Prints a table for the first 200,000 terms and reports when the value first begins with 3.14159.
package chapter5;

public class Exercise5_20
{
   public static void main( String[] args )
   {
      double pi = 0.0;
      int sign = 1;                 // +1, -1, +1, ... alternates every term
      int firstTermFor314159 = 0;   // stays 0 until we find it

      System.out.printf( "%-10s%s\n", "Terms", "Approximation of pi" );

      for ( int term = 1; term <= 200000; term++ )
      {
         pi += sign * 4.0 / ( 2 * term - 1 ); // denominators 1, 3, 5, 7, ...
         sign = -sign;

         // first time the value begins 3.14159 (i.e. is in the range [3.14159, 3.14160) )
         if ( firstTermFor314159 == 0 && (long) ( pi * 100000 ) == 314159 )
            firstTermFor314159 = term;

         // table: the first few terms, then every 20,000th term
         if ( term <= 5 || term % 20000 == 0 )
            System.out.printf( "%-10d%.9f\n", term, pi );
      } // end for

      System.out.printf( "\nMath.PI = %.9f\n", Math.PI );
      System.out.printf( "The approximation first begins with 3.14159 at term %,d\n", firstTermFor314159 );
   } // end main
} // end class Exercise5_20

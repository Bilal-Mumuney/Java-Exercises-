// Exercise 4.37 (a): Factorial of a nonnegative integer.  n! = n * (n-1) * ... * 1, and 0! = 1.
package chapter4;

import java.util.Scanner;

public class Exercise4_37a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter a nonnegative integer: " );
      int n = input.nextInt();

      if ( n < 0 )
         System.out.println( "Error: n must be nonnegative." );
      else
      {
         long factorial = 1;   // also correct for n = 0
         int i = 2;

         while ( i <= n )
         {
            factorial *= i;
            ++i;
         }

         System.out.printf( "%d! = %d\n", n, factorial );
         // long overflows after 20!  (21! is too big for 64 bits)
      }
   } // end main
} // end class Exercise4_37a

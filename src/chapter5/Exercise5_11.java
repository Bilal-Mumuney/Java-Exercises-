// Exercise 5.11: Find the smallest of several integers.
// The FIRST value read says how many integers will follow.
package chapter5;

import java.util.Scanner;

public class Exercise5_11
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "How many integers will you enter? " );
      int count = input.nextInt();

      if ( count < 1 )
      {
         System.out.println( "There must be at least one integer." );
         return;
      }

      int smallest = 0;

      for ( int i = 1; i <= count; i++ )
      {
         System.out.printf( "Enter integer %d: ", i );
         int number = input.nextInt();

         // the first number is the smallest so far; afterwards compare
         if ( i == 1 || number < smallest )
            smallest = number;
      } // end for

      System.out.printf( "The smallest integer is %d\n", smallest );
   } // end main
} // end class Exercise5_11

// Exercise 2.15: Sum, product, difference and quotient of two integers.
package chapter2;

import java.util.Scanner;

public class Exercise2_15
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first integer: " );
      int number1 = input.nextInt();

      System.out.print( "Enter second integer: " );
      int number2 = input.nextInt();

      System.out.printf( "Sum        = %d\n", number1 + number2 );
      System.out.printf( "Product    = %d\n", number1 * number2 );
      System.out.printf( "Difference = %d\n", number1 - number2 );

      // dividing by zero with ints throws an exception, so guard against it
      if ( number2 != 0 )
         System.out.printf( "Quotient   = %d (integer division)\n", number1 / number2 );
      else
         System.out.println( "Quotient   = undefined (cannot divide by zero)" );
   } // end main
} // end class Exercise2_15

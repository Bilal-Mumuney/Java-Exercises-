// Exercise 2.26: Is the first integer a multiple of the second?
package chapter2;

import java.util.Scanner;

public class Exercise2_26
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first integer: " );
      int number1 = input.nextInt();

      System.out.print( "Enter second integer: " );
      int number2 = input.nextInt();

      if ( number2 == 0 ) // x % 0 would crash the program
         System.out.println( "The second integer cannot be 0." );

      if ( number2 != 0 && number1 % number2 == 0 )
         System.out.printf( "%d is a multiple of %d\n", number1, number2 );

      if ( number2 != 0 && number1 % number2 != 0 )
         System.out.printf( "%d is NOT a multiple of %d\n", number1, number2 );
   } // end main
} // end class Exercise2_26

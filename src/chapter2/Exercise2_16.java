// Exercise 2.16: Comparing integers - print the larger, or say they are equal.
package chapter2;

import java.util.Scanner;

public class Exercise2_16
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first integer: " );
      int number1 = input.nextInt();

      System.out.print( "Enter second integer: " );
      int number2 = input.nextInt();

      if ( number1 > number2 )
         System.out.printf( "%d is larger\n", number1 );

      if ( number2 > number1 )
         System.out.printf( "%d is larger\n", number2 );

      if ( number1 == number2 )
         System.out.println( "These numbers are equal" );
   } // end main
} // end class Exercise2_16

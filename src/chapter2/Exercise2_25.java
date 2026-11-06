// Exercise 2.25: Odd or even. An even number leaves remainder 0 when divided by 2.
package chapter2;

import java.util.Scanner;

public class Exercise2_25
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter an integer: " );
      int number = input.nextInt();

      if ( number % 2 == 0 )
         System.out.printf( "%d is even\n", number );

      if ( number % 2 != 0 )
         System.out.printf( "%d is odd\n", number );
   } // end main
} // end class Exercise2_25

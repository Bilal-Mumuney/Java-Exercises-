// Exercise 4.30: Palindromes - is a five-digit integer the same forwards and backwards?
package chapter4;

import java.util.Scanner;

public class Exercise4_30
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int number = 0;
      boolean valid = false;

      // not five digits long -> show an error message and ask again
      while ( !valid )
      {
         System.out.print( "Enter a five-digit integer: " );
         number = input.nextInt();

         if ( number >= 10000 && number <= 99999 )
            valid = true;
         else
            System.out.println( "Error: the number must be exactly five digits long." );
      } // end while

      int digit1 = number / 10000;         // leftmost digit
      int digit2 = number % 10000 / 1000;
      int digit4 = number % 100 / 10;
      int digit5 = number % 10;            // rightmost digit
      // (the middle digit does not matter for a palindrome)

      if ( digit1 == digit5 && digit2 == digit4 )
         System.out.printf( "%d is a palindrome\n", number );
      else
         System.out.printf( "%d is not a palindrome\n", number );
   } // end main
} // end class Exercise4_30

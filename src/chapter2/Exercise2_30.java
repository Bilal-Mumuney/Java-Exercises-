// Exercise 2.30: Separate the digits of a five-digit integer.
package chapter2;

import java.util.Scanner;

public class Exercise2_30
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter a five-digit number: " );
      int number = input.nextInt();

      // "pick off" digits: / removes the lower digits, % removes the higher ones
      int digit1 = number / 10000;       // 42339 / 10000 = 4
      int rest = number % 10000;         // 2339
      int digit2 = rest / 1000;          // 2
      rest = rest % 1000;                // 339
      int digit3 = rest / 100;           // 3
      rest = rest % 100;                 // 39
      int digit4 = rest / 10;            // 3
      int digit5 = rest % 10;            // 9

      System.out.printf( "%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5 );

      // QUESTIONS FROM THE BOOK
      // More than 5 digits (e.g. 123456): digit1 becomes 12, so the output is "12   3   4   5   6" (wrong).
      // Fewer than 5 digits (e.g. 123):   leading digits come out as 0, giving "0   0   1   2   3".
      // The program ASSUMES exactly five digits, so it breaks for anything else.
   } // end main
} // end class Exercise2_30

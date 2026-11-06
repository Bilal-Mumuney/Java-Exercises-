// Exercise 4.38 (Making a Difference): Encrypt a four-digit integer.
// Scheme: (1) replace each digit with ( digit + 7 ) % 10
//         (2) swap the 1st digit with the 3rd, and the 2nd digit with the 4th.
package chapter4;

import java.util.Scanner;

public class Exercise4_38_Encrypt
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter a four-digit integer to encrypt: " );
      int number = input.nextInt();

      if ( number < 0 || number > 9999 )
      {
         System.out.println( "Error: enter a four-digit integer." );
         return;
      }

      // pick off the four digits
      int digit1 = number / 1000;
      int digit2 = number % 1000 / 100;
      int digit3 = number % 100 / 10;
      int digit4 = number % 10;

      // step 1: add 7 and take the remainder after dividing by 10
      digit1 = ( digit1 + 7 ) % 10;
      digit2 = ( digit2 + 7 ) % 10;
      digit3 = ( digit3 + 7 ) % 10;
      digit4 = ( digit4 + 7 ) % 10;

      // step 2: swap 1st with 3rd, 2nd with 4th
      int temp = digit1;
      digit1 = digit3;
      digit3 = temp;

      temp = digit2;
      digit2 = digit4;
      digit4 = temp;

      // print digit by digit so a leading zero is kept (e.g. 0189)
      System.out.printf( "Encrypted: %d%d%d%d\n", digit1, digit2, digit3, digit4 );
   } // end main
} // end class Exercise4_38_Encrypt

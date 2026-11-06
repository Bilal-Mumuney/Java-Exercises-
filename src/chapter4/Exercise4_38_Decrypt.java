// Exercise 4.38 (Making a Difference): Decrypt a four-digit integer (reverse of the encryption).
// Undo step 2 first (swap back), then undo "+7 mod 10" with "+3 mod 10".
package chapter4;

import java.util.Scanner;

public class Exercise4_38_Decrypt
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter a four-digit encrypted integer: " );
      int number = input.nextInt();

      if ( number < 0 || number > 9999 )
      {
         System.out.println( "Error: enter a four-digit integer." );
         return;
      }

      int digit1 = number / 1000;
      int digit2 = number % 1000 / 100;
      int digit3 = number % 100 / 10;
      int digit4 = number % 10;

      // undo the swaps
      int temp = digit1;
      digit1 = digit3;
      digit3 = temp;

      temp = digit2;
      digit2 = digit4;
      digit4 = temp;

      // undo the +7: adding 3 and taking the remainder after dividing by 10 reverses it
      digit1 = ( digit1 + 3 ) % 10;
      digit2 = ( digit2 + 3 ) % 10;
      digit3 = ( digit3 + 3 ) % 10;
      digit4 = ( digit4 + 3 ) % 10;

      System.out.printf( "Decrypted: %d%d%d%d\n", digit1, digit2, digit3, digit4 );
   } // end main
} // end class Exercise4_38_Decrypt

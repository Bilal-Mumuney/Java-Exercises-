// Exercise 4.31: Decimal equivalent of a binary number (input contains only 0s and 1s).
package chapter4;

import java.util.Scanner;

public class Exercise4_31
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter a binary integer (only 0s and 1s, up to 10 digits): " );
      int binary = input.nextInt();
      int original = binary;

      int decimal = 0;
      int position = 1;     // positional value: 1, 2, 4, 8, ...
      boolean valid = true;

      while ( binary > 0 )
      {
         int digit = binary % 10;  // pick off the rightmost digit

         if ( digit > 1 )
            valid = false;         // not a binary digit

         decimal += digit * position;
         position *= 2;            // next digit to the left is worth twice as much
         binary /= 10;             // drop the rightmost digit
      } // end while

      if ( valid )
         System.out.printf( "%d in binary is %d in decimal\n", original, decimal );
      else
         System.out.println( "Error: a binary number can contain only 0s and 1s." );
   } // end main
} // end class Exercise4_31

// Exercise 5.25: Modified diamond - reads an odd number from 1 to 19 for the number of rows.
package chapter5;

import java.util.Scanner;

public class Exercise5_25
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      int size;

      do // ask until the value is odd and in the range 1-19
      {
         System.out.print( "Enter an odd number of rows (1-19): " );
         size = input.nextInt();
      } while ( size < 1 || size > 19 || size % 2 == 0 );

      int middleRow = ( size + 1 ) / 2; // the widest row

      for ( int row = 1; row <= size; row++ )
      {
         int stars = row <= middleRow ? 2 * row - 1 : 2 * ( size - row ) + 1;
         int spaces = ( size - stars ) / 2;

         for ( int space = 1; space <= spaces; space++ )
            System.out.print( ' ' );

         for ( int star = 1; star <= stars; star++ )
            System.out.print( '*' );

         System.out.println();
      } // end for
   } // end main
} // end class Exercise5_25

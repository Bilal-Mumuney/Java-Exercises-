// Exercise 4.29: Hollow square of asterisks (side length 1 to 20).
package chapter4;

import java.util.Scanner;

public class Exercise4_29
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter the side length (1-20): " );
      int side = input.nextInt();

      // keep asking until the side is between 1 and 20
      while ( side < 1 || side > 20 )
      {
         System.out.print( "Invalid. Enter the side length (1-20): " );
         side = input.nextInt();
      }

      int row = 1;
      while ( row <= side )
      {
         int column = 1;
         while ( column <= side )
         {
            // border cells get an asterisk; interior cells get a space
            if ( row == 1 || row == side || column == 1 || column == side )
               System.out.print( "*" );
            else
               System.out.print( " " );

            ++column;
         } // end column loop

         System.out.println();
         ++row;
      } // end row loop
   } // end main
} // end class Exercise4_29

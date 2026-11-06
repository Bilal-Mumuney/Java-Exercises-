// Exercise 4.24: Fig. 4.12 (Analysis) modified to validate its input.
// Any value other than 1 or 2 makes the program keep asking until a correct value is entered.
package chapter4;

import java.util.Scanner;

public class Exercise4_24
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int passes = 0;
      int failures = 0;
      int studentCounter = 1;
      int result;

      while ( studentCounter <= 10 )
      {
         System.out.print( "Enter result (1 = pass, 2 = fail): " );
         result = input.nextInt();

         // validation loop: repeat until the value is 1 or 2
         // (&& is the logical AND operator, introduced in Chapter 5)
         while ( result != 1 && result != 2 )
         {
            System.out.print( "Invalid input. Enter result (1 = pass, 2 = fail): " );
            result = input.nextInt();
         } // end validation loop

         if ( result == 1 )
            passes = passes + 1;
         else
            failures = failures + 1;

         studentCounter = studentCounter + 1;
      } // end while

      System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

      if ( passes > 8 )
         System.out.println( "Bonus to instructor!" );
   } // end main
} // end class Exercise4_24

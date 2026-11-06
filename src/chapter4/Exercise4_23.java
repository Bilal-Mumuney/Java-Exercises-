// Exercise 4.23: Find the TWO largest of 10 values. Each number may be input only once.
package chapter4;

import java.util.Scanner;

public class Exercise4_23
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int largest = 0;
      int secondLargest = 0;

      int counter = 1;
      while ( counter <= 10 )
      {
         System.out.printf( "Enter number %d: ", counter );
         int number = input.nextInt();

         if ( counter == 1 )
            largest = number;
         else if ( counter == 2 )
         {
            // order the first two numbers
            if ( number > largest )
            {
               secondLargest = largest;
               largest = number;
            }
            else
               secondLargest = number;
         }
         else if ( number > largest )   // new champion: old largest becomes second
         {
            secondLargest = largest;
            largest = number;
         }
         else if ( number > secondLargest ) // beats only the runner-up
            secondLargest = number;

         ++counter;
      } // end while

      System.out.printf( "Largest:        %d\n", largest );
      System.out.printf( "Second largest: %d\n", secondLargest );
   } // end main
} // end class Exercise4_23

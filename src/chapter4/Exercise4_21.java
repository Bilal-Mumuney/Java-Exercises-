// Exercise 4.21: Find the largest of 10 integers.
//
// PSEUDOCODE
//   Initialize counter to 1
//   Input the first number and let it be the largest so far
//   While counter is less than or equal to 10
//       Input the next number
//       If number is greater than largest, set largest to number
//       Add 1 to counter
//   Print largest
package chapter4;

import java.util.Scanner;

public class Exercise4_21
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int counter = 1;  // counts how many numbers have been input
      int number;       // the most recently input integer
      int largest;      // the largest number found so far

      System.out.print( "Enter number 1: " );
      number = input.nextInt();
      largest = number;  // first number is the largest so far (works even for all-negative input)
      counter = 2;

      while ( counter <= 10 )
      {
         System.out.printf( "Enter number %d: ", counter );
         number = input.nextInt();

         if ( number > largest )
            largest = number;

         ++counter;
      } // end while

      System.out.printf( "The largest number is %d\n", largest );
   } // end main
} // end class Exercise4_21

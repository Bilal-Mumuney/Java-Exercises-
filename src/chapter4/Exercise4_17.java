// Exercise 4.17: Gas mileage - sentinel-controlled repetition.
//
// PSEUDOCODE
//   Initialize total miles and total gallons to zero
//   Prompt for and read the first trip's miles
//   While miles is not the sentinel (-1)
//       Prompt for and read gallons
//       Add miles and gallons to the totals
//       Display miles per gallon for this trip and the combined miles per gallon so far
//       Prompt for and read the next trip's miles
package chapter4;

import java.util.Scanner;

public class Exercise4_17
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int totalMiles = 0;
      int totalGallons = 0;

      System.out.print( "Enter miles driven (-1 to quit): " );
      int miles = input.nextInt();

      while ( miles != -1 )
      {
         System.out.print( "Enter gallons used: " );
         int gallons = input.nextInt();

         if ( gallons > 0 ) // avoid dividing by zero
         {
            totalMiles += miles;
            totalGallons += gallons;

            // (double) makes the division floating point instead of integer
            double tripMpg = (double) miles / gallons;
            double combinedMpg = (double) totalMiles / totalGallons;

            System.out.printf( "MPG this trip: %.2f\n", tripMpg );
            System.out.printf( "Total MPG:     %.2f\n\n", combinedMpg );
         }
         else
            System.out.println( "Gallons must be greater than 0; trip ignored.\n" );

         System.out.print( "Enter miles driven (-1 to quit): " );
         miles = input.nextInt();
      } // end while
   } // end main
} // end class Exercise4_17

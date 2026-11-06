// Exercise 4.39 (Making a Difference): World population growth for the next 75 years.
// Assumes the growth rate stays constant (a simplifying assumption, as the book says).
// Do your own research for the current population and growth rate, then enter them.
package chapter4;

import java.util.Scanner;

public class Exercise4_39
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter the current world population: " );
      double startPopulation = input.nextDouble();

      System.out.print( "Enter the annual growth rate in percent (e.g. 1.0): " );
      double ratePercent = input.nextDouble();

      double population = startPopulation;
      int doublingYear = 0; // stays 0 until the population has doubled

      System.out.printf( "%-6s%22s%22s\n", "Year", "Population", "Increase" );

      int year = 1;
      while ( year <= 75 )
      {
         double increase = population * ratePercent / 100.0;
         population += increase;

         System.out.printf( "%-6d%,22.0f%,22.0f\n", year, population, increase );

         if ( doublingYear == 0 && population >= 2 * startPopulation )
            doublingYear = year;

         ++year;
      } // end while

      if ( doublingYear != 0 )
         System.out.printf( "\nThe population would double in year %d.\n", doublingYear );
      else
         System.out.println( "\nThe population would NOT double within 75 years at this rate." );
   } // end main
} // end class Exercise4_39

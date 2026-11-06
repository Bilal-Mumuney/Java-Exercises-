// Exercise 2.34: World population growth after 1 to 5 years.
package chapter2;

import java.util.Scanner;

public class Exercise2_34
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter current world population: " );
      double population = input.nextDouble();

      System.out.print( "Enter annual growth rate (percent, e.g. 1.0): " );
      double ratePercent = input.nextDouble();

      double factor = 1 + ratePercent / 100; // growth multiplier per year

      double year1 = population * factor;
      double year2 = year1 * factor;
      double year3 = year2 * factor;
      double year4 = year3 * factor;
      double year5 = year4 * factor;

      System.out.printf( "After 1 year : %,.0f\n", year1 );
      System.out.printf( "After 2 years: %,.0f\n", year2 );
      System.out.printf( "After 3 years: %,.0f\n", year3 );
      System.out.printf( "After 4 years: %,.0f\n", year4 );
      System.out.printf( "After 5 years: %,.0f\n", year5 );
   } // end main
} // end class Exercise2_34

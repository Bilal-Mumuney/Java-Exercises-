// Exercise 2.35: Car-pool savings calculator (daily cost of driving to work).
package chapter2;

import java.util.Scanner;

public class Exercise2_35
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Total miles driven per day: " );
      double miles = input.nextDouble();

      System.out.print( "Cost per gallon of gasoline: " );
      double gasPrice = input.nextDouble();

      System.out.print( "Average miles per gallon: " );
      double mpg = input.nextDouble();

      System.out.print( "Parking fees per day: " );
      double parking = input.nextDouble();

      System.out.print( "Tolls per day: " );
      double tolls = input.nextDouble();

      double gasCost = miles / mpg * gasPrice;
      double dailyCost = gasCost + parking + tolls;

      System.out.printf( "Gas cost per day:   $%.2f\n", gasCost );
      System.out.printf( "Total cost per day: $%.2f\n", dailyCost );
   } // end main
} // end class Exercise2_35

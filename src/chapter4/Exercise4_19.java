// Exercise 4.19: Sales commission calculator.
// $200 per week plus 9% of gross sales. Item values: 1 = 239.99, 2 = 129.75, 3 = 99.95, 4 = 350.89.
package chapter4;

import java.util.Scanner;

public class Exercise4_19
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double grossSales = 0.0;

      System.out.print( "Enter item number sold (1-4, or -1 to finish): " );
      int item = input.nextInt();

      while ( item != -1 ) // sentinel: there is no limit on the number of items sold
      {
         if ( item == 1 )
            grossSales += 239.99;
         else if ( item == 2 )
            grossSales += 129.75;
         else if ( item == 3 )
            grossSales += 99.95;
         else if ( item == 4 )
            grossSales += 350.89;
         else
            System.out.println( "Invalid item number - ignored." );

         System.out.print( "Enter item number sold (1-4, or -1 to finish): " );
         item = input.nextInt();
      } // end while

      double earnings = 200.0 + 0.09 * grossSales;

      System.out.printf( "Gross sales: $%,.2f\n", grossSales );
      System.out.printf( "Earnings:    $%,.2f\n", earnings );
   } // end main
} // end class Exercise4_19

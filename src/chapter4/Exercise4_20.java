// Exercise 4.20: Salary calculator - straight time for 40 hours, time and a half after that.
package chapter4;

import java.util.Scanner;

public class Exercise4_20
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int employee = 1;

      while ( employee <= 3 ) // counter-controlled: exactly three employees
      {
         System.out.printf( "Employee %d\n", employee );

         System.out.print( "  Enter hours worked: " );
         double hours = input.nextDouble();

         System.out.print( "  Enter hourly rate:  " );
         double rate = input.nextDouble();

         double grossPay;

         if ( hours <= 40 )
            grossPay = hours * rate;
         else
            grossPay = 40 * rate + ( hours - 40 ) * rate * 1.5; // overtime at 1.5x

         System.out.printf( "  Gross pay: $%,.2f\n\n", grossPay );

         ++employee;
      } // end while
   } // end main
} // end class Exercise4_20

// Exercise 5.31 (Making a Difference): FairTax estimate.
// Assumption taken from the book: a 23% consumption tax on everything you buy.
// This is a simple arithmetic estimate, not tax advice and not an endorsement of any proposal.
package chapter5;

import java.util.Scanner;

public class Exercise5_31
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double total = 0.0;

      // seven expense categories, named by a switch
      for ( int category = 1; category <= 7; category++ )
      {
         System.out.print( "Enter yearly spending on " );

         switch ( category )
         {
            case 1: System.out.print( "housing" );        break;
            case 2: System.out.print( "food" );           break;
            case 3: System.out.print( "clothing" );       break;
            case 4: System.out.print( "transportation" ); break;
            case 5: System.out.print( "education" );      break;
            case 6: System.out.print( "health care" );    break;
            case 7: System.out.print( "vacations" );      break;
         }

         System.out.print( ": $" );
         total += input.nextDouble();
      } // end for

      // The "23%" is a TAX-INCLUSIVE rate: tax is 23% of the total you pay.
      // If your amounts are what you actually PAID (tax included):
      double taxIfInclusive = total * 0.23;

      // The same tax expressed on the PRE-TAX price is 0.23 / 0.77 = about 29.9%
      // (this is why critics say the rate is closer to 30%).
      // If your amounts are PRE-TAX prices:
      double taxIfPreTax = total * ( 0.23 / 0.77 );

      System.out.printf( "\nTotal spending entered:                     $%,.2f\n", total );
      System.out.printf( "Estimated tax if amounts include the tax:  $%,.2f  (23%% of total)\n", taxIfInclusive );
      System.out.printf( "Estimated tax if amounts are pre-tax:      $%,.2f  (about 29.9%% of total)\n", taxIfPreTax );
   } // end main
} // end class Exercise5_31

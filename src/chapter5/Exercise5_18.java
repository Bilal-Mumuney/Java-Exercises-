// Exercise 5.18: Compound interest using ONLY integers.
// All money is kept as whole PENNIES. The amount is split into dollars and cents with / and %.
package chapter5;

public class Exercise5_18
{
   public static void main( String[] args )
   {
      int amountInPennies = 100000; // $1000.00 principal
      int ratePercent = 5;          // 5% interest

      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      for ( int year = 1; year <= 10; year++ )
      {
         // amount * ( 100 + rate ) / 100, plus 50 so the result is ROUNDED to the nearest penny
         amountInPennies = ( amountInPennies * ( 100 + ratePercent ) + 50 ) / 100;

         int dollars = amountInPennies / 100;
         int cents = amountInPennies % 100;

         // %02d pads the cents with a leading zero (e.g. .05); the period is inserted by us
         System.out.printf( "%4d%,17d.%02d\n", year, dollars, cents );
      } // end for

      // NOTE: each year's amount is rounded to a whole penny BEFORE the next year is calculated,
      // so small rounding errors add up: after 10 years the result is 1,628.91 instead of the
      // 1,628.89 shown for Fig. 5.6 (which keeps full precision and rounds only when it prints).
      // That is the trade-off of integer-only money arithmetic.
   } // end main
} // end class Exercise5_18

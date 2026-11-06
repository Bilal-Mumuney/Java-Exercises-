// Exercise 5.14: Compound interest (Fig. 5.6) repeated for rates of 5%, 6%, 7%, 8%, 9% and 10%.
package chapter5;

public class Exercise5_14
{
   public static void main( String[] args )
   {
      double principal = 1000.0;

      // the outer loop varies the rate; an INTEGER percent avoids floating-point drift
      for ( int percent = 5; percent <= 10; percent++ )
      {
         double rate = percent / 100.0;

         System.out.printf( "\nInterest rate: %d%%\n", percent );
         System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

         for ( int year = 1; year <= 10; year++ )
         {
            double amount = principal * Math.pow( 1.0 + rate, year );
            System.out.printf( "%4d%,20.2f\n", year, amount );
         } // end inner for
      } // end outer for
   } // end main
} // end class Exercise5_14

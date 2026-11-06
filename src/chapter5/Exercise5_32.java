// Exercise 5.32 (Making a Difference): Facebook user-base growth at 5% per month, starting from
// 500 million users (July 2010). How many months to reach 1 billion and 2 billion users?
package chapter5;

public class Exercise5_32
{
   public static void main( String[] args )
   {
      double users = 500000000.0;
      int months = 0;
      int monthsToBillion = 0;
      int monthsToTwoBillion = 0;

      while ( users < 2000000000.0 )
      {
         users *= 1.05; // 5% growth per month
         months++;

         if ( monthsToBillion == 0 && users >= 1000000000.0 )
            monthsToBillion = months;
      } // end while

      monthsToTwoBillion = months;

      System.out.printf( "Months to reach 1 billion users: %d\n", monthsToBillion );
      System.out.printf( "Months to reach 2 billion users: %d\n", monthsToTwoBillion );
   } // end main
} // end class Exercise5_32

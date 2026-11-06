// Exercise 3.15: Test application for class Date.
package chapter3;

public class DateTest
{
   public static void main( String[] args )
   {
      Date date = new Date( 10, 26, 2026 );

      System.out.print( "Initial date: " );
      date.displayDate();

      date.setMonth( 12 );
      date.setDay( 25 );
      date.setYear( 2027 );

      System.out.print( "After set methods: " );
      date.displayDate();

      System.out.printf( "Month: %d, Day: %d, Year: %d\n",
         date.getMonth(), date.getDay(), date.getYear() );
   } // end main
} // end class DateTest

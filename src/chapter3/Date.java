// Exercise 3.15: Date class (month, day, year).
package chapter3;

public class Date
{
   private int month;
   private int day;
   private int year;

   // assumes the values provided are correct
   public Date( int m, int d, int y )
   {
      month = m;
      day = d;
      year = y;
   }

   public void setMonth( int m )
   {
      month = m;
   }

   public int getMonth()
   {
      return month;
   }

   public void setDay( int d )
   {
      day = d;
   }

   public int getDay()
   {
      return day;
   }

   public void setYear( int y )
   {
      year = y;
   }

   public int getYear()
   {
      return year;
   }

   // display month/day/year separated by forward slashes
   public void displayDate()
   {
      System.out.printf( "%d/%d/%d\n", month, day, year );
   }
} // end class Date

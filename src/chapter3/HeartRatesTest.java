// Exercise 3.16: Test application for class HeartRates.
package chapter3;

import java.util.Scanner;

public class HeartRatesTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first name: " );
      String first = input.next();
      System.out.print( "Enter last name: " );
      String last = input.next();
      System.out.print( "Enter birth month (1-12): " );
      int month = input.nextInt();
      System.out.print( "Enter birth day: " );
      int day = input.nextInt();
      System.out.print( "Enter birth year: " );
      int year = input.nextInt();

      HeartRates person = new HeartRates( first, last, month, day, year );

      System.out.printf( "\nName:          %s %s\n", person.getFirstName(), person.getLastName() );
      System.out.printf( "Date of birth: %d/%d/%d\n", person.getBirthMonth(),
         person.getBirthDay(), person.getBirthYear() );
      System.out.printf( "Age:           %d years\n", person.getAge() );
      System.out.printf( "Max heart rate: %d beats per minute\n", person.getMaximumHeartRate() );
      System.out.printf( "Target range:   %.1f - %.1f beats per minute\n",
         person.getTargetHeartRateLow(), person.getTargetHeartRateHigh() );
   } // end main
} // end class HeartRatesTest

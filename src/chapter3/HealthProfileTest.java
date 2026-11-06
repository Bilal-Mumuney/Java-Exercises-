// Exercise 3.17: Test application for class HealthProfile.
package chapter3;

import java.util.Scanner;

public class HealthProfileTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first name: " );
      String first = input.next();
      System.out.print( "Enter last name: " );
      String last = input.next();
      System.out.print( "Enter gender: " );
      String gender = input.next();
      System.out.print( "Enter birth month (1-12): " );
      int month = input.nextInt();
      System.out.print( "Enter birth day: " );
      int day = input.nextInt();
      System.out.print( "Enter birth year: " );
      int year = input.nextInt();
      System.out.print( "Enter height in inches: " );
      double height = input.nextDouble();
      System.out.print( "Enter weight in pounds: " );
      double weight = input.nextDouble();

      HealthProfile profile = new HealthProfile( first, last, gender, month, day, year, height, weight );

      System.out.printf( "\nName:          %s %s\n", profile.getFirstName(), profile.getLastName() );
      System.out.printf( "Gender:        %s\n", profile.getGender() );
      System.out.printf( "Date of birth: %d/%d/%d\n", profile.getBirthMonth(),
         profile.getBirthDay(), profile.getBirthYear() );
      System.out.printf( "Height:        %.1f inches\n", profile.getHeight() );
      System.out.printf( "Weight:        %.1f pounds\n", profile.getWeight() );
      System.out.printf( "Age:           %d years\n", profile.getAge() );
      System.out.printf( "BMI:           %.1f\n", profile.getBMI() );
      System.out.printf( "Max heart rate: %d beats per minute\n", profile.getMaximumHeartRate() );
      System.out.printf( "Target range:   %.1f - %.1f beats per minute\n",
         profile.getTargetHeartRateLow(), profile.getTargetHeartRateHigh() );

      System.out.println( "\nBMI VALUES" );
      System.out.println( "Underweight: less than 18.5" );
      System.out.println( "Normal:      between 18.5 and 24.9" );
      System.out.println( "Overweight:  between 25 and 29.9" );
      System.out.println( "Obese:       30 or greater" );
   } // end main
} // end class HealthProfileTest

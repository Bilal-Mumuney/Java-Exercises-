// Exercise 2.33: Body Mass Index calculator.
package chapter2;

import java.util.Scanner;

public class Exercise2_33
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter weight in pounds: " );
      double weight = input.nextDouble();

      System.out.print( "Enter height in inches: " );
      double height = input.nextDouble();

      // double is used because int would truncate the result (see book note)
      double bmi = weight * 703 / ( height * height );

      System.out.printf( "Your BMI is %.1f\n\n", bmi );
      System.out.println( "BMI VALUES" );
      System.out.println( "Underweight: less than 18.5" );
      System.out.println( "Normal:      between 18.5 and 24.9" );
      System.out.println( "Overweight:  between 25 and 29.9" );
      System.out.println( "Obese:       30 or greater" );
   } // end main
} // end class Exercise2_33

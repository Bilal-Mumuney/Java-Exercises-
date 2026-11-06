// Exercise 2.28: Diameter, circumference and area of a circle.
package chapter2;

import java.util.Scanner;

public class Exercise2_28
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter the radius (integer): " );
      int radius = input.nextInt();

      // calculations are done directly inside printf (no result variables)
      // diameter = 2r is an int, so it uses %d; the other two are floating point (%f)
      System.out.printf( "Diameter      = %d\n", 2 * radius );
      System.out.printf( "Circumference = %f\n", 2 * Math.PI * radius );
      System.out.printf( "Area          = %f\n", Math.PI * radius * radius );
   } // end main
} // end class Exercise2_28

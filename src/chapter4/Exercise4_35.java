// Exercise 4.35: Could three nonzero values be the sides of a triangle?
// Rule: the sum of any two sides must be GREATER than the third side.
package chapter4;

import java.util.Scanner;

public class Exercise4_35
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter side 1: " );
      double side1 = input.nextDouble();
      System.out.print( "Enter side 2: " );
      double side2 = input.nextDouble();
      System.out.print( "Enter side 3: " );
      double side3 = input.nextDouble();

      if ( side1 <= 0 || side2 <= 0 || side3 <= 0 )
         System.out.println( "Error: all sides must be greater than zero." );
      else if ( side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 )
         System.out.println( "These values CAN be the sides of a triangle." );
      else
         System.out.println( "These values can NOT be the sides of a triangle." );
   } // end main
} // end class Exercise4_35

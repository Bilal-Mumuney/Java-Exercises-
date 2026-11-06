// Exercise 4.36: Could three nonzero integers be the sides of a RIGHT triangle?
// Pythagorean theorem: a*a + b*b == c*c, where c is the longest side (hypotenuse).
package chapter4;

import java.util.Scanner;

public class Exercise4_36
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter side 1: " );
      int a = input.nextInt();
      System.out.print( "Enter side 2: " );
      int b = input.nextInt();
      System.out.print( "Enter side 3: " );
      int c = input.nextInt();

      if ( a <= 0 || b <= 0 || c <= 0 )
         System.out.println( "Error: all sides must be greater than zero." );
      // any of the three could be the hypotenuse, so test all three possibilities
      else if ( a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a )
         System.out.println( "These values CAN be the sides of a right triangle." );
      else
         System.out.println( "These values can NOT be the sides of a right triangle." );
   } // end main
} // end class Exercise4_36

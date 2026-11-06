// Exercise 2.17: Sum, average, product, smallest and largest of three integers.
package chapter2;

import java.util.Scanner;

public class Exercise2_17
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first integer: " );
      int x = input.nextInt();
      System.out.print( "Enter second integer: " );
      int y = input.nextInt();
      System.out.print( "Enter third integer: " );
      int z = input.nextInt();

      int sum = x + y + z;
      int average = sum / 3;   // integer division: 7 / 3 is 2, not 2.3333
      int product = x * y * z;

      // start by assuming x is both smallest and largest, then compare with y and z
      int smallest = x;
      int largest = x;

      if ( y < smallest )
         smallest = y;
      if ( z < smallest )
         smallest = z;

      if ( y > largest )
         largest = y;
      if ( z > largest )
         largest = z;

      System.out.printf( "Sum is %d\n", sum );
      System.out.printf( "Average is %d\n", average );
      System.out.printf( "Product is %d\n", product );
      System.out.printf( "Smallest is %d\n", smallest );
      System.out.printf( "Largest is %d\n", largest );
   } // end main
} // end class Exercise2_17

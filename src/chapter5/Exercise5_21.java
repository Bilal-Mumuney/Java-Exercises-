// Exercise 5.21: Pythagorean triples with all sides no larger than 500.
// Brute force: a triple-nested for loop tries every possibility.
package chapter5;

public class Exercise5_21
{
   public static void main( String[] args )
   {
      int count = 0;

      System.out.printf( "%-8s%-8s%-12s\n", "side1", "side2", "hypotenuse" );

      // side2 starts at side1 and hypotenuse at side2, so (3,4,5) is shown once, not also as (4,3,5)
      for ( int side1 = 1; side1 <= 500; side1++ )
      {
         for ( int side2 = side1; side2 <= 500; side2++ )
         {
            for ( int hypotenuse = side2; hypotenuse <= 500; hypotenuse++ )
            {
               if ( side1 * side1 + side2 * side2 == hypotenuse * hypotenuse )
               {
                  System.out.printf( "%-8d%-8d%-12d\n", side1, side2, hypotenuse );
                  count++;
               }
            } // end hypotenuse loop
         } // end side2 loop
      } // end side1 loop

      System.out.printf( "\nTotal Pythagorean triples found: %d\n", count );
   } // end main
} // end class Exercise5_21

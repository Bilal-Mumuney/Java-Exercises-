// Exercise 5.12: Product of the odd integers from 1 to 15.
package chapter5;

public class Exercise5_12
{
   public static void main( String[] args )
   {
      int product = 1;

      for ( int number = 1; number <= 15; number += 2 ) // 1, 3, 5, ..., 15
         product *= number;

      System.out.printf( "Product of the odd integers 1 to 15 = %d\n", product ); // 2027025
   } // end main
} // end class Exercise5_12

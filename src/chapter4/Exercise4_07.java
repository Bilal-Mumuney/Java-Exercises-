// Exercise 4.7 (Self-Review): Values of product and x after  product *= x++;  (both start at 5)
package chapter4;

public class Exercise4_07
{
   public static void main( String[] args )
   {
      int product = 5;
      int x = 5;

      // x++ is POST-increment: the OLD value of x (5) is used in the multiplication,
      // and only afterwards x becomes 6.   product = 5 * 5 = 25
      product *= x++;

      System.out.println( "product = " + product + ", x = " + x ); // product = 25, x = 6
   } // end main
} // end class Exercise4_07

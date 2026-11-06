// Exercise 4.4 (Self-Review): Write Java statements for each task.
package chapter4;

public class Exercise4_04
{
   public static void main( String[] args )
   {
      int x = 5, y = 3, z, count = 12, total = 100, q = 17, divisor = 5;

      // a) one statement: assign the sum of x and y to z, then increment x by 1
      z = x++ + y;                       // x is used (5), THEN incremented
      System.out.println( "a) z = " + z + ", x = " + x ); // z = 8, x = 6

      // b) test whether count is greater than 10
      if ( count > 10 )
         System.out.println( "b) Count is greater than 10" );

      // c) one statement: decrement x by 1, then subtract it from total
      total -= --x;                      // x becomes 5 first, then total = 100 - 5
      System.out.println( "c) total = " + total + ", x = " + x ); // total = 95, x = 5

      // d) remainder of q / divisor assigned to q - two ways
      int q2 = q;
      q %= divisor;
      q2 = q2 % divisor;
      System.out.println( "d) q = " + q + ", q2 = " + q2 ); // both 2
   } // end main
} // end class Exercise4_04

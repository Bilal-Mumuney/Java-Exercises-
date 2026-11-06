// Exercise 2.10: What does each statement display? (x = 2, y = 3)
package chapter2;

public class Exercise2_10
{
   public static void main( String[] args )
   {
      int x = 2;
      int y = 3;

      System.out.printf( "x = %d\n", x );                                // a) x = 2
      System.out.printf( "Value of %d + %d is %d\n", x, x, ( x + x ) );  // b) Value of 2 + 2 is 4
      System.out.printf( "x =" );                                        // c) x =   (no newline)
      System.out.printf( "%d = %d\n", ( x + y ), ( y + x ) );            // d) 5 = 5
      // Note: (c) has no \n, so (d)'s output continues on the same line: "x =5 = 5"
   } // end main
} // end class Exercise2_10

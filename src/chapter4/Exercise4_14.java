// Exercise 4.14: Difference between preincrementing and postincrementing a variable.
package chapter4;

public class Exercise4_14
{
   public static void main( String[] args )
   {
      System.out.println( "PREincrement  (++x): x is incremented FIRST, then the new value is used." );
      System.out.println( "POSTincrement (x++): the CURRENT value is used first, THEN x is incremented.\n" );

      int x = 5;
      int y = ++x;     // x becomes 6, then y gets 6
      System.out.println( "y = ++x  ->  x = " + x + ", y = " + y ); // x = 6, y = 6

      x = 5;
      y = x++;         // y gets 5, then x becomes 6
      System.out.println( "y = x++  ->  x = " + x + ", y = " + y ); // x = 6, y = 5

      // when used as a statement by itself, ++x and x++ have exactly the same effect
   } // end main
} // end class Exercise4_14

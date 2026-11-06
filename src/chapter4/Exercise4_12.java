// Exercise 4.12: Describe the two ways in which control statements can be combined.
package chapter4;

public class Exercise4_12
{
   public static void main( String[] args )
   {
      System.out.println( "1) STACKING: control statements placed one after another (sequence)." );
      System.out.println( "2) NESTING: one control statement placed inside the body of another.\n" );

      // stacking: a while, then an if, one after the other
      int counter = 1;
      while ( counter <= 3 )
         ++counter;

      if ( counter == 4 )
         System.out.println( "stacked: while finished, then the if ran (counter = " + counter + ")" );

      // nesting: an if inside a while
      int n = 1;
      while ( n <= 4 )
      {
         if ( n % 2 == 0 )                      // nested inside the while body
            System.out.println( "nested: " + n + " is even" );
         ++n;
      }
   } // end main
} // end class Exercise4_12

// Exercise 2.14: Display the numbers 1 to 4 on the same line, separated by a space.
package chapter2;

public class Exercise2_14
{
   public static void main( String[] args )
   {
      // a) one System.out.println statement
      System.out.println( "1 2 3 4" );

      // b) four System.out.print statements
      System.out.print( "1 " );
      System.out.print( "2 " );
      System.out.print( "3 " );
      System.out.println( "4" );

      // c) one System.out.printf statement
      System.out.printf( "%d %d %d %d\n", 1, 2, 3, 4 );
   } // end main
} // end class Exercise2_14

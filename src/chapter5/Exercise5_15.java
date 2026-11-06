// Exercise 5.15: Triangle printing. Asterisks are printed ONLY with System.out.print( '*' ).
package chapter5;

public class Exercise5_15
{
   public static void main( String[] args )
   {
      // (a) row i has i asterisks
      System.out.println( "(a)" );
      for ( int row = 1; row <= 10; row++ )
      {
         for ( int star = 1; star <= row; star++ )
            System.out.print( '*' );
         System.out.println();
      }

      // (b) row i has 11 - i asterisks
      System.out.println( "\n(b)" );
      for ( int row = 1; row <= 10; row++ )
      {
         for ( int star = 1; star <= 11 - row; star++ )
            System.out.print( '*' );
         System.out.println();
      }

      // (c) row i starts with ( i - 1 ) spaces, then 11 - i asterisks
      System.out.println( "\n(c)" );
      for ( int row = 1; row <= 10; row++ )
      {
         for ( int space = 1; space <= row - 1; space++ )
            System.out.print( ' ' );
         for ( int star = 1; star <= 11 - row; star++ )
            System.out.print( '*' );
         System.out.println();
      }

      // (d) row i starts with ( 10 - i ) spaces, then i asterisks
      System.out.println( "\n(d)" );
      for ( int row = 1; row <= 10; row++ )
      {
         for ( int space = 1; space <= 10 - row; space++ )
            System.out.print( ' ' );
         for ( int star = 1; star <= row; star++ )
            System.out.print( '*' );
         System.out.println();
      }
   } // end main
} // end class Exercise5_15

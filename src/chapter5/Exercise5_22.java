// Exercise 5.22: The four triangles of Exercise 5.15 printed SIDE BY SIDE.
package chapter5;

public class Exercise5_22
{
   public static void main( String[] args )
   {
      for ( int row = 1; row <= 10; row++ )
      {
         // (a) row i: first i columns are asterisks
         for ( int column = 1; column <= 10; column++ )
            System.out.print( column <= row ? '*' : ' ' );
         System.out.print( "  " );

         // (b) row i: first 11 - i columns are asterisks
         for ( int column = 1; column <= 10; column++ )
            System.out.print( column <= 11 - row ? '*' : ' ' );
         System.out.print( "  " );

         // (c) row i: columns i..10 are asterisks (left side padded with spaces)
         for ( int column = 1; column <= 10; column++ )
            System.out.print( column >= row ? '*' : ' ' );
         System.out.print( "  " );

         // (d) row i: the last i columns are asterisks
         for ( int column = 1; column <= 10; column++ )
            System.out.print( column >= 11 - row ? '*' : ' ' );

         System.out.println();
      } // end for
   } // end main
} // end class Exercise5_22

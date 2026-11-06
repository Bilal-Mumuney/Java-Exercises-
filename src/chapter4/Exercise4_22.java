// Exercise 4.22: Tabular output using a loop.
package chapter4;

public class Exercise4_22
{
   public static void main( String[] args )
   {
      System.out.printf( "%-8s%-8s%-8s%-8s\n\n", "N", "10*N", "100*N", "1000*N" );

      int n = 1;
      while ( n <= 5 )
      {
         System.out.printf( "%-8d%-8d%-8d%-8d\n", n, 10 * n, 100 * n, 1000 * n );
         ++n;
      } // end while
   } // end main
} // end class Exercise4_22

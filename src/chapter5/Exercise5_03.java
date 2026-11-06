// Exercise 5.3 (Self-Review): Write a Java statement or set of statements for each task.
package chapter5;

public class Exercise5_03
{
   public static void main( String[] args )
   {
      // a) sum the odd integers between 1 and 99 using a for statement
      int sum;
      int count;
      sum = 0;
      for ( count = 1; count <= 99; count += 2 )
         sum += count;
      System.out.println( "a) sum of odd integers 1-99 = " + sum ); // 2500

      // b) 2.5 raised to the power of 3, using the pow method
      double result = Math.pow( 2.5, 3 );
      System.out.println( "b) 2.5 ^ 3 = " + result ); // 15.625

      // c) print 1 to 20 with a while loop, five integers per line
      int i;          // declared but not initialized yet
      i = 1;
      System.out.println( "c)" );
      while ( i <= 20 )
      {
         System.out.print( i );

         if ( i % 5 == 0 )          // every fifth number ends the line
            System.out.println();
         else
            System.out.print( '\t' );

         ++i;
      }

      // d) the same as (c) using a for statement
      System.out.println( "d)" );
      for ( i = 1; i <= 20; i++ )
      {
         System.out.print( i );

         if ( i % 5 == 0 )
            System.out.println();
         else
            System.out.print( '\t' );
      }
   } // end main
} // end class Exercise5_03

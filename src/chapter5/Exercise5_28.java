package chapter5;

/**
 * Exercise 5.28: How to remove a continue statement from a loop (and Fig. 5.13 rewritten).
 *
 * GENERAL TECHNIQUE: continue skips the rest of the loop body. Replace it by wrapping the
 * statements that FOLLOW it in an if whose condition is the OPPOSITE of the continue condition.
 * (In a while loop, make sure the increment is not skipped - keep it outside that if.)
 */
public class Exercise5_28
{
   public static void main( String[] args )
   {
      // ---- original Fig. 5.13 (uses continue) ----
      for ( int count = 1; count <= 10; count++ )
      {
         if ( count == 5 )
            continue;

         System.out.printf( "%d ", count );
      }
      System.out.println( "\nUsed continue to skip printing 5" );

      // ---- the same program WITHOUT continue ----
      for ( int count = 1; count <= 10; count++ )
      {
         if ( count != 5 )                     // opposite of the continue condition
            System.out.printf( "%d ", count );
      }
      System.out.println( "\nSkipped printing 5 without continue" );
   } // end main
} // end class Exercise5_28

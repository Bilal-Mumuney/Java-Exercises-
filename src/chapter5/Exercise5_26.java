package chapter5;

/**
 * Exercise 5.26: How to remove a break statement from a loop (and Fig. 5.12 rewritten).
 *
 * GENERAL TECHNIQUE: break leaves a loop from the BODY. The only other way out is for the
 * loop-continuation test to fail. So put the "break condition" into the loop-continuation
 * test (using && with the original test, negated), and put the rest of the body under an if
 * (or skip it) when that condition is not met. If the condition depends on things computed
 * inside the body, use a boolean flag that the body sets and the loop test checks.
 */
public class Exercise5_26
{
   public static void main( String[] args )
   {
      // ---- original Fig. 5.12 (uses break) ----
      int count;

      for ( count = 1; count <= 10; count++ )
      {
         if ( count == 5 )
            break;

         System.out.printf( "%d ", count );
      }
      System.out.printf( "\nBroke out of loop at count = %d\n", count );

      // ---- the same program WITHOUT break ----
      // the break condition ( count == 5 ) becomes ( count != 5 ) in the loop-continuation test
      for ( count = 1; count <= 10 && count != 5; count++ )
         System.out.printf( "%d ", count );

      System.out.printf( "\nLeft the loop at count = %d (no break used)\n", count );
   } // end main
} // end class Exercise5_26

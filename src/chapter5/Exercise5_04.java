package chapter5;

/**
 * Exercise 5.4 (Self-Review): Find the error in each code segment and explain how to correct it.
 *
 * a) i = 1;
 *    while ( i <= 10 );
 *       ++i;
 *    }
 *    ERROR: the semicolon after the while header is an empty body -> infinite loop (and the
 *           left brace is missing). FIX: replace the ; with { , or remove both the ; and the }.
 *
 * b) for ( k = 0.1; k != 1.0; k += 0.1 )
 *       System.out.println( k );
 *    ERROR: floating-point numbers are only approximations, so k may never EXACTLY equal 1.0
 *           (infinite loop). FIX: control the loop with an integer and divide.
 *
 * c) switch ( n ) { case 1: println("The number is 1");  case 2: println(...); break; ... }
 *    ERROR: no break after case 1, so execution FALLS THROUGH into case 2.
 *    FIX:   add break; at the end of case 1 (unless fall-through is intended).
 *
 * d) n = 1;
 *    while ( n < 10 )
 *       System.out.println( n++ );
 *    ERROR: wrong operator - it prints only 1 to 9. FIX: use <= 10 (or change 10 to 11).
 */
public class Exercise5_04
{
   public static void main( String[] args )
   {
      // (a) corrected
      int i = 1;
      while ( i <= 10 )
      {
         ++i;
      }
      System.out.println( "a) i ended at " + i ); // 11

      // (b) corrected: integer control variable, then divide
      System.out.print( "b) " );
      for ( int k = 1; k != 10; k++ )
         System.out.print( (double) k / 10 + " " );
      System.out.println();

      // (c) corrected, with n = 1
      int n = 1;
      switch ( n )
      {
         case 1:
            System.out.println( "c) The number is 1" );
            break;            // the missing break
         case 2:
            System.out.println( "c) The number is 2" );
            break;
         default:
            System.out.println( "c) The number is not 1 or 2" );
            break;
      }

      // (d) corrected
      n = 1;
      System.out.print( "d) " );
      while ( n <= 10 )
         System.out.print( n++ + " " );
      System.out.println();
   } // end main
} // end class Exercise5_04

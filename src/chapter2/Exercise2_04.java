package chapter2;

/**
 * Exercise 2.4 (Self-Review): Identify and correct the errors.
 *
 * a)  if ( c < 7 );
 *        System.out.println( "c is less than 7" );
 *
 *     ERROR: a semicolon right after the condition creates an EMPTY STATEMENT,
 *            so the println runs ALWAYS (a logic error, not a syntax error).
 *     FIX:   remove the semicolon.
 *
 * b)  if ( c => 7 )
 *        System.out.println( "c is equal to or greater than 7" );
 *
 *     ERROR: "=>" is not a Java operator (syntax error).
 *     FIX:   use ">=".
 */
public class Exercise2_04
{
   public static void main( String[] args )
   {
      int c = 5;

      // (a) corrected
      if ( c < 7 )
         System.out.println( "c is less than 7" );

      // (b) corrected
      if ( c >= 7 )
         System.out.println( "c is equal to or greater than 7" );

      // What the BUGGY version of (a) would do with c = 10:
      // the println would still run, because "if ( c < 7 );" ends the if.
   } // end main
} // end class Exercise2_04

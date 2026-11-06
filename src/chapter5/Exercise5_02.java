package chapter5;

/**
 * Exercise 5.2 (Self-Review): True or false? If false, explain.
 *
 * a) The default case is required in the switch selection statement.
 * b) The break statement is required in the last case of a switch selection statement.
 * c) The expression ( ( x > y ) && ( a < b ) ) is true if either x > y is true or a < b is true.
 * d) An expression containing the || operator is true if either or both of its operands are true.
 * e) The comma (,) formatting flag in a format specifier (e.g., %,20.2f) indicates that a value
 *    should be output with a thousands separator.
 * f) To test for a range of values in a switch statement, use a hyphen (-) between the start
 *    and end values of the range in a case label.
 * g) Listing cases consecutively with no statements between them enables the cases to perform
 *    the same set of statements.
 */
public class Exercise5_02
{
   public static void main( String[] args )
   {
      System.out.println( "a) FALSE - default is optional; omit it if no default action is needed." );
      System.out.println( "b) FALSE - break exits the switch; the last case reaches the end anyway." );
      System.out.println( "c) FALSE - && needs BOTH operands true; || is the 'either' operator." );
      System.out.println( "d) TRUE" );
      System.out.println( "e) TRUE" );
      System.out.println( "f) FALSE - switch cannot test ranges; list every value in its own case label." );
      System.out.println( "g) TRUE (this is called fall-through)" );

      // proof for (e)
      System.out.printf( "\nProof for (e): %%,20.2f of 1234567.891 gives [%,20.2f]\n", 1234567.891 );
   } // end main
} // end class Exercise5_02

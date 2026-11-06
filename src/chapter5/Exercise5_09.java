package chapter5;

/**
 * Exercise 5.9: Find and correct the error(s) in each segment of code.
 *
 * a) For ( i = 100, i >= 1, i++ )
 *       System.out.println( i );
 *    ERRORS: (1) keyword must be lowercase: for;  (2) the header parts are separated by
 *            semicolons, not commas;  (3) i++ counts UP, so it never reaches the end - use i--.
 *
 * b) switch ( value % 2 )
 *    {
 *       case 0:
 *          System.out.println( "Even integer" );
 *       case 1:
 *          System.out.println( "Odd integer" );
 *    }
 *    ERROR: no break after case 0, so an even number prints "Even integer" AND "Odd integer".
 *
 * c) for ( i = 19; i >= 1; i += 2 )
 *       System.out.println( i );
 *    ERROR: i += 2 moves away from 1 (infinite loop). Use i -= 2.
 *
 * d) counter = 2;
 *    do { System.out.println( counter ); counter += 2; } While ( counter < 100 );
 *    ERRORS: (1) keyword must be lowercase: while;  (2) counter < 100 stops before printing 100;
 *            use counter <= 100.
 */
public class Exercise5_09
{
   public static void main( String[] args )
   {
      int i;

      // (a) corrected (printed on one line to keep the output short)
      System.out.print( "a) " );
      for ( i = 100; i >= 95; i-- )          // shortened range for the demo: 100..95
         System.out.print( i + " " );
      System.out.println( "..." );

      // (b) corrected, tested with value = 4 and then value = 7
      int value = 4;
      switch ( value % 2 )
      {
         case 0:
            System.out.println( "b) Even integer" );
            break;
         case 1:
            System.out.println( "b) Odd integer" );
            break;
      }

      value = 7;
      switch ( value % 2 )
      {
         case 0:
            System.out.println( "b) Even integer" );
            break;
         case 1:
            System.out.println( "b) Odd integer" );
            break;
      }

      // (c) corrected: odd integers from 19 down to 1
      System.out.print( "c) " );
      for ( i = 19; i >= 1; i -= 2 )
         System.out.print( i + " " );
      System.out.println();

      // (d) corrected: even integers from 2 to 100 (last few shown)
      int counter = 2;
      System.out.print( "d) ... " );
      do
      {
         if ( counter >= 92 )
            System.out.print( counter + " " );
         counter += 2;
      } while ( counter <= 100 );
      System.out.println();
   } // end main
} // end class Exercise5_09

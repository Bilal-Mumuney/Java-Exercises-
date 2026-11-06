package chapter4;

/**
 * Exercise 4.15: Identify and correct the errors (there may be more than one in each).
 *
 * a) if ( age >= 65 );
 *       System.out.println( "Age is greater than or equal to 65" );
 *    else
 *       System.out.println( "Age is less than 65 )";
 *    ERRORS: (1) the semicolon after the condition ends the if, so the else has no matching if
 *                (compile error);
 *            (2) the closing quote is misplaced: "Age is less than 65 )";  ->  "Age is less than 65" );
 *
 * b) int x = 1, total;
 *    while ( x <= 10 ) { total += x; ++x; }
 *    ERROR: total is never initialized, so total += x uses an unassigned variable (compile error).
 *    FIX:   int x = 1, total = 0;
 *
 * c) while ( x <= 100 )
 *       total += x;
 *       ++x;
 *    ERROR: without braces only total += x is in the loop; ++x is outside, so x never changes
 *           (infinite loop).  FIX: put both statements in braces.
 *
 * d) while ( y > 0 )
 *    {
 *       System.out.println( y );
 *       ++y;
 *    ERRORS: (1) the closing brace of the while is missing;
 *            (2) ++y makes y bigger, so y > 0 stays true forever (infinite loop). Use --y.
 */
public class Exercise4_15
{
   public static void main( String[] args )
   {
      // (a) corrected
      int age = 70;
      if ( age >= 65 )
         System.out.println( "a) Age is greater than or equal to 65" );
      else
         System.out.println( "a) Age is less than 65" );

      // (b) corrected
      int x = 1, total = 0;
      while ( x <= 10 )
      {
         total += x;
         ++x;
      }
      System.out.println( "b) total = " + total ); // 55

      // (c) corrected
      int x2 = 1, total2 = 0;
      while ( x2 <= 100 )
      {
         total2 += x2;
         ++x2;
      }
      System.out.println( "c) total2 = " + total2 ); // 5050

      // (d) corrected
      int y = 3;
      System.out.print( "d) " );
      while ( y > 0 )
      {
         System.out.print( y + " " );
         --y;
      }
      System.out.println();
   } // end main
} // end class Exercise4_15

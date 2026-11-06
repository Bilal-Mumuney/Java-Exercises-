package chapter4;

/**
 * Exercise 4.8 (Self-Review): Identify and correct the errors.
 *
 * a) while ( c <= 5 )
 *    {
 *       product *= c;
 *       ++c;
 *    ERROR: the closing right brace of the while body is missing.
 *    FIX:   add } after ++c;
 *
 * b) if ( gender == 1 )
 *       System.out.println( "Woman" );
 *    else;
 *       System.out.println( "Man" );
 *    ERROR: the semicolon after else is an EMPTY STATEMENT, so "Man" ALWAYS prints (logic error).
 *    FIX:   remove the semicolon after else.
 */
public class Exercise4_08
{
   public static void main( String[] args )
   {
      // (a) corrected
      int c = 1;
      int product = 1;

      while ( c <= 5 )
      {
         product *= c;
         ++c;
      } // the missing brace
      System.out.println( "a) product = " + product ); // 120

      // (b) corrected
      int gender = 1;

      if ( gender == 1 )
         System.out.println( "b) Woman" );
      else
         System.out.println( "b) Man" );
   } // end main
} // end class Exercise4_08

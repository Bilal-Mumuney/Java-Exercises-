package chapter4;

/**
 * Exercise 4.10: Compare and contrast the if single-selection statement and the while
 * repetition statement. How are they similar? How are they different?
 */
public class Exercise4_10
{
   public static void main( String[] args )
   {
      System.out.println( "SIMILAR:" );
      System.out.println( " - Both test a condition (a boolean expression) and execute their body only when it is true." );
      System.out.println( " - Both control one statement, or a block of statements enclosed in braces." );
      System.out.println( "DIFFERENT:" );
      System.out.println( " - if executes its body AT MOST ONCE, then the program moves on." );
      System.out.println( " - while re-tests the condition after every pass and keeps repeating while it is true." );
      System.out.println( " - A while body must change something that affects the condition, or the loop never ends." );

      int number = 3;
      if ( number > 0 )                 // runs once
         System.out.println( "if: printed once" );

      while ( number > 0 )              // runs three times
      {
         System.out.println( "while: pass with number = " + number );
         --number;
      }
   } // end main
} // end class Exercise4_10

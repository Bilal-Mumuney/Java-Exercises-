// Exercise 5.6: Compare and contrast the while and for repetition statements.
package chapter5;

public class Exercise5_06
{
   public static void main( String[] args )
   {
      System.out.println( "SIMILAR: both repeat a body while a loop-continuation condition is true," );
      System.out.println( "and both test the condition BEFORE each pass (the body may run zero times)." );
      System.out.println( "DIFFERENT: for puts the initialization, the condition and the increment all" );
      System.out.println( "in its header, which suits counter-controlled loops and keeps the control" );
      System.out.println( "variable local to the loop. while has only the condition, so the setup and" );
      System.out.println( "update live elsewhere - best when the number of iterations is not known." );
      System.out.println( "Also: with continue, a for runs its increment but a while does NOT.\n" );

      // the same loop written both ways
      int i = 1;
      while ( i <= 3 )
      {
         System.out.print( "while: " + i + "  " );
         i++;
      }
      System.out.println();

      for ( int j = 1; j <= 3; j++ )
         System.out.print( "for:   " + j + "  " );
      System.out.println();
   } // end main
} // end class Exercise5_06

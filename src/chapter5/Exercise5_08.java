// Exercise 5.8: Compare and contrast the break and continue statements.
package chapter5;

public class Exercise5_08
{
   public static void main( String[] args )
   {
      System.out.println( "SIMILAR: both change the normal flow of a loop and are usually used inside an if." );
      System.out.println( "break    - exits the loop (or switch) IMMEDIATELY; execution continues after it." );
      System.out.println( "continue - skips the REST of the current iteration and goes on to the NEXT one" );
      System.out.println( "           (in a for loop the increment still runs first).\n" );

      System.out.print( "with break:    " );
      for ( int i = 1; i <= 8; i++ )
      {
         if ( i == 4 )
            break;                 // loop ends here
         System.out.print( i + " " );
      }
      System.out.println();       // 1 2 3

      System.out.print( "with continue: " );
      for ( int i = 1; i <= 8; i++ )
      {
         if ( i == 4 )
            continue;              // only 4 is skipped
         System.out.print( i + " " );
      }
      System.out.println();       // 1 2 3 5 6 7 8
   } // end main
} // end class Exercise5_08

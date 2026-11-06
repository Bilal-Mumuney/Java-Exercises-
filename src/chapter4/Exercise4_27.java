// Exercise 4.27: Dangling-else problem. Output when x = 9, y = 11 and when x = 11, y = 9.
// An else ALWAYS belongs to the nearest preceding if, unless braces say otherwise.
package chapter4;

public class Exercise4_27
{
   public static void main( String[] args )
   {
      // ---------- (a) properly indented ----------
      // if ( x < 10 )
      //    if ( y > 10 )
      //       print *****
      //    else                // belongs to the INNER if ( y > 10 )
      //       print #####
      // print $$$$$             // not part of any if - ALWAYS runs

      System.out.println( "(a) x = 9, y = 11  ->  expected: *****  then  $$$$$" );
      {
         int x = 9;
         int y = 11;
         if ( x < 10 )
            if ( y > 10 )
               System.out.println( "*****" );
            else
               System.out.println( "#####" );
         System.out.println( "$$$$$" );
      }

      System.out.println( "\n(a) x = 11, y = 9  ->  expected: $$$$$  (outer if is false)" );
      {
         int x = 11;
         int y = 9;
         if ( x < 10 )
            if ( y > 10 )
               System.out.println( "*****" );
            else
               System.out.println( "#####" );
         System.out.println( "$$$$$" );
      }

      // ---------- (b) braces change which if the else belongs to ----------
      System.out.println( "\n(b) x = 9, y = 11  ->  expected: *****" );
      {
         int x = 9;
         int y = 11;
         if ( x < 10 )
         {
            if ( y > 10 )
               System.out.println( "*****" );
         }
         else
         {
            System.out.println( "#####" );
            System.out.println( "$$$$$" );
         }
      }

      System.out.println( "\n(b) x = 11, y = 9  ->  expected: #####  then  $$$$$" );
      {
         int x = 11;
         int y = 9;
         if ( x < 10 )
         {
            if ( y > 10 )
               System.out.println( "*****" );
         }
         else
         {
            System.out.println( "#####" );
            System.out.println( "$$$$$" );
         }
      }
   } // end main
} // end class Exercise4_27

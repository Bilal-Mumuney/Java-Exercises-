// Exercise 4.28: Another dangling-else problem. Only braces and indentation may change.
//
// Original code (indentation removed):
//    if ( y == 8 )
//    if ( x == 5 )
//    System.out.println( "@@@@@" );
//    else
//    System.out.println( "#####" );
//    System.out.println( "$$$$$" );
//    System.out.println( "&&&&&" );
package chapter4;

public class Exercise4_28
{
   public static void main( String[] args )
   {
      // (a) x = 5, y = 8  ->  @@@@@  $$$$$  &&&&&
      //     NO change needed: the else pairs with the inner if, and the last two
      //     println statements are not part of any if, so they always run.
      System.out.println( "(a)" );
      {
         int x = 5;
         int y = 8;
         if ( y == 8 )
            if ( x == 5 )
               System.out.println( "@@@@@" );
            else
               System.out.println( "#####" );
         System.out.println( "$$$$$" );
         System.out.println( "&&&&&" );
      }

      // (b) x = 5, y = 8  ->  @@@@@ only
      //     Put the three statements after the else in a BLOCK, so they run only when x != 5.
      System.out.println( "\n(b)" );
      {
         int x = 5;
         int y = 8;
         if ( y == 8 )
            if ( x == 5 )
               System.out.println( "@@@@@" );
            else
            {
               System.out.println( "#####" );
               System.out.println( "$$$$$" );
               System.out.println( "&&&&&" );
            }
      }

      // (c) x = 5, y = 8  ->  @@@@@ only  (the book lists the same output as (b))
      //     Another valid answer: also wrap the whole inner if...else in braces for clarity.
      System.out.println( "\n(c)" );
      {
         int x = 5;
         int y = 8;
         if ( y == 8 )
         {
            if ( x == 5 )
               System.out.println( "@@@@@" );
            else
            {
               System.out.println( "#####" );
               System.out.println( "$$$$$" );
               System.out.println( "&&&&&" );
            }
         }
      }

      // (d) x = 5, y = 7  ->  #####  $$$$$  &&&&&
      //     Braces around the inner if make the else belong to the OUTER if ( y == 8 ).
      System.out.println( "\n(d)" );
      {
         int x = 5;
         int y = 7;
         if ( y == 8 )
         {
            if ( x == 5 )
               System.out.println( "@@@@@" );
         }
         else
         {
            System.out.println( "#####" );
            System.out.println( "$$$$$" );
            System.out.println( "&&&&&" );
         }
      }
   } // end main
} // end class Exercise4_28

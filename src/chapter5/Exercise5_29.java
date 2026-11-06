
package chapter5;

public class Exercise5_29
{
   public static void main( String[] args )
   {
      for ( int day = 1; day <= 12; day++ )
      {
         // ---- switch #1: the ordinal word for the day ----
         System.out.print( "Verse for the " );

         switch ( day )
         {
            case 1:  System.out.print( "first" );   break;
            case 2:  System.out.print( "second" );  break;
            case 3:  System.out.print( "third" );   break;
            case 4:  System.out.print( "fourth" );  break;
            case 5:  System.out.print( "fifth" );   break;
            case 6:  System.out.print( "sixth" );   break;
            case 7:  System.out.print( "seventh" ); break;
            case 8:  System.out.print( "eighth" );  break;
            case 9:  System.out.print( "ninth" );   break;
            case 10: System.out.print( "tenth" );   break;
            case 11: System.out.print( "eleventh" ); break;
            case 12: System.out.print( "twelfth" ); break;
         }

         System.out.println( " day:" );

         // Opening line of the verse
         System.out.println( "On this day of Christmas, my true love sent to me:" );

         // ---- switch #2: the gifts, using fall-through ----
         switch ( day )
         {
            case 12:
               System.out.println( "Twelve drummers drumming," );
            case 11:
               System.out.println( "Eleven pipers piping," );
            case 10:
               System.out.println( "Ten lords a-leaping," );
            case 9:
               System.out.println( "Nine ladies dancing," );
            case 8:
               System.out.println( "Eight maids a-milking," );
            case 7:
               System.out.println( "Seven swans a-swimming," );
            case 6:
               System.out.println( "Six geese a-laying," );
            case 5:
               System.out.println( "Five gold rings," );
            case 4:
               System.out.println( "Four calling birds," );
            case 3:
               System.out.println( "Three French hens," );
            case 2:
               System.out.println( "Two turtle doves," );
            case 1:
               System.out.println( "And a partridge in a pear tree." );
               break;
         }

         System.out.println();
      }
   }
}

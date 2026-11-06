// Exercise 5.23: De Morgan's laws.
//    !( c1 && c2 )  is equivalent to  ( !c1 || !c2 )
//    !( c1 || c2 )  is equivalent to  ( !c1 && !c2 )
// For each expression we write the equivalent form, then PROVE they agree by testing many values.
package chapter5;

public class Exercise5_23
{
   public static void main( String[] args )
   {
      int checked;
      int mismatches;

      // (a) !( x < 5 ) && !( y >= 7 )     ==     !( ( x < 5 ) || ( y >= 7 ) )
      checked = 0;
      mismatches = 0;
      for ( int x = 0; x <= 12; x++ )
         for ( int y = 0; y <= 12; y++ )
         {
            boolean original = !( x < 5 ) && !( y >= 7 );
            boolean equivalent = !( ( x < 5 ) || ( y >= 7 ) );
            checked++;
            if ( original != equivalent )
               mismatches++;
         }
      System.out.printf( "(a) !( x < 5 ) && !( y >= 7 )  ==  !( ( x < 5 ) || ( y >= 7 ) )\n" );
      System.out.printf( "    combinations checked: %d, mismatches: %d\n\n", checked, mismatches );

      // (b) !( a == b ) || !( g != 5 )    ==     !( ( a == b ) && ( g != 5 ) )
      checked = 0;
      mismatches = 0;
      for ( int a = 0; a <= 12; a++ )
         for ( int b = 0; b <= 12; b++ )
            for ( int g = 3; g <= 7; g++ )
            {
               boolean original = !( a == b ) || !( g != 5 );
               boolean equivalent = !( ( a == b ) && ( g != 5 ) );
               checked++;
               if ( original != equivalent )
                  mismatches++;
            }
      System.out.printf( "(b) !( a == b ) || !( g != 5 )  ==  !( ( a == b ) && ( g != 5 ) )\n" );
      System.out.printf( "    combinations checked: %d, mismatches: %d\n\n", checked, mismatches );

      // (c) !( ( x <= 8 ) && ( y > 4 ) )   ==     !( x <= 8 ) || !( y > 4 )     [ = ( x > 8 ) || ( y <= 4 ) ]
      checked = 0;
      mismatches = 0;
      for ( int x = 0; x <= 12; x++ )
         for ( int y = 0; y <= 12; y++ )
         {
            boolean original = !( ( x <= 8 ) && ( y > 4 ) );
            boolean equivalent = !( x <= 8 ) || !( y > 4 );
            checked++;
            if ( original != equivalent )
               mismatches++;
         }
      System.out.printf( "(c) !( ( x <= 8 ) && ( y > 4 ) )  ==  !( x <= 8 ) || !( y > 4 )\n" );
      System.out.printf( "    combinations checked: %d, mismatches: %d\n\n", checked, mismatches );

      // (d) !( ( i > 4 ) || ( j <= 6 ) )   ==     !( i > 4 ) && !( j <= 6 )     [ = ( i <= 4 ) && ( j > 6 ) ]
      checked = 0;
      mismatches = 0;
      for ( int i = 0; i <= 12; i++ )
         for ( int j = 0; j <= 12; j++ )
         {
            boolean original = !( ( i > 4 ) || ( j <= 6 ) );
            boolean equivalent = !( i > 4 ) && !( j <= 6 );
            checked++;
            if ( original != equivalent )
               mismatches++;
         }
      System.out.printf( "(d) !( ( i > 4 ) || ( j <= 6 ) )  ==  !( i > 4 ) && !( j <= 6 )\n" );
      System.out.printf( "    combinations checked: %d, mismatches: %d\n", checked, mismatches );
   } // end main
} // end class Exercise5_23

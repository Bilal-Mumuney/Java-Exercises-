// Exercise 4.32: Checkerboard of asterisks using ONLY these output statements:
//    System.out.print( "* " );   System.out.print( " " );   System.out.println();
package chapter4;

public class Exercise4_32
{
   public static void main( String[] args )
   {
      int row = 1;

      while ( row <= 8 )
      {
         if ( row % 2 == 0 )          // even rows are shifted right by one space
            System.out.print( " " );

         int column = 1;
         while ( column <= 8 )
         {
            System.out.print( "* " );
            ++column;
         }

         System.out.println();
         ++row;
      } // end while
   } // end main
} // end class Exercise4_32

// Exercise 4.26: What does the following program print?
package chapter4;

public class Exercise4_26
{
   public static void main( String[] args )
   {
      int row = 10;
      int column;

      // 10 rows of 10 characters. Odd rows print '<', even rows print '>'.
      // row goes 10, 9, 8 ... 1, so the FIRST line is all '>' (row 10 is even)
      // and the LAST line is all '<' (row 1 is odd); the lines alternate.
      while ( row >= 1 )
      {
         column = 1;

         while ( column <= 10 )
         {
            System.out.print( row % 2 == 1 ? "<" : ">" );
            ++column;
         } // end inner while

         --row;
         System.out.println();
      } // end outer while
   } // end main
} // end class Exercise4_26

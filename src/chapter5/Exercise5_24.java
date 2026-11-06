// Exercise 5.24: Diamond printing program (9 rows). Nested for statements, few output statements.
package chapter5;

public class Exercise5_24
{
   public static void main( String[] args )
   {
      int size = 9; // number of rows

      for ( int row = 1; row <= size; row++ )
      {
         // rows 1-5 grow by two asterisks each time; rows 6-9 shrink the same way
         int stars = row <= 5 ? 2 * row - 1 : 2 * ( size + 1 - row ) - 1;
         int spaces = ( size - stars ) / 2;

         for ( int space = 1; space <= spaces; space++ )
            System.out.print( ' ' );

         for ( int star = 1; star <= stars; star++ )
            System.out.print( '*' );

         System.out.println();
      } // end for
   } // end main
} // end class Exercise5_24

// Exercise 5.27: What does the following program segment do?
package chapter5;

public class Exercise5_27
{
   public static void main( String[] args )
   {
      int i, j, k;

      // The innermost loop prints 4 asterisks; println() ends that line.
      // The middle loop does that 3 times (3 lines of ****).
      // The outer loop repeats the group 5 times, and a blank line follows each group.
      // RESULT: five blocks, each block being three lines of "****", separated by blank lines.
      for ( i = 1; i <= 5; i++ )
      {
         for ( j = 1; j <= 3; j++ )
         {
            for ( k = 1; k <= 4; k++ )
               System.out.print( '*' );

            System.out.println();
         } // end middle for

         System.out.println();
      } // end outer for
   } // end main
} // end class Exercise5_27

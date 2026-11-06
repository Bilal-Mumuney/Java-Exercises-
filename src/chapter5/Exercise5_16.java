// Exercise 5.16: Bar chart. Read five numbers between 1 and 30, then show a bar of
// that many asterisks for each number - AFTER all five have been read.
package chapter5;

import java.util.Scanner;

public class Exercise5_16
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      String chart = ""; // the bars are collected here until all numbers have been read

      for ( int i = 1; i <= 5; i++ )
      {
         int number;

         do // keep asking until the number is in range
         {
            System.out.printf( "Enter number %d (1-30): ", i );
            number = input.nextInt();
         } while ( number < 1 || number > 30 );

         for ( int star = 1; star <= number; star++ )
            chart += "*";

         chart += "\n"; // end this bar's line
      } // end for

      System.out.println( "\n" + chart );
   } // end main
} // end class Exercise5_16

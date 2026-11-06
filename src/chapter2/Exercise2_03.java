// Exercise 2.3 (Self-Review): Write statements for each task.
package chapter2;

import java.util.Scanner;

public class Exercise2_03
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      // a) declare c, thisIsAVariable, q76354 and number as int
      int c, thisIsAVariable, q76354, number;

      int value; // variable used in part (c)

      // b) prompt the user to enter an integer
      System.out.print( "Enter an integer: " );

      // c) input an integer and assign it to value
      value = input.nextInt();

      // d) print "This is a Java program" on one line
      System.out.println( "This is a Java program" );

      // e) print it on two lines, first line ends with "Java" (println)
      System.out.println( "This is a Java\nprogram" );

      // f) same output, using printf and two %s specifiers
      System.out.printf( "%s\n%s\n", "This is a Java", "program" );

      // g) if number is not equal to 7, display a message
      number = value;
      if ( number != 7 )
         System.out.println( "The variable number is not equal to 7" );
   } // end main
} // end class Exercise2_03

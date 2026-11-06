// Exercise 5.7: When is a do...while more appropriate than a while? Explain why.
package chapter5;

import java.util.Scanner;

public class Exercise5_07
{
   public static void main( String[] args )
   {
      System.out.println( "A do...while is more appropriate when the body MUST execute at least once," );
      System.out.println( "because it tests the condition AFTER the body. Typical example: asking the" );
      System.out.println( "user for input and repeating the question until the answer is valid" );
      System.out.println( "(you cannot validate a value before you have asked for it).\n" );

      Scanner input = new Scanner( System.in );
      int number;

      do
      {
         System.out.print( "Enter a number from 1 to 10: " );
         number = input.nextInt();
      } while ( number < 1 || number > 10 );

      System.out.println( "Thanks, you entered " + number );
   } // end main
} // end class Exercise5_07

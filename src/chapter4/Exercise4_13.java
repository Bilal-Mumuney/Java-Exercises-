// Exercise 4.13: Which repetition type suits (a) the sum of the first 100 positive integers
// and (b) the sum of an arbitrary number of positive integers?
package chapter4;

import java.util.Scanner;

public class Exercise4_13
{
   public static void main( String[] args )
   {
      System.out.println( "(a) COUNTER-controlled repetition: we know in advance there are exactly 100 values." );
      System.out.println( "    Use a counter from 1 to 100 and add each value to a total." );
      System.out.println( "(b) SENTINEL-controlled repetition: we do NOT know how many values there will be." );
      System.out.println( "    Keep reading values and adding them until the user enters a sentinel value.\n" );

      // (a) counter-controlled
      int total = 0;
      int counter = 1;
      while ( counter <= 100 )
      {
         total += counter;
         ++counter;
      }
      System.out.println( "(a) sum of 1..100 = " + total ); // 5050

      // (b) sentinel-controlled (sentinel is -1)
      Scanner input = new Scanner( System.in );
      int sum = 0;
      System.out.print( "(b) Enter a positive integer (-1 to stop): " );
      int value = input.nextInt();

      while ( value != -1 )
      {
         sum += value;
         System.out.print( "    Enter a positive integer (-1 to stop): " );
         value = input.nextInt();
      }
      System.out.println( "(b) sum = " + sum );
   } // end main
} // end class Exercise4_13

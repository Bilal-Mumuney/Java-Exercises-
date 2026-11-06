// Exercise 2.32: Count negative, positive and zero values among five numbers.
package chapter2;

import java.util.Scanner;

public class Exercise2_32
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int negatives = 0;
      int positives = 0;
      int zeros = 0;

      System.out.print( "Enter number 1: " );
      int n = input.nextInt();
      if ( n < 0 ) negatives = negatives + 1;
      if ( n > 0 ) positives = positives + 1;
      if ( n == 0 ) zeros = zeros + 1;

      System.out.print( "Enter number 2: " );
      n = input.nextInt();
      if ( n < 0 ) negatives = negatives + 1;
      if ( n > 0 ) positives = positives + 1;
      if ( n == 0 ) zeros = zeros + 1;

      System.out.print( "Enter number 3: " );
      n = input.nextInt();
      if ( n < 0 ) negatives = negatives + 1;
      if ( n > 0 ) positives = positives + 1;
      if ( n == 0 ) zeros = zeros + 1;

      System.out.print( "Enter number 4: " );
      n = input.nextInt();
      if ( n < 0 ) negatives = negatives + 1;
      if ( n > 0 ) positives = positives + 1;
      if ( n == 0 ) zeros = zeros + 1;

      System.out.print( "Enter number 5: " );
      n = input.nextInt();
      if ( n < 0 ) negatives = negatives + 1;
      if ( n > 0 ) positives = positives + 1;
      if ( n == 0 ) zeros = zeros + 1;

      System.out.printf( "Negative: %d\nPositive: %d\nZero:     %d\n", negatives, positives, zeros );
   } // end main
} // end class Exercise2_32

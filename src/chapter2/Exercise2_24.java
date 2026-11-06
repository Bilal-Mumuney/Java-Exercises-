// Exercise 2.24: Largest and smallest of five integers (no loops yet!).
package chapter2;

import java.util.Scanner;

public class Exercise2_24
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter first integer: " );
      int n1 = input.nextInt();
      System.out.print( "Enter second integer: " );
      int n2 = input.nextInt();
      System.out.print( "Enter third integer: " );
      int n3 = input.nextInt();
      System.out.print( "Enter fourth integer: " );
      int n4 = input.nextInt();
      System.out.print( "Enter fifth integer: " );
      int n5 = input.nextInt();

      int largest = n1;
      int smallest = n1;

      if ( n2 > largest ) largest = n2;
      if ( n3 > largest ) largest = n3;
      if ( n4 > largest ) largest = n4;
      if ( n5 > largest ) largest = n5;

      if ( n2 < smallest ) smallest = n2;
      if ( n3 < smallest ) smallest = n3;
      if ( n4 < smallest ) smallest = n4;
      if ( n5 < smallest ) smallest = n5;

      System.out.printf( "Largest is %d\n", largest );
      System.out.printf( "Smallest is %d\n", smallest );
   } // end main
} // end class Exercise2_24

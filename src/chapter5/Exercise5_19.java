// Exercise 5.19: With i = 1, j = 2, k = 3 and m = 2, what does each statement print?
package chapter5;

public class Exercise5_19
{
   public static void main( String[] args )
   {
      int i = 1, j = 2, k = 3, m = 2;

      System.out.println( "a) " + ( i == 1 ) );                      // true
      System.out.println( "b) " + ( j == 3 ) );                      // false
      System.out.println( "c) " + ( ( i >= 1 ) && ( j < 4 ) ) );     // true  && true  = true
      System.out.println( "d) " + ( ( m <= 99 ) & ( k < m ) ) );     // true  &  false = false
      System.out.println( "e) " + ( ( j >= i ) || ( k == m ) ) );    // true  || false = true
      System.out.println( "f) " + ( ( k + m < j ) | ( 3 - j >= k ) ) ); // false | false = false
      System.out.println( "g) " + ( !( k > m ) ) );                  // !true = false

      // && and || are SHORT-CIRCUIT operators (stop as soon as the result is known);
      // & and | always evaluate both operands.
   } // end main
} // end class Exercise5_19

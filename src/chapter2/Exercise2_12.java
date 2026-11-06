// Exercise 2.12: Which statements correctly compute y = a * x^3 + 7 ?
package chapter2;

public class Exercise2_12
{
   public static void main( String[] args )
   {
      int a = 2, x = 3;
      int expected = a * x * x * x + 7; // 2 * 27 + 7 = 61

      int yA = a * x * x * x + 7;
      int yB = a * x * x * ( x + 7 );
      int yC = ( a * x ) * x * ( x + 7 );
      int yD = ( a * x ) * x * x + 7;
      int yE = a * ( x * x * x ) + 7;
      int yF = a * x * ( x * x + 7 );

      System.out.println( "Expected value (a=2, x=3): " + expected );
      System.out.println( "a) " + yA + ( yA == expected ? "  CORRECT" : "  wrong" ) );
      System.out.println( "b) " + yB + ( yB == expected ? "  CORRECT" : "  wrong" ) );
      System.out.println( "c) " + yC + ( yC == expected ? "  CORRECT" : "  wrong" ) );
      System.out.println( "d) " + yD + ( yD == expected ? "  CORRECT" : "  wrong" ) );
      System.out.println( "e) " + yE + ( yE == expected ? "  CORRECT" : "  wrong" ) );
      System.out.println( "f) " + yF + ( yF == expected ? "  CORRECT" : "  wrong" ) );
      // Answer: a, d and e.
      // b, c, f multiply by ( x + 7 ) or ( x*x + 7 ), which wrongly multiplies the 7 by other terms.
   } // end main
} // end class Exercise2_12

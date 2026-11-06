// Exercise 2.13: State the order of evaluation and the value of x.
package chapter2;

public class Exercise2_13
{
   public static void main( String[] args )
   {
      // a) x = 7 + 3 * 6 / 2 - 1;
      //    order: 3*6 = 18, 18/2 = 9, 7+9 = 16, 16-1 = 15, then assign
      int x = 7 + 3 * 6 / 2 - 1;
      System.out.println( "a) x = " + x ); // 15

      // b) x = 2 % 2 + 2 * 2 - 2 / 2;
      //    order: 2%2 = 0, 2*2 = 4, 2/2 = 1, 0+4 = 4, 4-1 = 3, then assign
      x = 2 % 2 + 2 * 2 - 2 / 2;
      System.out.println( "b) x = " + x ); // 3

      // c) x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
      //    order: (3) -> 3
      //           9*3 = 27, 27/3 = 9        (innermost group)
      //           3+9 = 12
      //           3*9 = 27, 27*12 = 324, then assign
      x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
      System.out.println( "c) x = " + x ); // 324
   } // end main
} // end class Exercise2_13

// Exercise 4.33: Multiples of 2 with an INFINITE loop.
//
// WARNING: this program never ends on its own. Press the red STOP button in IntelliJ's
// Run panel (or Ctrl+F2) to terminate it.
package chapter4;

public class Exercise4_33
{
   public static void main( String[] args )
   {
      int value = 2;

      while ( true ) // the condition is always true, so the loop never terminates
      {
         System.out.println( value );
         value = value * 2;
      }

      // WHAT HAPPENS: it prints 2, 4, 8, 16, ... up to 1073741824, then the int OVERFLOWS:
      // 2147483648 does not fit in an int, so the next value wraps to -2147483648,
      // and doubling that gives 0. From then on it prints 0 forever.
      // (Lesson: an int has a fixed range, and arithmetic silently wraps around.)
   } // end main
} // end class Exercise4_33

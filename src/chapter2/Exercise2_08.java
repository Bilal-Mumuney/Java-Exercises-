// Exercise 2.8: Write Java statements that accomplish each task.
package chapter2;

public class Exercise2_08
{
   public static void main( String[] args )
   {
      int a, b = 4, c = 5;

      // a) display "Enter an integer: " leaving the cursor on the same line
      System.out.print( "Enter an integer: " );
      System.out.println(); // (only here to move to the next line for readability)

      // b) assign the product of b and c to a
      a = b * c;
      System.out.println( "a = " + a );

      // c) use a comment to state that a program performs a sample payroll calculation
      // Sample payroll calculation
   } // end main
} // end class Exercise2_08

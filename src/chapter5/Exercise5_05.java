// Exercise 5.5: Describe the four basic elements of counter-controlled repetition.
package chapter5;

public class Exercise5_05
{
   public static void main( String[] args )
   {
      System.out.println( "The four elements of counter-controlled repetition are:" );
      System.out.println( " 1) a control variable (the counter, e.g. i)" );
      System.out.println( " 2) the initial value of the control variable (e.g. i = 1)" );
      System.out.println( " 3) the increment or decrement applied each time through the loop (e.g. i++)" );
      System.out.println( " 4) the loop-continuation condition that decides whether to keep looping (e.g. i <= 10)\n" );

      int counter = 1;               // 1) control variable and 2) its initial value
      while ( counter <= 5 )         // 4) loop-continuation condition
      {
         System.out.print( counter + " " );
         counter++;                  // 3) increment
      }
      System.out.println();
   } // end main
} // end class Exercise5_05

package chapter4;

/**
 * Exercise 4.5 (Self-Review): One Java statement for each task.
 *
 * a) int sum;
 *    int x;
 * b) x = 1;
 * c) sum = 0;
 * d) sum += x;     (or sum = sum + x;)
 * e) System.out.printf( "The sum is: %d\n", sum );
 *
 * These are combined into a working program in Exercise4_06.
 */
public class Exercise4_05
{
   public static void main( String[] args )
   {
      int sum;
      int x;
      x = 1;
      sum = 0;
      sum += x;
      System.out.printf( "The sum is: %d\n", sum ); // 1
   } // end main
} // end class Exercise4_05

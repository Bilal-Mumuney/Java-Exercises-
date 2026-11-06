package chapter4;

/**
 * Exercise 4.9 (Self-Review): What is wrong with this while statement?
 *
 *    while ( z >= 0 )
 *       sum += z;
 *
 * ANSWER: z is never changed inside the loop. If ( z >= 0 ) is true at the start it stays
 * true forever, so this is an INFINITE LOOP. z must be decremented so that it eventually
 * becomes less than 0.
 */
public class Exercise4_09
{
   public static void main( String[] args )
   {
      int z = 3;
      int sum = 0;

      while ( z >= 0 )
      {
         sum += z;
         --z; // the fix: change z so the loop-continuation condition eventually fails
      }

      System.out.println( "sum = " + sum ); // 3 + 2 + 1 + 0 = 6
   } // end main
} // end class Exercise4_09

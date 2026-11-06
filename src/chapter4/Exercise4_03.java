// Exercise 4.3 (Self-Review): Four different statements that each add 1 to x.
package chapter4;

public class Exercise4_03
{
   public static void main( String[] args )
   {
      int x = 0;

      x = x + 1;
      System.out.println( "after x = x + 1;  x = " + x ); // 1

      x += 1;
      System.out.println( "after x += 1;     x = " + x ); // 2

      ++x;
      System.out.println( "after ++x;        x = " + x ); // 3

      x++;
      System.out.println( "after x++;        x = " + x ); // 4
   } // end main
} // end class Exercise4_03

// Exercise 2.29: Integer value of a character (Unicode).
package chapter2;

public class Exercise2_29
{
   public static void main( String[] args )
   {
      // (int) is a cast operator; %c prints a character, %d prints an integer
      System.out.printf( "The character %c has the value %d\n", 'A', ( (int) 'A' ) );
      System.out.printf( "The character %c has the value %d\n", 'B', ( (int) 'B' ) );
      System.out.printf( "The character %c has the value %d\n", 'C', ( (int) 'C' ) );
      System.out.printf( "The character %c has the value %d\n", 'a', ( (int) 'a' ) );
      System.out.printf( "The character %c has the value %d\n", 'b', ( (int) 'b' ) );
      System.out.printf( "The character %c has the value %d\n", 'c', ( (int) 'c' ) );
      System.out.printf( "The character %c has the value %d\n", '0', ( (int) '0' ) );
      System.out.printf( "The character %c has the value %d\n", '1', ( (int) '1' ) );
      System.out.printf( "The character %c has the value %d\n", '2', ( (int) '2' ) );
      System.out.printf( "The character %c has the value %d\n", '$', ( (int) '$' ) );
      System.out.printf( "The character %c has the value %d\n", '*', ( (int) '*' ) );
      System.out.printf( "The character %c has the value %d\n", '+', ( (int) '+' ) );
      System.out.printf( "The character %c has the value %d\n", '/', ( (int) '/' ) );
      System.out.printf( "The character %c has the value %d\n", ' ', ( (int) ' ' ) );
   } // end main
} // end class Exercise2_29

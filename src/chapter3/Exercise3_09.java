package chapter3;

/**
 * Exercise 3.9 (Using a Class Without Importing It): Explain how a program could
 * use class Scanner without importing it.
 */
public class Exercise3_09
{
   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "Use the class's fully qualified name (package + class) every time:" );
      System.out.println( "   java.util.Scanner input = new java.util.Scanner( System.in );\n" );

      // No 'import java.util.Scanner;' anywhere in this file:
      java.util.Scanner input = new java.util.Scanner( System.in );
      System.out.print( "Type something and press Enter: " );
      String line = input.nextLine();
      System.out.println( "You typed: " + line );
   } // end main
} // end class Exercise3_09

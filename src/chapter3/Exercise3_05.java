package chapter3;

/**
 * Exercise 3.5 (Keyword new): What's the purpose of keyword new? Explain what happens when you use it.
 */
public class Exercise3_05
{
   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "new creates an object of a class. When it executes:" );
      System.out.println( " 1) it requests memory from the system to hold the new object;" );
      System.out.println( " 2) it calls the class's constructor to initialize that object;" );
      System.out.println( " 3) it returns a REFERENCE to the object, which you usually store in a variable." );
      System.out.println( "Example:  Exercise3_05 obj = new Exercise3_05();" );
   } // end main
} // end class Exercise3_05

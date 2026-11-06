package chapter3;

/**
 * Exercise 3.8 (Using Classes Without Importing Them): Most classes must be imported
 * before use. Why can every application use System and String without importing them?
 */
public class Exercise3_08
{
   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "Classes System and String are in package java.lang, which is imported" );
      System.out.println( "into every Java program automatically." );

      String s = "No import needed"; // String comes from java.lang
      System.out.println( s );
   } // end main
} // end class Exercise3_08

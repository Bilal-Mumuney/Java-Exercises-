// Exercise 2.22: What does the following code print?
package chapter2;

public class Exercise2_22
{
   public static void main( String[] args )
   {
      // Line 1: "*" (print) + "***" (println)  -> ****
      // Line 2: "*****"                         -> *****
      // Line 3: "****" (print) + "**" (println) -> ******
      System.out.print( "*" );
      System.out.println( "***" );
      System.out.println( "*****" );
      System.out.print( "****" );
      System.out.println( "**" );
   } // end main
} // end class Exercise2_22

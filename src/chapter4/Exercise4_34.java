// Exercise 4.34: What is wrong with   System.out.println( ++( x + y ) );   ?
package chapter4;

public class Exercise4_34
{
   public static void main( String[] args )
   {
      System.out.println( "ANSWER: the ++ operator can only be applied to a VARIABLE (something that" );
      System.out.println( "can store a value). ( x + y ) is an expression, not a variable, so" );
      System.out.println( "++( x + y ) is a compile error.\n" );

      int x = 3;
      int y = 4;

      // correct statement: add one to the sum of x and y
      System.out.println( x + y + 1 ); // 8
      // or, equally correct:  System.out.println( ( x + y ) + 1 );
   } // end main
} // end class Exercise4_34

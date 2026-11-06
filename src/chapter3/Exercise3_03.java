package chapter3;

/**
 * Exercise 3.3: What is the difference between a local variable and a field?
 */
public class Exercise3_03
{
   // this is a FIELD (instance variable): declared in the class, outside every method
   private int field = 10;

   public void demo()
   {
      // this is a LOCAL variable: declared inside a method body
      int local = 5;
      System.out.println( "local = " + local + ", field = " + field );
   }

   public void another()
   {
      System.out.println( "field is visible here too: " + field );
      // System.out.println( local ); // ERROR: 'local' exists only inside demo()
   }

   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "A local variable is declared in the body of a method and can be used only" );
      System.out.println( "from the point where it is declared to the end of that method." );
      System.out.println( "A field is declared in a class but outside all methods, so it is accessible" );
      System.out.println( "to all methods of the class (and each object has its own copy)." );
      System.out.println( "Also: fields get default values; local variables do not.\n" );

      Exercise3_03 example = new Exercise3_03();
      example.demo();
      example.another();
   } // end main
} // end class Exercise3_03

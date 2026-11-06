package chapter3;

/**
 * Exercise 3.4: Explain the purpose of a method parameter.
 * What is the difference between a parameter and an argument?
 */
public class Exercise3_04
{
   // 'name' is a PARAMETER: it is declared in the method header with a type and a name
   public void greet( String name )
   {
      System.out.println( "Hello, " + name + "!" );
   }

   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "A parameter is extra information a method needs to do its task." );
      System.out.println( "It is specified in the method DECLARATION (type + name)." );
      System.out.println( "An argument is the actual value supplied in the method CALL;" );
      System.out.println( "when the method is called, each argument value is passed to the" );
      System.out.println( "corresponding parameter.\n" );

      Exercise3_04 example = new Exercise3_04();
      String student = "Amina";
      example.greet( student ); // 'student' (its value) is the ARGUMENT
   } // end main
} // end class Exercise3_04

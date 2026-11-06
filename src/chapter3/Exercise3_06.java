package chapter3;

/**
 * Exercise 3.6 (Default Constructors): What is a default constructor?
 * How are an object's instance variables initialized if the class has only a default constructor?
 */
public class Exercise3_06
{
   // no constructor is declared here, so the compiler supplies a default one
   private int number;       // will be 0
   private double amount;    // will be 0.0
   private boolean flag;     // will be false
   private String text;      // will be null

   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "A default constructor is a constructor with NO parameters that the compiler" );
      System.out.println( "provides when a class declares no constructors of its own." );
      System.out.println( "It does no initialization itself, so instance variables get DEFAULT values:" );
      System.out.println( "numeric types = 0, boolean = false, references (e.g. String) = null.\n" );

      Exercise3_06 obj = new Exercise3_06(); // calls the default constructor
      System.out.println( "number = " + obj.number );
      System.out.println( "amount = " + obj.amount );
      System.out.println( "flag   = " + obj.flag );
      System.out.println( "text   = " + obj.text );
   } // end main
} // end class Exercise3_06

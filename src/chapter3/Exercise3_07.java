package chapter3;

/**
 * Exercise 3.7 (Instance Variables): Explain the purpose of an instance variable.
 */
public class Exercise3_07
{
   private int count; // instance variable: each object has its own copy

   public void increment()
   {
      count++;
   }

   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "An instance variable (field) holds data that belongs to an object." );
      System.out.println( "Each object has its own copy, it keeps its value between method calls," );
      System.out.println( "and it can be used by all methods of the class, so methods can share" );
      System.out.println( "and remember information about the object.\n" );

      Exercise3_07 a = new Exercise3_07();
      Exercise3_07 b = new Exercise3_07();
      a.increment();
      a.increment();
      b.increment();
      System.out.println( "a.count = " + a.count + ", b.count = " + b.count + "  (separate copies)" );
   } // end main
} // end class Exercise3_07

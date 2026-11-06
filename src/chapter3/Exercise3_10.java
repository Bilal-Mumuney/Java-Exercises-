package chapter3;

/**
 * Exercise 3.10 (set and get Methods): Explain why a class might provide a
 * set method and a get method for an instance variable.
 */
public class Exercise3_10
{
   private int age; // private: other classes cannot touch it directly

   public void setAge( int newAge )
   {
      if ( newAge >= 0 ) // a set method can VALIDATE before storing
         age = newAge;
   }

   public int getAge()
   {
      return age;
   }

   public static void main( String[] args )
   {
      System.out.println( "ANSWER:" );
      System.out.println( "Instance variables are usually private (encapsulation / data hiding)," );
      System.out.println( "so other classes cannot access them directly. A set method lets clients" );
      System.out.println( "modify the value in a controlled way (and validate it), and a get method" );
      System.out.println( "lets clients read the value without being able to break the class.\n" );

      Exercise3_10 p = new Exercise3_10();
      p.setAge( 20 );
      p.setAge( -5 ); // rejected by validation
      System.out.println( "age = " + p.getAge() ); // 20
   } // end main
} // end class Exercise3_10

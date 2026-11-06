package chapter3;

/**
 * Exercise 3.2 (Self-Review): True or false? If false, explain.
 *
 * a) By convention, method names begin with an uppercase first letter.
 * b) An import declaration is not required when one class uses another in the same package.
 * c) Empty parentheses after a method name in its declaration mean it needs no parameters.
 * d) private variables/methods are accessible only to methods of their own class.
 * e) A primitive-type variable can be used to invoke a method.
 * f) Variables declared in a method's body are instance variables usable in all methods.
 * g) Every method's body is delimited by left and right braces.
 * h) Primitive-type local variables are initialized by default.
 * i) Reference-type instance variables are initialized by default to null.
 * j) Any class containing public static void main( String[] args ) can run as an application.
 * k) The number of arguments in a call must match the number of parameters in the declaration.
 * l) Floating-point values in source code are floating-point literals of type float by default.
 */
public class Exercise3_02
{
   public static void main( String[] args )
   {
      System.out.println( "a) FALSE - method names start with a LOWERCASE letter (camelCase)." );
      System.out.println( "b) TRUE" );
      System.out.println( "c) TRUE" );
      System.out.println( "d) TRUE" );
      System.out.println( "e) FALSE - primitives are not objects; only a reference to an object can invoke methods." );
      System.out.println( "f) FALSE - those are LOCAL variables, usable only in that method." );
      System.out.println( "g) TRUE" );
      System.out.println( "h) FALSE - primitive INSTANCE variables get defaults; LOCAL variables must be assigned." );
      System.out.println( "i) TRUE" );
      System.out.println( "j) TRUE" );
      System.out.println( "k) TRUE" );
      System.out.println( "l) FALSE - floating-point literals are of type DOUBLE by default." );
   } // end main
} // end class Exercise3_02

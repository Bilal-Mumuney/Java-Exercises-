package chapter2;

/**
 * Exercise 2.2 (Self-Review): True or false? If false, explain.
 *
 * a) Comments cause the computer to print the text after // on the screen.
 * b) All variables must be given a type when they're declared.
 * c) Java considers the variables number and NuMbEr to be identical.
 * d) The remainder operator (%) can be used only with integer operands.
 * e) The operators *, /, %, + and - all have the same level of precedence.
 */
public class Exercise2_02
{
   public static void main( String[] args )
   {
      System.out.println( "a) FALSE - comments cause no action at run time; they only document the code." );
      System.out.println( "b) TRUE" );
      System.out.println( "c) FALSE - Java is case sensitive, so they are two different variables." );
      System.out.println( "d) FALSE - % also works with floating-point operands (e.g. 7.5 % 2)." );
      System.out.println( "e) FALSE - *, / and % have HIGHER precedence than + and -." );

      // proof for (d): % on doubles is legal
      System.out.println( "\nProof for (d): 7.5 % 2 = " + ( 7.5 % 2 ) );
   } // end main
} // end class Exercise2_02

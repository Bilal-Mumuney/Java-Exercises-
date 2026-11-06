package chapter4;

/**
 * Exercise 4.2 (Self-Review): True or false? If false, explain.
 *
 * a) An algorithm is a procedure for solving a problem in terms of the actions to execute and their order.
 * b) A set of statements contained within a pair of parentheses is called a block.
 * c) A selection statement specifies that an action is to be repeated while some condition remains true.
 * d) A nested control statement appears in the body of another control statement.
 * e) Java provides the compound assignment operators +=, -=, *=, /= and %=.
 * f) The primitive types are portable across only Windows platforms.
 * g) Specifying the order in which statements execute is called program control.
 * h) The unary cast operator (double) creates a temporary integer copy of its operand.
 * i) Instance variables of type boolean are given the value true by default.
 * j) Pseudocode helps you think out a program before writing it in a programming language.
 */
public class Exercise4_02
{
   public static void main( String[] args )
   {
      System.out.println( "a) TRUE" );
      System.out.println( "b) FALSE - a block is a set of statements within BRACES { }." );
      System.out.println( "c) FALSE - that describes a REPETITION statement; selection chooses between actions." );
      System.out.println( "d) TRUE" );
      System.out.println( "e) TRUE" );
      System.out.println( "f) FALSE - primitive types are portable across ALL platforms that support Java." );
      System.out.println( "g) TRUE" );
      System.out.println( "h) FALSE - (double) creates a temporary FLOATING-POINT copy of its operand." );
      System.out.println( "i) FALSE - boolean instance variables default to FALSE." );
      System.out.println( "j) TRUE" );
   } // end main
} // end class Exercise4_02

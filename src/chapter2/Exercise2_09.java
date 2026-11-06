package chapter2;

/**
 * Exercise 2.9: True or false? If false, explain.
 *
 * a) Java operators are evaluated from left to right.
 * b) All of these are valid variable names: _under_bar_, m928134, t5, j7,
 *    her_sales$, his_$account_total, a, b$, c, z and z2.
 * c) A valid arithmetic expression with no parentheses is evaluated left to right.
 * d) All of these are invalid variable names: 3g, 87, 67h2, h22 and 2h.
 */
public class Exercise2_09
{
   public static void main( String[] args )
   {
      System.out.println( "a) FALSE - not all: assignment (=) associates RIGHT to LEFT,"
         + "\n            and precedence decides order first." );
      System.out.println( "b) TRUE  - letters, digits, _ and $ are allowed, and none starts with a digit." );
      System.out.println( "c) FALSE - precedence still applies (*, /, % before +, -)." );
      System.out.println( "d) FALSE - h22 is VALID (starts with a letter); the others start with digits." );
   } // end main
} // end class Exercise2_09

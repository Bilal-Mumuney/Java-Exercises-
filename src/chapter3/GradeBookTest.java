// Exercise 3.11: Test application for the modified GradeBook class.
package chapter3;

public class GradeBookTest
{
   public static void main(String[] args )
   {
      GradeBook gradeBook1 = new GradeBook( "CS101 Introduction to Java Programming", "Dr. Okafor" );
      GradeBook gradeBook2 = new GradeBook( "CS102 Data Structures in Java", "Prof. Bello" );

      gradeBook1.displayMessage();
      System.out.println();
      gradeBook2.displayMessage();

      // demonstrate the new set and get methods
      System.out.println( "\nChanging instructor of gradeBook1..." );
      gradeBook1.setInstructorName( "Dr. Adeyemi" );
      System.out.printf( "gradeBook1 instructor is now: %s\n", gradeBook1.getInstructorName() );
   } // end main
} // end class GradeBookTest

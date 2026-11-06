// Exercise 3.11: Modified GradeBook class with an instructor name.
package chapter3;

public class GradeBook
{
   private String courseName;     // course name for this GradeBook
   private String instructorName; // instructor's name for this GradeBook

   // constructor with TWO parameters
   public GradeBook( String course, String instructor )
   {
      courseName = course;
      instructorName = instructor;
   }

   public void setCourseName( String name )
   {
      courseName = name;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public void setInstructorName( String name )
   {
      instructorName = name;
   }

   public String getInstructorName()
   {
      return instructorName;
   }

   // display a welcome message, the course name and the instructor
   public void displayMessage()
   {
      System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
      System.out.printf( "This course is presented by: %s\n", getInstructorName() );
   }
} // end class GradeBook

// Exercise 3.17: HealthProfile class - a "starter" electronic health record.
package chapter3;

import java.time.LocalDate;

public class HealthProfile
{
   private String firstName;
   private String lastName;
   private String gender;
   private int birthMonth;
   private int birthDay;
   private int birthYear;
   private double height; // inches
   private double weight; // pounds

   public HealthProfile( String first, String last, String gender, int month, int day,
      int year, double height, double weight )
   {
      firstName = first;
      lastName = last;
      this.gender = gender;
      birthMonth = month;
      birthDay = day;
      birthYear = year;
      this.height = height;
      this.weight = weight;
   }

   public void setFirstName( String first ) { firstName = first; }
   public String getFirstName() { return firstName; }

   public void setLastName( String last ) { lastName = last; }
   public String getLastName() { return lastName; }

   public void setGender( String g ) { gender = g; }
   public String getGender() { return gender; }

   public void setBirthMonth( int month ) { birthMonth = month; }
   public int getBirthMonth() { return birthMonth; }

   public void setBirthDay( int day ) { birthDay = day; }
   public int getBirthDay() { return birthDay; }

   public void setBirthYear( int year ) { birthYear = year; }
   public int getBirthYear() { return birthYear; }

   public void setHeight( double inches ) { height = inches; }
   public double getHeight() { return height; }

   public void setWeight( double pounds ) { weight = pounds; }
   public double getWeight() { return weight; }

   public int getAge()
   {
      LocalDate today = LocalDate.now();
      int age = today.getYear() - birthYear;

      if ( today.getMonthValue() < birthMonth ||
         ( today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay ) )
         age = age - 1;

      return age;
   }

   // maximum heart rate = 220 - age (see Exercise 3.16)
   public int getMaximumHeartRate()
   {
      return 220 - getAge();
   }

   public double getTargetHeartRateLow()
   {
      return getMaximumHeartRate() * 0.50;
   }

   public double getTargetHeartRateHigh()
   {
      return getMaximumHeartRate() * 0.85;
   }

   // BMI = weight(lb) * 703 / height(in)^2 (see Exercise 2.33)
   public double getBMI()
   {
      return weight * 703 / ( height * height );
   }
} // end class HealthProfile

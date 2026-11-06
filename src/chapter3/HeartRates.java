// Exercise 3.16: HeartRates class - target heart rate calculator.
package chapter3;

import java.time.LocalDate; // used only to get today's date for the age calculation

public class HeartRates
{
   private String firstName;
   private String lastName;
   private int birthMonth;
   private int birthDay;
   private int birthYear;

   public HeartRates( String first, String last, int month, int day, int year )
   {
      firstName = first;
      lastName = last;
      birthMonth = month;
      birthDay = day;
      birthYear = year;
   }

   public void setFirstName( String first ) { firstName = first; }
   public String getFirstName() { return firstName; }

   public void setLastName( String last ) { lastName = last; }
   public String getLastName() { return lastName; }

   public void setBirthMonth( int month ) { birthMonth = month; }
   public int getBirthMonth() { return birthMonth; }

   public void setBirthDay( int day ) { birthDay = day; }
   public int getBirthDay() { return birthDay; }

   public void setBirthYear( int year ) { birthYear = year; }
   public int getBirthYear() { return birthYear; }

   // age in whole years (one less if the birthday has not happened yet this year)
   public int getAge()
   {
      LocalDate today = LocalDate.now();
      int age = today.getYear() - birthYear;

      if ( today.getMonthValue() < birthMonth ||
         ( today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay ) )
         age = age - 1;

      return age;
   }

   // maximum heart rate = 220 - age
   public int getMaximumHeartRate()
   {
      return 220 - getAge();
   }

   // target heart rate range is 50% to 85% of the maximum
   public double getTargetHeartRateLow()
   {
      return getMaximumHeartRate() * 0.50;
   }

   public double getTargetHeartRateHigh()
   {
      return getMaximumHeartRate() * 0.85;
   }
} // end class HeartRates

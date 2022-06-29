import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args)
{
    final int SEC_IN_MIN = 60;
    final int SEC_IN_HOUR = 60*SEC_IN_MIN;
    final int SEC_IN_DAY = 24*SEC_IN_HOUR;

    int hour = 18;
    int minute = 29;
    int second = 33;

    // calculate & display number of seconds since midnight
    int secSinceMid = second + minute*SEC_IN_MIN + hour*SEC_IN_HOUR;

    System.out.println("Seconds since midnight: " + secSinceMid);

    // calculate and display the number of seconds remaining in the day
    int secLeftInDay = SEC_IN_DAY - secSinceMid;

    System.out.println("Number of seconds left in day: " + secLeftInDay);

    // calculate and display the percentage of the day that has passed
  // order of operations is on purpose: remember integer division! 
    int perOfDayPassed = (secSinceMid * 100) / SEC_IN_DAY;

    System.out.println("Percentage of day that has passed: " + perOfDayPassed + "%");

    // elapsed time since starting this exercise
    // original values: hour: 18, minute: 4, second: 10
    int prevHour = 18;
    int prevMin = 4;
    int prevSec = 10;

    int elapsedTime = (hour - prevHour)*SEC_IN_HOUR
      + (minute - prevMin)*SEC_IN_MIN
      + (second - prevSec);

    System.out.println("Elapsed time since start of exercise: " + elapsedTime);


  }

}
package classwork.chapter2;

import java.sql.SQLOutput;

public class Example2 {

    private static final Integer MIN_ACCEPTABLE_AGE_RANGE = 18;

    public static void main (String args[])  {

        Example2 example2 = new Example2();

        int num;
        num = 100;

        System.out.println("num is: " + num);
        num = num * 2;
        System.out.println("Now num is: " + num);
    }

    public static String getUserAccess(int age, String name) {
      if (age < MIN_ACCEPTABLE_AGE_RANGE) {
          return "you should be older than 18";
      } else {
          return "welcome";
      }
    }

    public static String getUserAccessClean(int age, String name) {
        return age < MIN_ACCEPTABLE_AGE_RANGE
                ? "you should be older than 18"
                :  "welcome";
    }
}

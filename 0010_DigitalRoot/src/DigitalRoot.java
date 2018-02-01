import java.util.*;
import java.io.*;
import java.lang.*;

public class DigitalRoot {

    public static int digitalRoot(int number){
        // stops recursion if sum of numbers is one digit long
        if (number < 10)
            return  number;

        // sum variable initialization
        int sum = 0;

        // convert given integer to string
        String sequence = Integer.toString(number);

        for (int i = 0; i < sequence.length();i++) {

            // add up each digits in the given number
            sum = sum + Integer.parseInt(Character.toString(sequence.charAt(i)));
        }
        // apply recursion
        return digitalRoot(sum);
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(123456));
    }
}

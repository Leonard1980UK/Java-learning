import java.util.*;
import java.io.*;
import java.lang.*;

public class MissingNumber  {

    public static void main(String[] args) {

        // input number of test cases
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // iterate over the tests cases
        while (t > 0){

            // initialize sum
            int sum = 0;

            // input numbers 1 to 'n'
            int n = sc.nextInt();

            // add integers together
            for (int i = 0; i < n-1; i++){
                sum = sum + sc.nextInt();
            }
            // Gauss formula
            System.out.println((n*(1+n)/2) - sum);

            t--;
        }
    }
}

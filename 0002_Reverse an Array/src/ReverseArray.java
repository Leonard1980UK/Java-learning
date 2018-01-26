import java.util.*;
import java.io.*;
import java.lang.*;

public class ReverseArray {

    public static void main(String[] args) {

        // declare an array
        int[] arr = new int[100];

        // input number of test cases
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // iterate over the tests cases
        while (t > 0){

            // input the size of the array
            int n = sc.nextInt();

            // put integers to the array
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            // print array in reverse
            for (int i = n-1; i >= 0; i--){
                System.out.print(arr[i]);
                System.out.print(' ');
            }

            System.out.println();
            t--;
        }
    }
}

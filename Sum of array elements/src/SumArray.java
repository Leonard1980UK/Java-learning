import java.util.*;
import java.io.*;
import java.lang.*;
public class SumArray {

    static int sumArray (int[] arr, int n){
        int sum = 0;
        for (int i =0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        // declare an array
        int[] arr = new int[100];

        // give number of test cases
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // iterate over the given test cases
        while (t > 0){

            // set the size of the array
            int n = sc.nextInt();

            // put given integers in to the array
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(sumArray(arr, n));

            t--;
        }
    }
}

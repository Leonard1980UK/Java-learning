import java.lang.*;
import java.io.*;
import java.util.*;

public class LargestElement {
    // Bubble sort
    static void sortArray(int[] arr, int n, int k){

        // Bubble sort
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n ; j++){
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        //return k largest element
        for (int i = 0; i < k; i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println("");
    }

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

            //input number of largest elements to be returned
            int k = sc.nextInt();

            sortArray(arr,n,k);

            t--;
        }
    }
}

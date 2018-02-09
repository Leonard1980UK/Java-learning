import java.util.*;
import java.lang.*;
import java.io.*;

public class FoldAnArray {

    public static int[] fold (int[] array, int runs){

        // declare and initialize variables
        final int arrLength =  array.length;
        final int index = arrLength%2;

        // according of the length determine half point (odd = 1, even= 1)
        int half = (arrLength / 2) + index;

        // declare new array half of the original array size
        int[] newArray = new int[half];

        // sum up the first and last element of the array (repeat until we don't reach the middle)
        for (int i = 0; i < half-index; i++){
            newArray[i] = array[i] + array[(arrLength-1)-i];
        }
        // if the original array size was odd then the last element in the newArray is the middle element in the original array
        if (index > 0)
            newArray[half-1] = array[half-1];

        // comment out to print to the console
//        for (int j = 0; j< newArray.length; j++){
//            System.out.print(newArray[j]);
//
//        }
//        System.out.println("");

        // return conditional recursive call
        return newArray.length == 1 || runs == 1 ? newArray : fold(newArray,runs-1 );

    }

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5};

        fold(array,1);

    }

}
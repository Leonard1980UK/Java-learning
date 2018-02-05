import java.lang.*;
public class SortheOdd {

    static void swap(int[] arr, int n,int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    // insertion sort with restrictions
    public static void main(String[] args) {

//        int[] arr = new int[]{ 1 ,111 ,11, 11, 2, 1, 5, 0};
        int[] arr = new int[]{19, 7, 96, 67, 22, 68, 72, 1, 64, 35, 84, 82, 27, 75, 45, 4, 31, 30, 81, 81, 62, 69, 95, 34, 31, 60, 44, 71, 96, 12, 76 ,92};
//        int[] arr = new int[]{19, 7, 96, 67, 22, 71, 68, 72, 1, 44, 71, 96, 12, 76 ,92};
//                             1, 7, 96, 19, 22, 67, 68, 72, 71, 44, 71, 96, 12, 76 ,92
        int arrLeng = arr.length;


        for (int i = 0; i < arrLeng; i++){

            int minIndex = i;

            if(arr[minIndex]%2 != 0){
                for (int j = i + 1; j < arrLeng; j++){
                    if (arr[j]%2 != 0 ){
                        if (arr[minIndex] > arr[j]){
                            minIndex = j;
                            int temp = arr[minIndex];
                            arr[minIndex] = arr[i];
                            arr[i] = temp;
                        }else if (arr[minIndex] == arr[j]) {
                            // find a place if the next integer is even
                            int nextOddIndex = i+1;
                            while(arr[nextOddIndex ]%2 == 0){
                                nextOddIndex ++;
                            }
                            int temp = arr[j];
                            arr[j] = arr[nextOddIndex ];
                            arr[nextOddIndex ] = temp;
                        }


                        for (int iy=0;iy<arrLeng;iy++){
                            System.out.print(" ");
                            System.out.print(arr[iy]);
                        }
                        System.out.println("");
                }
            }
        }

       }

    }

}

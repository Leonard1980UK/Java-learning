import java.lang.*;
public class SortheOdd {

    // insertion sort with restrictions
    public static void main(String[] args) {

//        int[] array = new int[]{ 1 ,111 ,11, 11, 2, 1, 5, 0};
        int[] array = new int[]{ 5, 3, 2, 8, 1, 4 };
//        int[] array = new int[]{19, 7, 96, 67, 22, 68, 72, 1, 64, 35, 84, 82, 27, 75, 45, 4, 31, 30, 81, 81, 62, 69, 95, 34, 31, 60, 44, 71, 96, 12, 76 ,92};
//        int[] array = new int[]{19, 7, 96, 67, 22, 71, 68, 72, 1, 44, 71, 96, 12, 76 ,92};
//                             1, 7, 96, 19, 22, 67, 68, 72, 71, 44, 71, 96, 12, 76 ,92
        int arrLeng = array.length;


        for (int i = 0; i < arrLeng; i++){

            int minIndex = i;

            if(array[minIndex]%2 != 0){
                for (int j = i + 1; j < arrLeng; j++){
                    if (array[j]%2 != 0 ){
                        if (array[minIndex] > array[j]){
                            minIndex = j;
                        }
                    }
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        for (int iy=0;iy<arrLeng;iy++){
            System.out.print(" ");
            System.out.print(array[iy]);
        }
        System.out.println("");

    }

}

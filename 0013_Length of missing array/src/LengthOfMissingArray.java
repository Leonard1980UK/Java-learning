import  java.util.*;
import java.lang.*;
import java.util.stream.Stream;

public class LengthOfMissingArray {

    public static int findMissing(Object[][] arrayOfArrays){

        if (arrayOfArrays == null || arrayOfArrays.length == 0)
            return 0;

        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0)
                return 0;
        }

        int[] arrayLengths = Stream.of(arrayOfArrays)
                .mapToInt(value -> value.length)
                .sorted()
                .toArray();


        for (int i = 0; i < arrayLengths.length; i++) {
            if (arrayLengths[i] != arrayLengths[i + 1] - 1)
                return arrayLengths[i]+1;
        }
        return 0;
    }

    public static void main(String[] args) {

//        Object[][] arrayOfArrays =  {{1, 2}, {4, 5, 1, 1}, {1}, {5, 6, 7, 8, 9}};
//        Object[][] arrayOfArrays =  {{1, 2}, new Object[] { 4, 5, 1, 1 }, {1}, {5, 6, 7, 8, 9}};
//        Object[][] arrayOfArrays = new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }};
//        Object[][] arrayOfArrays = new Object[][] { new Object[] { null }, new Object[] { null, null, null } };
//        Object[][] arrayOfArrays = new Object[][]{{4, 4, 4, 3, 1, 2}, {3, 4, 1}, {3, 2}, {4, 2, 4, 0, 1, 4, 0, 2}, {3, 4, 2, 1, 0, 0, 0, 3, 2}, {1, 4, 4, 2, 0, 1, 0}, {1, 0, 2, 1, 0}};
//        Object[][] arrayOfArrays = new Object[][]{{1}, {4, 4}, {2, 3, 2,}, {3, 1, 8, 0}, {2, 4, 4, 0, 7, 9}};
//        Object[][] arrayOfArrays =  {};
//        Object[][] arrayOfArrays =  {{1, 2}, {}, {1}, {5, 6, 7, 8, 9}};
        Object[][] arrayOfArrays = new Object[][]{{0, 0, 1, 4, 3, 1, 4, 1}, {3, 1, 0, 1, 3, 3, 4}, {2, 0, 1, 4, 4, 4}, {1, 3, 0, 1}, {3, 4, 2, 2, 4}, {1, 4, 0}, {}, {4, 4}};

        System.out.println(findMissing( arrayOfArrays));

    }
}

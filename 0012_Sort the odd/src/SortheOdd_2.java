import java.util.*;

// https://www.codewars.com/users/dinglemouse

public class SortheOdd_2 {
    public static void main(String[] args) {

        int[] array = new int[]{ 5, 3, 2, 8, 1, 4 };

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }
    }
}

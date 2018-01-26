import java.util.*;
import java.lang.*;
public class SquareDigit {

    public static int squareDigits(int n) {
        // declare inked list to store every number (allows dynamic allocation)
        LinkedList<Integer> buffer = new LinkedList<>();
        // declare a stringbuilder variable to store each squared number
        StringBuilder squaredStr = new StringBuilder();
        // iterate over every digits
        while (n > 0) {
            int num = n % 10;
            // push every squared digits to the linked list
            buffer.push(num*num);
            n = n / 10;
        }
        // iterate over the buffer and pop ( take&delete ) first element
        while (!buffer.isEmpty()){
            squaredStr.append(Integer.toString(buffer.pop()));
        }
        // return converted result
        return Integer.parseInt(squaredStr.toString());
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}

import java.lang.*;
import java.util.*;

public class Summy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            int num = Character.getNumericValue(input.charAt(i));
            if (num > 0)
                sum += num;
        }
        System.out.println(sum);
    }
}

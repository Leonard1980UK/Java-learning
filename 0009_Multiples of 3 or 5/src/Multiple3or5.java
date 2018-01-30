import java.lang.*;

import java.util.*;

public class Multiple3or5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++){
            if (i%5 == 0 || i%3 == 0 ){
                sum+=i;
            }
        }

        System.out.println(sum);

    }
}

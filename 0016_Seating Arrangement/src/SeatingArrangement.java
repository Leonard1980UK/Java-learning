import java.util.*;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int test = t.nextInt();
        while (test > 0){
            Scanner s = new Scanner(System.in);
            int seatNumber = s.nextInt();

            if (seatNumber % 6 == 0 || seatNumber % 6 == 1){
                if (seatNumber % 6 == 0 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 11 + " WS");
                }else if (seatNumber % 6 == 0 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 1 + " WS");
                }if (seatNumber % 6 == 1 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 1 + " WS");
                }else if (seatNumber % 6 == 1 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 11 + " WS");
                }
            }
            if (seatNumber % 6 == 2 || seatNumber % 6 == 5){
                if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 9 + " MS");
                }else if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 3 + " MS");
                }if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 3 + " MS");
                }else if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 9 + " MS");
                }
            }
            if (seatNumber % 6 == 3 || seatNumber % 6 == 4){
                if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 7 + " AS");
                }else if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 5 + " AS");
                }if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                    System.out.println(seatNumber - 5 + " AS");
                }else if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                    System.out.println(seatNumber + 7 + " AS");
                }
            }
            test--;
        }


    }
}

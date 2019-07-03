import java.util.*;

public class SeatingArrangement {
    public static void main(String[] args) {
        // Open a new scanner
        Scanner t = new Scanner(System.in);
        // number of test cases
        int test = t.nextInt();
        while (test > 0){
            checkSeat(t.nextInt());
            test--;
        }
    }

    /**
     *
     * @param seatNumber number of seat to check
     */
    public static void checkSeat(int seatNumber){
        // if seat is a window seat
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
        // if seat is a middle seat
        if (seatNumber % 6 == 2 || seatNumber % 6 == 5){
            if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                System.out.println(seatNumber - 3 + " MS");
            }else if (seatNumber % 6 == 2 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                System.out.println(seatNumber + 9 + " MS");
            }if (seatNumber % 6 == 5 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                System.out.println(seatNumber - 9 + " MS");
            }else if (seatNumber % 6 == 5 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                System.out.println(seatNumber + 3 + " MS");
            }
        }
        // if seat is a aisle seat
        if (seatNumber % 6 == 3 || seatNumber % 6 == 4){
            if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                System.out.println(seatNumber - 5 + " AS");
            }else if (seatNumber % 6 == 3 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                System.out.println(seatNumber + 7 + " AS");
            }if (seatNumber % 6 == 4 && ((int) Math.ceil(seatNumber/6.0)%2 == 0)){
                System.out.println(seatNumber - 7 + " AS");
            }else if (seatNumber % 6 == 4 && ((int) Math.ceil(seatNumber/6.0)%2 != 0)){
                System.out.println(seatNumber + 5 + " AS");
            }
        }
    }
}

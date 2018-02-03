import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class Summy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        System.out.println(Stream.of(input).mapToLong(Long::valueOf).sum());
    }
}

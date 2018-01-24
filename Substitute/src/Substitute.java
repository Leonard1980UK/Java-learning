import java.util.*;
import java.lang.*;

public class Substitute {

    public static void main(String[] args) {
        // read key and code
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String code = sc.nextLine();
        sc.close();

        // create an instance of the class for using getValue method
        Substitute substitute = new Substitute();

        substitute.getValue(key,code);
    }
}

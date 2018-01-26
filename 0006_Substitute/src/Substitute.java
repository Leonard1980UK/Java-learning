import java.util.*;
import java.lang.*;

public class Substitute {
    public int getValue(String key, String code){
        //spilt the key to an char array
        char[] keyToNr = key.toCharArray();

        // check code length
        int codeLenght = code.length();

        // using StringBuilder to build decoded value
        StringBuilder stringBuilder = new StringBuilder();

        // iterate over key and code
        for (int i=0; i<codeLenght;i++){
            for (int j=0; j<10;j++){
                if(code.charAt(i) == keyToNr[j]){
                    if (j+1 == 10){
                        stringBuilder.append(0);
                    }else{
                        stringBuilder.append(j+1);
                    }

                }
            }
        }

        // return integer value
        return Integer.parseInt(stringBuilder.toString());

    }

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

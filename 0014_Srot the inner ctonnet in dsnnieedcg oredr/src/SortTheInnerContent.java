import java.util.stream.Stream;
import java.util.stream.*;
import java.util.Comparator;


public class SortTheInnerContent {
    public static void main(String[] args) {
        // sample string
        String words= "Sort the inner content in descending order";
        // split string to string array
        String[] parts = words.split(" ");
        // initialize string builder
        StringBuilder sortedString = new StringBuilder();
        // iterate over the string array
        for (int i = 0;i<parts.length; i++ ){
            // get string length
            int stringLength = parts[i].length();
            // check words with more than 3 letters
            if (stringLength > 3) {
                // get the middle of the word
                String subStr = parts[i].substring(1,stringLength-1 );
                // sort char array
                String sorted =
                        Stream.of(subStr.split(""))
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.joining());
                // concat reversed middle and the firs and last letters
                String reversed = parts[i].charAt(0) + sorted + parts[i].charAt(stringLength-1) + ' ';
                // build back a string with the sorted words
                sortedString.append(reversed);

            }else{
                // if word less than 4 letters do nothing
                sortedString.append(parts[i] + ' ');
            }
        }
        // trim the last whitespace
        System.out.println(sortedString.toString().trim());
    }
}

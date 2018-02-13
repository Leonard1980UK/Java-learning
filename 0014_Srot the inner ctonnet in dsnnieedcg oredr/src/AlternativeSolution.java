import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class AlternativeSolution {
    public static String sortTheInnerContent(String words) {
        return Arrays.asList(words.split(" ")).stream()
                .map(word -> word.length() < 3 ? word : word.charAt(0) + sortChars(word) + word.charAt(word.length() - 1))
                .collect(Collectors.joining(" "));
    }

    public static String sortChars(String word) {
        String[] chars = word.substring(1, word.length() - 1).split("");
        Arrays.sort(chars, Collections.reverseOrder());
        return String.join("", chars);
    }
    public static void main(String[] args) {

        sortTheInnerContent("This is a alternate solution made by: https://www.codewars.com/users/MATEK303");
    }
}

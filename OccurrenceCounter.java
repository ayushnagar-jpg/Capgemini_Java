import java.util.*;

public class OccurrenceCounter {
    public static void main(String[] args) {
        String text = "apple banana apricot batman appleberry";
        String prefix = "ap";

        String[] words = text.split("\\s+"); 
        int count = 0;

        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }

        System.out.println("Number of words starting with '" + prefix + "': " + count);
    }
}

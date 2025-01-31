import java.util.*;
public class AlphabetFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        input = input.toLowerCase();

        int[] freq = new int[26];

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++; 
            }
        }
        System.out.println("Alphabet Frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) { 
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }
    }
} 


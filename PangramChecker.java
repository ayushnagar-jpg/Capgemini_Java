import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String str) {
      
        str = str.toLowerCase();

        boolean[] letterPresent = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letterPresent[ch - 'a'] = true; 
            }
        }

        for (boolean present : letterPresent) {
            if (!present) {
                return false; 
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        if (isPangram(input)) {
            System.out.println("The given string is a PANGRAM.");
        } else {
            System.out.println("The given string is NOT a pangram.");
        }
    }
}

//A pangram is a sentence that contains every letter of the alphabet at least once. For example:
//✅ "The quick brown fox jumps over the lazy dog
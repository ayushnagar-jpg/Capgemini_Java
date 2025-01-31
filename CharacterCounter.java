import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, specialCharCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Uppercase Letters: " + uppercaseCount);
        System.out.println("Lowercase Letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}

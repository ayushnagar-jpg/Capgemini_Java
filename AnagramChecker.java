import java.util.*;
public class AnagramChecker {
public static boolean isAnagram(String str1,String str2){

    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();
     
    if (str1.length() != str2.length()) {
        return false;
    }
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    
    return Arrays.equals(charArray1, charArray2);
}



    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter String1:");
      String str1 = sc.nextLine();

      System.out.print("Enter String2:");
      String str2 = sc.nextLine();

      if (isAnagram(str1, str2)) {
        System.out.println("The strings are anagrams.");
    } else {
        System.out.println("The strings are NOT anagrams.");
   }
 }
}


//An anagram is a word or phrase formed by rearranging the letters of another. For example, "listen" and "silent" are anagrams.

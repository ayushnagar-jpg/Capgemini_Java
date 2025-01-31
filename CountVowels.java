import java.util.*;

public class CountVowels {

 public static int countvowels(String str){
    int count =0;
    str = str.toLowerCase();
    for(char ch: str.toCharArray()){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u'){
            count++;
        }
    }
    return count;
 }

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the String:");

      String input = sc.nextLine();

      int VowelCount = countvowels(input);
      System.out.println("Number of vowels: " + VowelCount);

    }
}

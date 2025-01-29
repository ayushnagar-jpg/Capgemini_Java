import java.util.*;
public class Removeduplicate {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArr = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArr[index++] = num;
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
    
}

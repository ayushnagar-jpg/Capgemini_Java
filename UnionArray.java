import java.util.*;
public class UnionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int []arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr1) {
            uniqueSet.add(num);
        }
        for(int num : arr2){
            uniqueSet.add(num);
        }
        System.out.print(uniqueSet);
    }
    
}

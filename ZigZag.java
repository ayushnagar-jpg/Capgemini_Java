import java.util.*;

public class ZigZag {
    public static int[] mergeZigzag(int[] arr1, int[] arr2) {
      int n1 = arr1.length;
      int n2 = arr2.length;
      int[] merged= new int[n1+n2];
      int i=0,j=0,k=0;
      while (i < n1 && j < n2) {
        merged[k++] = arr1[i++];
        merged[k++] = arr2[j++];
    }

    while (i < n1) {
        merged[k++] = arr1[i++];
    }

    while (j < n2) {
        merged[k++] = arr2[j++];
    }

    return merged;
   }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[]arr1 = new int[n];
    int[]arr2 = new int[m];

    for(int i =0;i<n;i++){
        arr1[i] = sc.nextInt();
    }
    for(int j=0;j<m;j++){
        arr2[j] = sc.nextInt();
    }
    int[] result = mergeZigzag(arr1, arr2);

    System.out.println("Merged Zigzag Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
}
}

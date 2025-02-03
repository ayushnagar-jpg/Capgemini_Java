import java.util.*;

public class MoveZeroes {

public static void moveZeroesToEnd(int arr[]){
    int index = 0; 

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[index++] = arr[i];
        }
    }

    while (index < arr.length) {
        arr[index++] = 0;
    }
}

    public static void main(String []args){
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        moveZeroesToEnd(arr);

        System.out.println("Array after moving zeroes:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
        
    }
}

import java.util.*;

public class minmax {

    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

     System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

       
        sc.close();
    }
}


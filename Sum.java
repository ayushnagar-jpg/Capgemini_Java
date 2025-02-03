import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.print("Enter the Values of 2d Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                sum+= arr[i][j];
            }
        }
        System.out.println("Sum of all elements in the 2D array: " + sum);
        
        sc.close();
        
    }
}
























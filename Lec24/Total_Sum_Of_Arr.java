package Lec24;
import java.util.*;
public class Total_Sum_Of_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for m and n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of 2D Array :");
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                System.out.print(arr[row] [col]+ " ");
            }
            System.out.println();
        }

        // find the total sum of the 2D array
        int totalSum = 0;
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                totalSum += arr[row][col];
            }
        }        
        System.out.println("Total Sum of the 2D Array : " + totalSum);

        sc.close();
    }
}

package Lec24;
import java.util.*;
public class Minimum_Of_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m and n : ");
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
        
        int min = Integer.MAX_VALUE;
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        System.out.println("Minimum element in the 2D Array : " + min);
        sc.close();
    }
}

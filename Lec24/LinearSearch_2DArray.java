package Lec24;
import java.util.*;
public class LinearSearch_2DArray {
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

        sc.close();

        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                System.out.print(arr[row] [col]+ " ");
            }
            System.out.println();
        }
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(arr[row][col] == 5){
                    System.out.println("Element is found at index : " + row + " " + col);
                    break;
                }
            }
        }
        
    }
}

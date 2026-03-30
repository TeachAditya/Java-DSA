package Lec24;
import java.util.*;
public class BinarySearch_2DArray {
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

        System.out.println("Enter the element to be searched : ");
        int key = sc.nextInt();

        int row=0;
        int col=0;

       boolean found = false;

        while(row<m && col<n){
            if(arr[row][col] == key){
                System.out.print(arr[row][col] + " is found at index : " + row + " " + col);
                found = true;
                break;
            }
            else if(arr[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
        if(!found){
            System.out.println("Element is not found in the 2D Array !");
        }

        sc.close();
    }
}

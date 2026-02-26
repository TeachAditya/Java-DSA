package Lec13;
import java.util.*;
public class Bubble_short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];  
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

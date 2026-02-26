package Lec13;
import java.util.*;
public class Insertion_short2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

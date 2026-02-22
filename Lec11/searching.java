package Lec11;
import java.util.*;
public class searching {
    public static void searchElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array :");
        int n = sc.nextInt();
        int []arr = new int[n];       //searching element in an array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        display(arr, k);
        sc.close();
    }
    public static void display(int []arr, int k){
        for(int i=0; i < arr.length; i++){
            if(arr[i] >= 0){
                if(arr[i] == k){
                    System.out.println("Element found at index : "+i);
                    return;
                }
            }
        }
    }
}

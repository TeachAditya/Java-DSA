package Lec14;
import java.util.*;
public class Array_Peakindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements :");
        int n = sc.nextInt();
    
        System.out.println("Enter "+n+" elements: ");
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int result = find_peak_index(arr);
        System.out.println(result);
        
    }
    
    public static int find_peak_index(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
    
}

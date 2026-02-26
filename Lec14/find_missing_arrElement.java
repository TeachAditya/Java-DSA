package Lec14;
import java.util.*;
public class find_missing_arrElement {   //User imput array of size n and find the missing element in the array from 0 to n 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" the elements : ");
        int[] arr= new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int total_sum = n*(n+1)/2;
        int missing_num = total_sum - sum;
        System.out.println("Missing element is : "+missing_num);
    }
}
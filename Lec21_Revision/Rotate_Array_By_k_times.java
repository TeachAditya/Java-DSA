package Lec21_Revision;
import java.util.*;
public class Rotate_Array_By_k_times {
    public static void main(String[] args) {
        //int[] arr= {1,2,3,4,5};
        //int k = 2; // number of times to rotate
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k : ");
        int k = sc.nextInt();

        sc.close();

        for(int i = 0; i < k; i++){
            int last = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }
}

 
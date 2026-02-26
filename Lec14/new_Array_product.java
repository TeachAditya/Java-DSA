package Lec14;
import java.util.*;
public class new_Array_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr= new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i=0; i<arr.length; i++){
        int product = 1;
        for(int j=0; j<arr.length; j++){
            if(i!=j){
                product = product*arr[j];
            }
        }
        System.out.print(product+" "); 

        int[] newarr = new int[n];  //make new array and store the product
        newarr[i] = product;
        System.out.println();
       
        
      }

        }
        
}
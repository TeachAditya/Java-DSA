package lec6;
import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value : ");
        int n = sc.nextInt();

        int space = n-1;
        int star = 1;
        int i = 1;
        
        sc.close();

        while (i<= (2*n)-1) {
            int j = 1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k<=star) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            if(i<n){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            
            i++;
        }
    }
}

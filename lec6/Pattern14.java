package lec6;
import java.util.*;
public class Pattern14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();

        int row = 1;
        int star = 1;

        while(row <= (2*n)-1){
            int j = 1;
            while (j<= star) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            if(row<n){
            star++;
        }else{
            star--;
        }
        row++;
        }
        sc.close();
    }
}
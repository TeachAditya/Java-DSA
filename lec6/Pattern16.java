package Lec6;
import java.util.*;
public class Pattern16 {     // Mirror Square Pattern leaving a V shape space inside it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int n = sc.nextInt();
        int space = 1;
        int star = n-1;
        int row = 1;

        sc.close();
        while (row <= (2*n)-1) {
            int i = 1;
            while(i <= star){
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }
            
            
            int k = 1;
            while(k<=star){
                System.out.print("*");
                k++;
            }
            System.out.println();
            if(row<n){
                space += 2;
                star--;
            }else{
                space -= 2;
                star++;
            }
            
            row++;
        }
    }
}

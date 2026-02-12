package Lec6;
import java.util.*;
public class Pattern17 {   //Pyramid Pattern having row numbers series in each row 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = sc.nextInt();

        int space = n-1;
        int star = 1;
        int i = 1;

        sc.close();

        while (i <= n) {
            int j = 1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                System.out.print(i);
                k++;
            }
            System.out.println();
            space--;
            star+=2;
            i++;
        }
    }
}

package lec5;
import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Value : ");
        int n = sc.nextInt();
        int space = 0;
        int star = 2*(n)-1;
        int i = 1;

        sc.close();

        while (i<=n) {
            int j = 1;
            while (j <= space) {
             System.out.print(" "); 
             j++;  
            }
            int k = 1;
            while (k <= star) {
                System.out.print("*");
                k++;
            }
            System.out.println( );
            space++;
            star = star - 2;
            i++;
        }

    }
}

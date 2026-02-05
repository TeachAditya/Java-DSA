package lec4;

import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

         System.out.println();
         System.out.println();
         
        int row = 1;
        while (row<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
        }

        sc.close();
    }
    
}

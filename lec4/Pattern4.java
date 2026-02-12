package Lec4;

import java.util.Scanner;

public class Pattern4 {        //Invert L Triangle Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

         System.out.println();
         System.out.println();
         
        int row = 1;
        while (row<=n) {
            int j = n;
            while (j>=row) {
                System.out.print(" * ");
                j--;
            }
            System.out.println();
            row++;
        }

        sc.close();
    }
}

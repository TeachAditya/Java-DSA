package Lec4;

import java.util.Scanner;

public class Pattern5 {    // Inert _| Triangle Pattern
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
        
        int space = 0;
        int star = n; 
        int row = 1;

        sc.close();

        while (row<=n) {
            int i = 1;
            //space
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            //star
            while (j<=star) {
                System.out.print("*");
                j++;
            }
        
            System.out.println();
            space++;
            star--;
            row++;
        }        
    }     
     
}

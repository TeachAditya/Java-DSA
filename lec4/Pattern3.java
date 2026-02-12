package Lec4;

import java.util.Scanner;

public class Pattern3 {       //  _|  Triangle Pattern
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int space = n-1;
        int star = 1; 
        int row = 1;

        sc.close();

        //space
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j<=star) {
                System.out.print("*");
                j++;
            }
        
            System.out.println();
            space--;
            star++;
                row++;
        }        
    }     
     
}
     

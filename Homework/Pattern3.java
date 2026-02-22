package Homework;

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
         
        // using for loop
        for(row=1; row<=n; row++){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            star++;
        }       
    }     
     
}
     

package Homework;

import java.util.*;

public class Pattern11 {      // Pyramid Pattern with exclamation and star
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int i = 1;
        
        sc.close();
        
        //Using for loop
        for(i=1;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                if(k%2==1){
                   System.out.print("*");
                }else{
                    System.out.print("!");
                }
            }
           System.out.println();
           space--;
           star = star + 2;
        }
    }
}

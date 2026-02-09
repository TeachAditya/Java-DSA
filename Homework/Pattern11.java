package Homework;

import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int i = 1;
        
        sc.close();
        
         while(i<n){
            int j = 1;
            //space
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            //star
            while(k<=star){
                if(k%2==1){
                   System.out.print("*");
                }else{
                    System.out.print("!");
                }
                k++;
            }
           System.out.println();
           space--;
           star = star + 2;
           i++;
        }
    }
}

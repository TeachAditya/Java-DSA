package Homework;
import java.util.*;
public class Pattern8 {       //Pyramid Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        
        sc.close();

        //Using for loop
        for(int i=1;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            star = star + 2;
        }
    
    }
}

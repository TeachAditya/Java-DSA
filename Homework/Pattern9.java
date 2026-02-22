package Homework;
import java.util.*;
public class Pattern9 {        //Invert Pyramid Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Value : ");
        int n = sc.nextInt();
        int space = 0;
        int star = 2*(n)-1;
        int i = 1;

        sc.close();
        
        //Using for loop
        for(i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println( );
            space++;
            star = star - 2;
        }

    }
}

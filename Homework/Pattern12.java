package Homework;
import java.util.*;
public class Pattern12 {   // Square Pattern leaving a V shape space inside it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int space = 2*(n) - 3;
        int star = 1;
        int row = 1;
    
        sc.close();

        //Using for loop
        for(row=1;row<=n;row++){
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if(row==n){
                star--;
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            space-=2;
            star++;
        }
    }
}

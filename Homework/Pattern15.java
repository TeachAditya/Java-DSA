package Homework;
import java.util.*;
public class Pattern15 {          //Right side Pyramid Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value : ");
        int n = sc.nextInt();

        int space = n-1;
        int star = 1;
        int i = 1;
        
        sc.close();

        //Using for loop
        for(i=1;i<=(2*n)-1;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
        }
    }
}

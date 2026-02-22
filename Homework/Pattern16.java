package Homework;
import java.util.*;
public class Pattern16 {     // Mirror Square Pattern leaving a V shape space inside it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int n = sc.nextInt();
        int space = 1;
        int star = n-1;
        int row = 1;

        sc.close();
        
        //Using for loop
        for(row=1;row<=(2*n)-1;row++){
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            if(row<n){
                space += 2;
                star--;
            }else{
                space -= 2;
                star++;
            }
        }
    }
}
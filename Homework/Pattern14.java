package Homework;
import java.util.*;
public class Pattern14{         //Left side Pyramid Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();

        int row = 1;
        int star = 1;

        //Using for loop
        for(row=1;row<=(2*n)-1;row++){
            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            System.out.println();
            if(row<n){
                star++;
            }else{
                star--;
            }
        }
        sc.close();
    }
}
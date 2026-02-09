package Homework;
import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int space = 1;
        int star = n;
        int row = 1;
    
        sc.close();

        while (row<=n) {
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }
            if(row==n){
                star++;
            }
            int k = 1;
            while(k<=star){
                System.out.print("*");
                k++;
            }
            System.out.println();
            space+=2;
            star--;
            row++;
        }
    }
}


// home work 
//*********
//**** ****
//***   ***
//**     **
//*       *
// / */
package Homework;
import java.util.*;
public class Pattern6 {       //Inverted Right angle slopy Pattern
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
        
        int space = 0;
        int star = n; 
        int row = 1;

        sc.close();

        //Using for loop
        for(row=1; row<=n; row++){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            space=space +4;
            space++;
            star--;
        }      
    }    
    
}

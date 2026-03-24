package Lec15_Test;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        /*
        *******
             *****
                  ****
                      ***
                           *
                    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int space = 0;
        int star = n*2-1;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 2;
        }
    }
}

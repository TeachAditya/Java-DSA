package Homework;

import java.util.*;

public class Pattern7 {   //Corner edge Star Square Pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Value : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // columns
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

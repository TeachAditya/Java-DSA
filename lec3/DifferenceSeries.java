package Lec3;
import java.util.Scanner;

public class DifferenceSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int a = sc.nextInt();

        System.out.print("Enter the difference: ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int term = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term + d;
        }

        sc.close();
    }
}

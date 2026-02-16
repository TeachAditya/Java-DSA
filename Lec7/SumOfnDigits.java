package Lec7;
import java.util.*;
public class SumOfnDigits {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Sum of digits is : "+sum);
    }
}

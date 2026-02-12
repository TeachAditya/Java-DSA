package Lec7;
import java.util.*;
public class ReverseNo {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        int n = sc.nextInt();
        sc.close();
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println("Reversed number is : "+rev);
    }
}

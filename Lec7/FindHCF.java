package lec7;
import java.util.*;
public class FindHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for HCF :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        while(a%b != 0){      //Method 1
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(b);
        System.out.println();

        while(b>0){          //Method 2
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }
}

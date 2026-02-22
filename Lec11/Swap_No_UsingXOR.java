package Lec11;
import java.util.*;
public class Swap_No_UsingXOR { // using void function
    public static void display(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping : "+a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        display(a, b);
    }
}

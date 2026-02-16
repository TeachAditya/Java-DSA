package Lec7;
import java.util.*;
public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime : ");
        int n = sc.nextInt();
           
        sc.close();
        int prime = 1;


        for(int i = 2; i<n; i++){
            if(n%i == 0){
                prime = 0;
                break;
            }
        }

        if(prime == 1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}

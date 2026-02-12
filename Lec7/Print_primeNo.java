package lec7;
import java.util.*;
public class Print_primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i =2 ; i<=n;i++) {
            int prime = 1;
            for(int j = 2; j<i; j++){
                if(i%j == 0){
                    prime = 0;
                    break;
                }
            }
            if(prime == 1){
                System.out.println(i);
            }
        }
    }
}

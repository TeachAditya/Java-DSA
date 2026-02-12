package lec7;
import java.util.*;
public class Print_Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}

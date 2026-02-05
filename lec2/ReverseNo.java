package lec2;
import java.util.Scanner;
public class ReverseNo {
   public static void main(String[] args) {
    int rd, ans = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    while(n > 0){
        rd = n % 10;
        ans = ans * 10 + rd;
        n = n /10;
    }
    System.out.println(ans);
    sc.close();
   } 
   
}

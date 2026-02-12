package Lec3;
import java.util.Scanner;
public class LotteryGame {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    if(n>=300 && n<=460){
        System.out.println("The prize is MacBook");
    }else if(n>=200 && n<=280){
        System.out.println("The prize is Kurkure");
    }else if(n>=1100 && n<=1500){
        System.out.println("The prize is Cycle");
    }else if(n>=50 && n<=80){
        System.out.println("The prize is Bike");
    }else{
        System.out.println("Better luck next time");
    }
    sc.close();
   }
}

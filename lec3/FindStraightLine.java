package Lec3;
import java.util.Scanner;
public class FindStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Coordinates of X1:");
        int x1= sc.nextInt();
        System.out.println("Enter the Coordinates of X2:");
        int x2= sc.nextInt();
        System.out.println("Enter the Coordinates of X3:");
        int x3= sc.nextInt();
        System.out.println("Enter the Coordinates of Y1:");
        int y1= sc.nextInt();
        System.out.println("Enter the Coordinates of Y2:");
        int y2= sc.nextInt();
        System.out.println("Enter the Coordinates of Y3:");
        int y3= sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("Straight Line");
        }else{
            System.out.println("Not a Straight Line");
        }
        sc.close();
    }
    
}

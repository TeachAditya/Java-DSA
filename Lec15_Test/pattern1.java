package Lec15_Test;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {   
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int space = n-1;
        int star = 1;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=space; i++){
                System.out.print("  ");
            }
            int num = row;
            for(int j=1; j<=star; j++){
                System.out.print(num + " ");
                if(j <= star/2){
                    num++;
                } else {
                    num--;
                }
            }
            System.out.println();
            space--;
            star += 2;
        }
        
    }
}
/*    1 
    2 3 2
  3 4 5 4 3
4 5 6 7 6 5 4
*/
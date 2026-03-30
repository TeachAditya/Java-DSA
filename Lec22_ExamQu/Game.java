package Lec22_ExamQu;

public class Game {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,9,7};
        int j = arr.length-1;
        int i = arr[0];
        int A =0, B =0;
        int turn = j;
        while (i<=j) {
            if (turn == j) {
                if(arr[i] < arr[j]){
                    A += arr[j];
                    j--;
                } else {
                    A += arr[i];
                    i++;
                }
                turn = 0;
            } else {
                if(arr[i] < arr[j]){
                    B += arr[j];
                    j--;
                } else {
                    B += arr[i];
                    i++;
                }
                turn = 1;
            }
        }
        System.out.println("Player A: " + A);
        System.out.println("Player B: " + B);
    }
}

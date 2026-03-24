package Lec15_Test;

public class problem {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1};      // make it as 1,1,1,0,0,0,0
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println("Count of 1s: " + count);
            for(int i=0; i<count; i++){
                arr[i] = 1;
            }
            for(int i=count; i<arr.length; i++){
                arr[i] = 0;
            }
            System.out.println("Modified array:");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
    }
}

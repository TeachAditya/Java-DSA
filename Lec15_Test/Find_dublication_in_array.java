package Lec15_Test;
public class Find_dublication_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Dublication element is: " + arr[i]);
                }
            }
        }
    }
}


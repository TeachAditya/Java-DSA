package Lec21_Revision;

public class Inverse_array {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 4, 3}; // Example input
        int[] inverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inverse[arr[i]] = i;
        }

        System.out.println("Inverse array:");
        for (int i = 0; i < inverse.length; i++) {
            System.out.print(inverse[i] + " ");
        }
    }
}

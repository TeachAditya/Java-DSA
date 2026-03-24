package Lec18;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;           
        int end = arr.length - 1;   

        sc.close();

        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;   

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found in array.");
        }
    }
}
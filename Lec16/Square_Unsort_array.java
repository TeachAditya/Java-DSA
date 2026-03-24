package Lec16;
import java.util.*;
public class Square_Unsort_array {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = sortedSquares(arr);
        System.out.println("Sorted Squares: " + Arrays.toString(ans));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}

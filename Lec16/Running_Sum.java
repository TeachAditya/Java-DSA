package Lec16;
import java.util.*;
public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println("Running Sum: " + Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}

package Lec21_Revision;
import java.util.*;
public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println("Running Sum: " + Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}

package Lec16;
import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println("Two Sum Indices: " + Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Return -1 if no solution found
    }
}

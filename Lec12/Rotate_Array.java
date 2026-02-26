package Lec12;
class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // 1. Handle cases where k > n
        k = k % n;
        if (k == 0) return;

        // 2. The Reversal Magic:
        // Reverse the whole array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
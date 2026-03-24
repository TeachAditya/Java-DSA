package Lec21_Revision;

public class Trappng_Rainwater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(height);
        System.out.println("Trapped Rainwater: " + trappedWater);
    }
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left array
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Fill right array
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // Calculate trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            trapped += Math.min(left[i], right[i]) - height[i];
        }

        return trapped;
    }
}

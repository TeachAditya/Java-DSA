package Lec21_Revision;

public class RightShift_By1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rightShiftByOne(arr);
        System.out.println("Array after right shift by one: " + java.util.Arrays.toString(arr));
    }

    public static void rightShiftByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}

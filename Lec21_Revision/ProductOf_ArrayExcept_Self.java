package Lec21_Revision;

public class ProductOf_ArrayExcept_Self {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);

        System.out.println("Product of array except self:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Calculate left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

}

package Arrays;

public class Array_subArray {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(prices[k] + " ");
                }
                System.out.println(); // new line for each subarray
            }
        }
    }
}

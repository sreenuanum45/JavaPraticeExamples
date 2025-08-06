package Arrays;

import java.util.Arrays;

public class arraySortedOrNot {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 10, 1, 3, 6, 9, 2};
        Arrays.sort(prices);
        boolean isSorted = true;

        if (prices.length == 0 || prices.length == 1) {
            isSorted = true;
        } else {
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < prices[i - 1]) {
                    isSorted = false;
                    break; // no need to continue, already not sorted
                }
            }
        }

        System.out.println("Sorted: " + isSorted);
    }
}

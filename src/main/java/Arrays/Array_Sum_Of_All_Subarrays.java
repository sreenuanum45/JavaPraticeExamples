package Arrays;

public class Array_Sum_Of_All_Subarrays {
    public static void main(String[] args) {
        int[] prices = {1, 4, 5, 3, 2};
        int result = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            result += prices[i] * (i + 1) * (n - i);
        }
        System.out.println("result: " + result);

    /*        for (int i = 0; i < prices.length; i++) {
            int temp = 0;  // to store sum of subarrays starting from i
            for (int j = i; j < prices.length; j++) {
                temp += prices[j];  // accumulate sum from i to j
                result += temp;     // add to result
            }
        }*/
    }
}

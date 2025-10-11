package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_Leaders {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 10, 1, 3, 6, 9, 2};
        int n = prices.length;

        List<Integer> l = new ArrayList<>();
        l.add(prices[n - 1]);
        int maxright = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (prices[i] > maxright) {
                maxright=prices[i];
                l.add(prices[i]);
            }
        }
        System.out.println(l.size());
        System.out.println(l.stream().toList());
    }
}

package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 10,2,2,21, 3, 6, 9, 2,2,2};
        HashSet<Integer> s = new HashSet<>();
        int index=0;
        for(int i=0;i< prices.length;i++){
            if(!s.contains(prices[i])){
                s.add(prices[i]);
                prices[index++]=prices[i];
            }
        }
        // Only print the array portion with unique values
        int[] uniquePrices = Arrays.copyOf(prices, index);
        System.out.println(Arrays.toString(uniquePrices));
    }
}

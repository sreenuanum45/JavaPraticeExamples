package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        Collections.reverse(Arrays.asList(prices));
        int reverse[]=new int[prices.length];
System.out.println("before :"+Arrays.toString(prices));
        int n = prices.length;
        int start=0;
        int end=n-1;
        while (start<end){
            int temp=prices[start];
            prices[start]=prices[end];
            prices[end]=temp;
            start++;
            end--;
        }
        System.out.println("using whileloop:"+Arrays.toString(prices));
        //loops
        for(int j=0;j<n;j++){
           reverse[j] =prices[n-j-1];
        }

        System.out.println("using forloop:"+Arrays.toString(reverse));
        //using
        for(int i=0;i<n/2;i++){
            int temp = prices[i];
            prices[i] = prices[n - i - 1];
            prices[n - i - 1] = temp;
        }
        System.out.println("using hlaf array :"+Arrays.toString(prices));
    }
}

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_Leaders_1 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 10, 1, 3, 6, 9, 2};
        List<Integer> l=new ArrayList<>();
        int n = prices.length-1;
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                    l.add(prices[j]);
                    break;
                }
            }
            if(j==n){
                l.add(prices[j]);
            }
        }
        System.out.println(l.stream().toList());
    }
}

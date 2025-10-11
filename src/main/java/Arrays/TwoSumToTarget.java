package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumToTarget {
    public static void main(String[] args) {
        int []a={1,2,3,5,6,6,7,8,9,5,5};
        System.out.println(Arrays.toString(twoSum(a, 5)));
        System.out.println(Arrays.toString(twoSum1(a,10)));
    }
    public static int[]twoSum(int []a,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int complement=target-a[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
    public static int[]twoSum1(int[]a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

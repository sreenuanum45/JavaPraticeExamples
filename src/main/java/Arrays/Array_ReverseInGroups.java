package Arrays;

import java.util.Arrays;

public class Array_ReverseInGroups {
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70,100};
        int n=arr.length;
        int k=3;
        for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while (left<right){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
        /*for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while (left<right){
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));*/

    }
}

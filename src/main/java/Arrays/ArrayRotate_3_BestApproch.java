package Arrays;

import java.util.Arrays;

public class ArrayRotate_3_BestApproch {
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70,100};
        int n=arr.length;
        int d=3;
        //d%=n;
        //reverse the first element
        reverse(arr,0,d-1);
        //reverse remainnig
        reverse(arr,d,n-1);
        //reverse entire array
        reverse(arr,0,n-1);
System.out.print(Arrays.toString(arr));
    }
    public static void reverse(int []arr,int Start,int End){
        while (Start<End){
            int temp=arr[End];
            arr[End]=arr[Start];
            arr[Start]=temp;
            Start++;
            End--;
        }
    }
}

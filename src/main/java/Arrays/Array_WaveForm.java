package Arrays;

import java.util.Arrays;

public class Array_WaveForm {
    public static void main(String[] args) {
        //wave form swapping the adjecent one

        int []arr=new int[]{10,20,30,40,50,60,70,100};
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;      }
        System.out.println("after wave form:"+Arrays.toString(arr));
    }
    public static void Swap(){

    }
}

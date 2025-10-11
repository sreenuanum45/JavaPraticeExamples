package Arrays;

import java.util.Arrays;

public class Array_Add_One {
    public static void main(String[] args) {

        int []arr=new int[]{9,9};
        int[] newArr = new int[arr.length + 1];
        int n=arr.length;
        int carray=1;
        for(int i=n-1;i>=0;i--){
            int sum=arr[i]+carray;
            ;arr[i]=sum % 10;
            carray=sum / 10;
        }
        if(carray > 0) {
            newArr[0] = carray;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
        }
        else {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(newArr));
    }
}

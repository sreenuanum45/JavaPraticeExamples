package Arrays;

import java.util.Arrays;

public class ArrayZeroElementRight {
    public static void main(String[] args) {
        int[] arr=new int []{1,0,3,4,5,6,0};
        int []result=new int[arr.length];
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[ count++]=arr[i];
               ;
            }
        }
//        //addding zeros
        while(result.length>count){
            result[count++]=0;
            ;
        }
        System.out.println(Arrays.toString(result));
        pushZerosToEnd(arr);


    }
    static void pushZerosToEnd(int[] arr) {
        int count = 0;  // Count of non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap only if i and count are different
                if (i != count) {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count++; // Only increment when non-zero is found
            }
        }
    }

}

package Arrays;

import java.util.Arrays;

public class ArrayArrangement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 7, 0, 5, 0, 3, 0};
        int[] result = new int[arr.length];
        int index = arr.length - 1;
        for(int i=index;i>=0;i--) {
            if (arr[i] != 0) {
                result[index--] = arr[i];
            }
        }
        while (index>=0){
            result[index--] =0;
        }
        System.out.println(Arrays.toString(result));

    }
}

package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arrays_Methods {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 20, 33, 34, 33, 22, 34, 1};
        int []clone=arr.clone();

        System.out.println(Arrays.compare(arr,clone));
        Set<Integer> s = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!s.add(arr[i])) {
                System.out.println("Duplicate values:" + Arrays.binarySearch(arr, arr[i]));
            }
        }
        System.out.println(Arrays.toString(arr));
        //filling array values
        for (int i = 0; i < arr.length; i++) {

        }
        }

    }


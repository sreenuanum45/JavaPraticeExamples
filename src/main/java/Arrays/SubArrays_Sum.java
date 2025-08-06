package Arrays;

public class SubArrays_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j <= arr.length; j++) {
                if (sum == target) {
                    System.out.println("found between the :" + i + "and" + (j - 1) + "");
                }
                if(j==arr.length)break;;
                sum += arr[j];
            }
        }
    }
}

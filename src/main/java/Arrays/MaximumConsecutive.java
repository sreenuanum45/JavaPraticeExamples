package Arrays;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1, 1,2,3,3,3,3,3,3,4};
        int n = arr.length - 1;
        int maxcount = 0;
        int count = 1;
        int element = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                element = arr[i];
                count++;
            } else {
                element = arr[i - 1];
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
        }
        System.out.println("maximum element count:  " + element + "repeated  :" + maxcount);
    }
}

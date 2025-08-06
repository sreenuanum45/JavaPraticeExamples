package Arrays;

public class MaximumConsecutive_1 {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1, 1};

        int maxcount = 1;
        int count = 1;
        int element = arr[0];
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                    maxElement = arr[i - 1];
                }
                count = 1;
            }
        }
        // Final check after loop ends
        if (count > maxcount) {
            maxcount = count;
            maxElement = arr[arr.length - 1];
        }

        System.out.println("Maximum consecutive element: " + maxElement + ", repeated: " + maxcount + " times");
    }
}

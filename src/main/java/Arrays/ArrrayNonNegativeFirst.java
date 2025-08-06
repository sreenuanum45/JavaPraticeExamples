package Arrays;

public class ArrrayNonNegativeFirst {
    public static void main(String[] args) {
        int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};
        System.out.println("num array:"+nums.length);
        int[] output = new int[nums.length];
        System.out.println("output:"+output.length);
        int end = nums.length;
        for (int i = 0; i < end; i++) {
            if (nums[i] > 0) {
                output[i] = nums[i];

            }
        }
        for (int i = 0; i < end; i++) {
            if(nums[i]<0){
                output[i] = nums[i];

            }
        }


    }

}

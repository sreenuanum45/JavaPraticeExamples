package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 20, 33, 34, 33, 22, 34, 1};
        int largest=-1;
        int secondlargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest:"+largest);
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secondlargest&&arr[j]!=largest){
                secondlargest=arr[j];
            }
        }
        System.out.println("secondlargest:"+secondlargest);

    }
}

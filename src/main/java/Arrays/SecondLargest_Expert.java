package Arrays;

public class SecondLargest_Expert {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 20, 33, 34, 33, 22, 34, 1};
        int largest=-1;
        int secondlargest=-1;
        int thrid=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest){
                secondlargest=largest;
                thrid=secondlargest;
                largest=arr[i];
        } else if (arr[i]>secondlargest) {
                thrid=secondlargest;
                secondlargest=arr[i];
            } else if (arr[i]>thrid) {
                thrid=arr[i];
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("2nd largest:"+secondlargest);
        System.out.println("3 rd largest:"+thrid);
    }
}

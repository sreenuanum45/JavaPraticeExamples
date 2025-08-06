package Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 20, 33, 34, 33, 22, 34};
        int largest=Integer.MAX_VALUE;
        int secondlargest=Integer.MAX_VALUE;
        int thrid=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<largest){
                largest=secondlargest;
                secondlargest=thrid;
               arr[i]= largest;
            } else if (arr[i]<secondlargest) {
                secondlargest=thrid;
               arr[i]= secondlargest;
            } else if (arr[i]<thrid) {
               arr[i]= thrid;
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("2nd largest:"+secondlargest);
        System.out.println("3 rd largest:"+thrid);
    }
}

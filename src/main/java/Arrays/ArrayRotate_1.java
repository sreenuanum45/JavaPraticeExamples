package Arrays;



import java.util.Arrays;

public class ArrayRotate_1 {
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70,100};
        int n=arr.length;
        int numberOfRotation=3;
        for(int i=0;i<numberOfRotation;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
        System.out.print(Arrays.toString(arr));
    }
}

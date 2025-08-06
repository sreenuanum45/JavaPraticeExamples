package Arrays;

import java.util.Arrays;

public class ArrayRotate_2 {
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70,100};
        int[]temp=new int[arr.length];
        int n=arr.length;
        int numberOfRotation=3;
        numberOfRotation%=n;
        for(int i=0;i<n-numberOfRotation;i++){
            temp[i]=arr[numberOfRotation+i];
        }
        for(int j=0;j<numberOfRotation;j++){
            temp[n-numberOfRotation+j]=arr[j];
        }
        System.out.print(Arrays.toString(temp));

    }
}

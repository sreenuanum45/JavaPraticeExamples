package Arrays;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int length=arr.length;
        int k=10;
        k=k%length;
        System.out.println("k: value:"+k);
        int result[]=new int[length];
        for(int i=0;i<k;i++){
            result[i]=arr[length-k+i];
        }
        int x=0;
        for(int i=k;i<length;i++){
            result[i] = arr[x];
            x++;
        }
        for(int j=0;j<result.length;j++){
            System.out.println(result[j]);
        }
      System.arraycopy(result,0,arr,0,length); // Copying the result back to the original array
        System.out.println("Rotated Array: " + Arrays.toString(arr)); // Displaying the rotated array
        //using the Bubble Sort algorithm
        //2 nd way to rotate the array
        for(int i=0;i<k;i++){
            for(int j=length-1;j>0;j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        System.out.println("bubble "+Arrays.toString(arr));
        // 3 way

        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int []arr,int k){
        int a=arr.length-k;
        reverse(arr,0,a-1);
        reverse(arr,a,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int []a,int left,int right){

        while(left < right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }

    }




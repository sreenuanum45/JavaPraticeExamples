package Arrays;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SortingAlgoritham {
    public static void main(String[] args) {
        int []a={7,8,2,9,4,5,6,1,2,3,0,0,0,1,1,1,1,4,4,4,4};
        boolean verifySorted= false;
        System.out.println(Arrays.toString(verifyUsingSelectSort(a)));
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                verifySorted=true;
                break;
            }
        }
        System.out.println("verify the Sorting:"+verifySorted);
        System.out.println(Arrays.toString(verifyUsingBubbleSort(a)));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static int[]verifyUsingSelectSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minindex]){
                    minindex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
        return a;
    }
    public static int[]verifyUsingBubbleSort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp=a[j];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
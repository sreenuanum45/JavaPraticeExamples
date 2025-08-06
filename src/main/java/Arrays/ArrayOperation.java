package Arrays;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,67,8,19};
        int First=Integer.MIN_VALUE;int Second=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>First){
                Second=First;
                First=a[i];
            }
            else if(a[i]>Second&&a[i]!=First){
                Second=a[i];
            }
        }
        System.out.println(Second);
        //find min and max in array
        int max=Arrays.stream(a).max().getAsInt();
        int min= Arrays.stream(a).min().getAsInt();
        System.out.println("max:"+max+"min:"+min);
    }
}

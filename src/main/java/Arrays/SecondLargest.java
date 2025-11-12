package Arrays;

import java.util.TreeSet;

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
        int x[]=new int[]{100,200,50,1700};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<=x.length-1;i++){
            if(x[i]>first){
                second=first;
                first=x[i];
            }
            else if(x[i]>second&&second!=first){
                second=x[i];
            }
        }
        System.out.println(second);
        System.out.println(first);
        System.out.println("2nd higest:"+secondHighestTreeSet(x));
    }
    public static int secondHighestTreeSet(int []x){
        TreeSet<Integer>tt=new TreeSet<>();
        for(int i=0;i<=x.length-1;i++){
            tt.add(x[i]);
        }
        tt.pollLast();
        return tt.last();
    }
}

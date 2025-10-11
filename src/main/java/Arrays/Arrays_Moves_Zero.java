package Arrays;

import java.util.Arrays;

public class Arrays_Moves_Zero {
    public static void main(String[] args) {
        int[]a={0,1,2,3,4,0,0,0,0};
        int[] temp=new int[a.length];
        int index=0;
        for(int x:a){
            if(x!=0){
                temp[index++]=x;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0 && index<a.length){
                temp[index++]=a[i];
            }
        }
        System.arraycopy(temp,0,a,0,a.length);
        System.out.println(Arrays.toString(a));
        System.out.println("====== for zero are front:");
        int []b={1,2,3,4,5,6,7,8,9,0,0};
        System.out.println(Arrays.toString(ZeroIsFront(b)));
    }
    public static int [] ZeroIsFront(int []a){
        int[] temp=new int[a.length];
        int size=a.length;
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                temp[index++]=a[i];
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j]!=0&& index<a.length){
                temp[index++]=a[j];
            }
        }
        return temp;
    }
    public static int[]MoveZeros(int []a){
        int[] temp=new int[a.length];
        int l=a.length;
        int index=0;
        for(int x:a){
            if(x!=0){
                temp[index++]=x;
            }
        }
        while(index<a.length){
            temp[index++]=0;
        }
        return temp;

    }
}

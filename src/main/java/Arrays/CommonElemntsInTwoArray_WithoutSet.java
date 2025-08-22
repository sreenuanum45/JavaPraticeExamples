package Arrays;

import java.util.Arrays;

public class CommonElemntsInTwoArray_WithoutSet {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={3,5,6,7,8,9,0};
        int[] result = new int[100];
        int index=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
            if(count>0){
                result[index++]=a[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }

}

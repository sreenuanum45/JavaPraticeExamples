package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        List<Integer> unique=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                unique.add(arr[i]);
            }
        }
        System.out.println(unique.toString());
    }
}

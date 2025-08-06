package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={1,2,3,4,5,6,7};
        Set<Integer> s=new HashSet<>();
        for(int x:a){
            s.add(x);
        }
        for(int y:b){
            if(s.contains(y)){
                System.out.println(y+"is there in the Both arrays");
            }
        }

    }
}

package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        //CommonElements
        int []c=new int[]{1,2,3,4,5,6,7,88,8};
        int []d=new int[]{2,3,4,5,6,7,8,22,9,9,33,9,9,11};
        Set<Integer>s1=new HashSet<>();
        for(int num:a){
            s1.add(num);

        }
        List<Integer> l=new ArrayList<>();
        for(int num:d){
            if(s1.contains(num)){
                l.add(num);
            }
        }
        System.out.println(l);

    }
}

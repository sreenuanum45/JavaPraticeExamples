package Collections_Practice;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Object> l1=new ArrayList<>();
        List<Object>l3=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List<Object>l2=new ArrayList<>();
        l2.add("Sreenu");
        l2.add("naveen");
        l2.add("padma");
        int max=Math.max(l1.size(),l2.size());
        for(int i=0;i<max;i++){
            if(i<l1.size())l3.add(l1.get(i));
            if(i<l2.size())l3.add(l2.get(i));
        }
l3.stream().toList().forEach(e-> System.out.print(e+" "));
    }
}

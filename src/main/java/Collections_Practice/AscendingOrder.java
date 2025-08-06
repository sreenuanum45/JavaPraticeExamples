package Collections_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        for(int i=10;i>=1;i--){
            ls.add(i);
        }
        Collections.sort(ls);
        for (int i:ls){
            System.out.println(i);
        }
    }
}

package Collections_Practice;

import java.util.LinkedList;
import java.util.List;

public class CommonValuesInList {
    public static void main(String[] args) {
        List<Integer> ls1=new LinkedList<>();
        List<Integer> ls2=new LinkedList<>();
        for(int i=0;i<=10;i++){
            ls1.add(i*2);
            ls2.add(i*3);
        }
        for(int a:ls1){
            if(ls2.contains(a)){
                System.out.print(a+",");
            }
        }
        ls1.forEach(System.out::println);
    }
}

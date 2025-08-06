package Collections_Practice;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<>() {
        };

        for (int i = 0; i < 100; i++) {
            ls.add(i);
        }
        Iterator<Integer> I = ls.listIterator();
        int index = 0;
        while (I.hasNext()) {
            int i=I.next();
            if (index % 2 !=0) {
                System.out.println(i );
            }
            index++;
        }
    }
}

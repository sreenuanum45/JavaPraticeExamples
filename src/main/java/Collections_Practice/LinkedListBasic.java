package Collections_Practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove(2);
        list.set(1,4);
        //for forward
        System.out.println("Forward:");
        ListIterator LI =list.listIterator();
        while (LI.hasNext()){
            System.out.println(LI.next());
        }
        System.out.println("Backward::");
        while (LI.hasPrevious()){
            System.out.println(LI.previous());
        }
    }
}

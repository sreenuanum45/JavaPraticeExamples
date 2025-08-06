package Collections_Practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveMiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        for(int i=0;i<=11;i++){
            linkedList.add(i*10);
        }
        int middlenumber=linkedList.size()/2;

        linkedList.remove(middlenumber);
        System.out.println("Forward:");
        ListIterator LI =linkedList.listIterator();
        linkedList.removeFirst();
        linkedList.removeLast();
        while (LI.hasNext()){
            System.out.println(LI.next());
        }

    }
}

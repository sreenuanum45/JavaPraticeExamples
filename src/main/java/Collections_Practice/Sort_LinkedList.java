package Collections_Practice;

import java.util.LinkedList;

public class Sort_LinkedList {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add(10);
        LL.add(1);
        LL.add(20);
        LL.add(12);
        for (int i = 0; i < LL.size() - 1; i++) {
            for (int j = 0; j < LL.size() - 1 - i; j++) {
                if ((int) LL.get(j) > (int) LL.get(j + 1)) {
                    int temp = (int) LL.get(j);
                    LL.set(j, LL.get(j + 1));
                    LL.set(j + 1, temp);

                }
            }
        }

        LL.forEach(System.out::println);


    }
}

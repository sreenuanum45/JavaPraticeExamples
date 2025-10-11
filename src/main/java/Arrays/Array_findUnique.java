package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Array_findUnique {
    public static void main(String[] args) {
        int numbers[] = new int[]{10,2, 2, 3, 3, 2, 1, 5,1,6};
        HashSet<Object> set = new HashSet<>();
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
             if(!set.add(numbers[i])){
                list.add(numbers[i]);
             }

        }
        list.stream().toList().forEach(System.out::println);
        System.out.println(set);
        int n = numbers.length;
        int uniqueNumber = 0;
        int index_0fThat = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if(count==1){
              uniqueNumber=numbers[i];
              index_0fThat=i;
             break; //for first unique number
            }
            else {
                uniqueNumber=-1;
            }
        }
        System.out.println("unique number:"+uniqueNumber+"   "+index_0fThat);
    }
}

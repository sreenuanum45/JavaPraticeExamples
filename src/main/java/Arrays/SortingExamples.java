package Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
class SortingExamples {
    public static void main(String[] args) {
        int [] a=new int[]{1000,20,30,40,50};
        List<Integer>ls=new ArrayList<>();
        ls.add(100);
        ls.add(120);
        arraySort(a);
        reverseSort(new Integer[]{1,4,5,7,2,10});
    }
    public static void arraySort(int[]a){
        Arrays.sort(a);
        System.out.println( Arrays.toString(a));
    }
    public static void reverseSort(Integer[]a){
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }

}
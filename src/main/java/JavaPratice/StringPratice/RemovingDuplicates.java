package JavaPratice.StringPratice;

import java.util.Arrays;

public class RemovingDuplicates {
    public static void main(String[] args) {
        String s="Sreenu";
        StringBuilder Sb=new StringBuilder();
        s.chars().distinct().forEach(c-> Sb.append((char)c));
        System.out.println(Sb.toString());
        //array duplicate
        int [ ] arr = {1, 2, 3, 4, 5, 1, 2, 3};
       System.out.println( Arrays.stream(arr).distinct().toArray().length);
    }
}

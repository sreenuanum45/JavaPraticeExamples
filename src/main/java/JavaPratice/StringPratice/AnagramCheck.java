package JavaPratice.StringPratice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="Sreenu";
        String s2="Sreenu";
        char[]a=s1.toCharArray(),b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.print(Arrays.equals(a,b) ? "Anagram":"not Anagram");
    }


}

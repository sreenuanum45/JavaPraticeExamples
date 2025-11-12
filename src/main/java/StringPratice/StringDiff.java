package StringPratice;

import java.util.*;

public class StringDiff {
    static void main(String[] args) {
        String str1 = "Have a nice day";
        String str2 = "Have a good day";
        String[]a=str1.split(" ");
        String[]b=str2.split(" ");
        for(int i=0;i<a.length;i++){
            if(! a[i].equals(b[i])){
                System.out.println(a[i]+"    :is the different from :"+b[i]);
            }
        }
        String s1 = "Have a nice day";
        String s2 = "Have a good day";
        Set<String> set1=new HashSet<>(Arrays.asList(s1.split(" ")));
        Set<String>set2=new HashSet<>(Arrays.asList(s2.split(" ")));
        Set<String>diff1=new HashSet<>(set1);
        diff1.removeAll(set2);
        Set<String>diff2=new HashSet<>(set2);
        diff2.removeAll(set1);
        List<String> differences=new ArrayList<>();
        differences.addAll(diff1);
        differences.addAll(diff2);
        System.out.println(String.join(",",     differences));
    }
}

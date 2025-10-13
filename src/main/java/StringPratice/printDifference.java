package StringPratice;

import java.util.*;

public class printDifference {
    static void main() {
        String s1="India is my country all indinas are my  brothers";
        String s2="Indeea is myy country all indinas are my  brothers";
        String ss1[]=s1.split(" ");
        String ss2[]=s2.split(" ");
      System.out.println(  Arrays.stream(ss1).distinct().sorted().toArray().length);
        Set<String> set1=new HashSet<>(List.of(ss1));
        Set<String> set2=new HashSet<>(List.of(ss2));
        LinkedList<String>duplicates=new LinkedList<>();
        for(String s:set1){
            if(!set2.contains(s)){
                duplicates.add(s);
            }
        }
        for(String s:set2){
if(!set1.contains(s))
            {
                duplicates.add(s);
}
        }
System.out.println(String.join(",",duplicates));
    }
}

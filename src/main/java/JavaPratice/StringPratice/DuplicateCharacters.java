package JavaPratice.StringPratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s="AnumandlaSreenu";
        Set<Character> seen=new HashSet<>();
        Set<Character> Duplicate=new HashSet<>();
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for (char c:s.toCharArray()){
            characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:characterIntegerMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("key:"+entry.getKey()+"     "+"value :"+entry.getValue());
            }
        }
        ///
        for (char c:s.toCharArray()){
if(!seen.add(c)){
    Duplicate.add(c);
}
        }
        System.out.println(Duplicate.size());
        System.out.println(seen.size());
    }
}

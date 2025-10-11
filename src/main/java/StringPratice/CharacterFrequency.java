package StringPratice;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s1 ="Sreenu";
        int maxcount=0;
        char c = 0;
        Map<Character,Integer> frequently = new HashMap<>();
        for(char ch:s1.toCharArray()){
            frequently.put(ch,frequently.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character,Integer> ff:frequently.entrySet()){
            if(ff.getValue()>maxcount){
                maxcount=ff.getValue();
                c=ff.getKey();
            }
        }
        System.out.println("maxCount:"+maxcount);
        System.out.println("max character:"+c);
    }
}

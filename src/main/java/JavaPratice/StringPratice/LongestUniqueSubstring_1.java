package JavaPratice.StringPratice;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring_1 {
    public static void main(String[] args) {
        String s="Abcsdefgthujjjabbbacdss";
        int start=0;
        String result="";
        int maxlen=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int end=0;end<s.length();end++){
            char c= s.charAt(end);
            if(map.containsKey(c)&& map.get(c)>=start){
                start=map.get(c)+1;
            }
            map.put(c,end);
            if(end-start+1>maxlen){
                maxlen=end-start+1;
                result=s.substring(start,end+1);
            }

        }
        System.out.println("result:"+result);
    }
}

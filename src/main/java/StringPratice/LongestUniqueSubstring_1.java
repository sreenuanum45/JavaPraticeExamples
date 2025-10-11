package StringPratice;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring_1 {
    public static void main(String[] args) {
        String s="AnumandlaSreenu";
        int maxlength=0;
        int start=0;
        int maxstart=0;
        String longest="";
        HashMap<Character,Integer>m=new HashMap<>();
        for(int end=0;end<=s.length()-1;end++){
            char c=s.charAt(end);
            if(m.containsKey(c) && m.get(c) >= start){
                start=m.get(c)+1;
            }
            m.put(c,end);
            if(end-start+1>maxlength){
                maxlength=end-start+1;
                maxstart=start;
                longest=s.substring(start,end+1);
            }
        }
        System.out.println(s.substring(maxstart,maxstart+maxlength));
        System.out.println(longest);
    }
}

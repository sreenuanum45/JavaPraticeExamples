package StringPratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring_1 {
    public static void main(String[] args) {
        //LongestSubstring
        String s1="geeksforgeeks";
        System.out.println(longestSubString(s1));
        System.out.println(longestSubString1(s1));
    }
    public static String longestSubString(String s){
        Map<Character,Integer> m=new HashMap<>();
        int maxlength=0;
        int start=0;
        int maxStart=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(m.containsKey(c)){
                start=Math.max(start,m.get(c)+1);
            }
            m.put(c,end);
            if(end-start+1>maxlength){
                maxStart=start;
                maxlength=end-start+1;
            }
        }
        return s.substring( maxStart, maxStart+maxlength);
    }
    public static String longestSubString1(String s1){
        Set<Character> s=new HashSet<>();
        int maxlength=0;
        int maxstart=0;
        int left=0;
        for(int right=0;right<s1.length();right++){
            char ch=s1.charAt(right);
            while(s.contains(ch)){
                s.remove(s1.charAt(left));
                left++;
            }
            s.add(ch);
            if(right-left+1>maxlength){
                maxstart=left;
                maxlength= right-left+1;

            }
        }
        return s1.substring(maxstart,maxstart+maxlength);
    }
}

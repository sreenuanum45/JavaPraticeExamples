package StringPratice;

import java.util.*;

public class EachVowelCount {
    static void main() {
        String str="Sree Sreenu";
        Set<Character> character=new HashSet<>();
        Map<Character,Integer>m=new HashMap<>();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if("AEIOUaeiou".indexOf(ch[i])!=-1){
                character.add(ch[i]);
                m.put(ch[i],m.getOrDefault(ch[i],0)+1);
                //2nd way
      /* int count=0;
       for(int j=0;j<str.length();j++){
           if(ch[i]==str.charAt(j)){
               count++;
           }
         if(j==str.length()-1){
               System.out.println(ch[i]+":"+count);
           }
       }*/

            }

        }
        List<Character> l=new ArrayList<>(character);
        for(Character c:l){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(c==str.charAt(i)){
                    count++;
                }
                if(i==str.length()-1){
                    System.out.println(c+":"+count);
                }
            }
        }
        for(Map.Entry s:m.entrySet()){
            System.out.println(s);
        }
    }
}

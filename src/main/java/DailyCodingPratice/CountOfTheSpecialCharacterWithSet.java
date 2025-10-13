package DailyCodingPratice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CountOfTheSpecialCharacterWithSet {
    public static void main(String[] args) {
//Map<Character, Integer> map = new HashMap<>();
        Set<Character>set=new HashSet<>();
        String s="anumandlasreenu45@gmail..com";
        int charcount=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch))
            {
                set.add(ch);
            }
        }
        for(char d:set){
            int count=0;
            for(char c:s.toCharArray())
            {
                if(c==d){
                    count++;
                }

            }
            System.out.println(d+":"+count);

        }

    }
}
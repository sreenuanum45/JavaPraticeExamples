package DailyCodingPratice;

import java.util.HashMap;
import java.util.Map;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CheckTheSpecialCharacter {
    public static void main(String[] args) {
        boolean condtion=false;
// char[] original = {'a', 'b', 'c', 'd', 'e'};
//         System.out.println(Arrays.toString(Arrays.copyOf(original, original.length)));
//Map<Character, Integer> map = new HashMap<>();
        String s="anumandlasreenu45@gmail.com";
        char charArray[]=new char[s.length()];
        int charcount=0;

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch))
            {
                condtion=true;
                charArray[charcount++]=ch;
            }
        }
        //System.out.println(charArray[Arrays.binarySearch(charArray,'@')]);
        System.out.println( charArray.length);
        System.out.println(Arrays.toString(charArray));
        System.out.println(condtion);

    }
}

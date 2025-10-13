package DailyCodingPratice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CountOfTheSpecialCharacter {
    public static void main(String[] args) {
        boolean condtion=false;
//Map<Character, Integer> map = new HashMap<>();
// Set<Character>set=new HashSet<>();
        String s="anumandlasreenu45@gmail..com";
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

        char charArrayWithOutDuplicate[]=new char[s.length()];
        int index=0;
        for(int a=0;a<charArray.length;a++){
            int count=1;
            for(int b=a+1;b<charArray.length;b++){
                if(charArray[a]==charArray[b]){
                    count++;
                }
            }
            if(count==1){
                charArrayWithOutDuplicate[index++]=charArray[a];
            }
        }
        System.out.println(Arrays.toString(charArrayWithOutDuplicate));
        //using forloops
        if(condtion){
            for(int i=0;i< charArrayWithOutDuplicate.length;i++){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(charArrayWithOutDuplicate[i]==s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(charArrayWithOutDuplicate[i]+":"+count);
            }
        }

    }
}
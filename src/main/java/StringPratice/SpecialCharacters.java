package StringPratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecialCharacters {
    static void main(String[] args) {
        String s="Sreenuanumandla@@gmail.com";
        for(int i=0;i<s.length();i++){
           char c= s.charAt(i);
            if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)){
                System.out.println("Special character :"+c);
            }
        }
        String input="Sreenu45@@#$%^&*()_+";
        input= input.replaceAll("[A-Z0-9a-z]","");
        System.out.println(input);
        String word="India is my country all indians are My brothers";
        List<String> l= Arrays.asList(word.split(" "));
        Collections.reverse(l);
        System.out.println(String.join("",l)+" ");
    }
}

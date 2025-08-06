package JavaPratice.StringPratice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String input="Sreenu";
        StringBuilder result = new StringBuilder();
        Set<Character> seen= new HashSet<>();

        for(int i=0;i<input.length();i++){
            if(!seen.add(input.charAt(i))){
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}

package Collections_Practice;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBreak {
    public static void main(String[] args) {
            HashSet<String> dict = new HashSet<String>();
            dict.add("go");
            dict.add("goal");
            dict.add("goals");
            dict.add("special");
            StringBuilder sb = new StringBuilder();
            for(String word : dict) {
                sb.append(word+"|");
            }
            String x=sb.toString().substring(0, sb.length() - 1);
        Pattern p=Pattern.compile("(" + x + ")");
        Matcher m = p.matcher("goalspecial");
        if(m.matches()){
            System.out.println("The string can be segmented into words from the dictionary.");
        } else {
            System.out.println("The string cannot be segmented into words from the dictionary.");
        }
    }
}

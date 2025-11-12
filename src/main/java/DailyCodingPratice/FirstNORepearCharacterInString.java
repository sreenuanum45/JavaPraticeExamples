package DailyCodingPratice;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class FirstNORepearCharacterInString {
    public static void main(String[] args) {
        String s = "sreenu";
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (s.charAt(i) != ' ') {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    reverse = reverse + s.charAt(i);
                    break;
                }
            }

        }
        System.out.println(reverse);
    }
}
package StringPratice;

import java.util.HashSet;
import java.util.Set;

public class WordBreaker {
    static void main(String[] args) {
        String s = "applepenapple";
        Set<String> dict = new HashSet<>();
        dict.add("apple");
        dict.add("pen");
        System.out.println(wordbreaker(s, dict, 0));
        System.out.println(wordBreaker(s, dict));

    }

    public static boolean wordbreaker(String s, Set<String> dict, int Start) {
        if (Start == s.length()) {
            return true;
        }
        for (String ss : dict) {
            int len = ss.length();
            int end = Start + len;
            if (end > s.length()) {
                continue;
            }
            if (s.substring(Start, Start + len).equals(ss)) {
                if (wordbreaker(s, dict, Start + len)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean wordBreaker(String s, Set<String> dict) {
        boolean[] b = new boolean[s.length() + 1];
        b[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (!b[i]) {
                continue;
            }
            for (String e : dict) {
                int len = e.length();
                int end = i + len;
                if (end > s.length()) {
                    continue;
                }
                if (b[end]) {
                    continue;
                }
                if (s.substring(i, end).equals(e)) {
                    b[end] = true;
                }
            }
        }
        return b[s.length()];
    }
}

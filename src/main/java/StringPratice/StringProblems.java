package StringPratice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringProblems {
    static void main(String[] args) {
        String s = reverseString("Hello World");
        System.out.println("reverse String:" + s);
        String palindrome = "madam";
        boolean isPalindrome = is_palindrome(palindrome);
        System.out.println("Is the string \"" + palindrome + "\" a palindrome? " + isPalindrome);

        String duplicateString = "aabbccddeeff";
        String noDuplicateString = RemoveDuplicate(duplicateString);
        System.out.println("String after removing duplicates: " + noDuplicateString);
        char charcter=firstNonRepeatingCharcter("swiss");
        System.out.println(charcter);
        System.out.println(CounCharacterCount("hello world"));
        String flipWords = FlipWordsInString("Hello World");
        System.out.println("Flipped words in string: " + flipWords);

    }

    public static String reverseString(String s) {
        char ch[] = s.toCharArray();
        int right = 0;
        int left = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ;
            ch[right] = ch[left];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static boolean is_palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static String RemoveDuplicate(String s) {
        StringBuilder builder = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static char firstNonRepeatingCharcter(String S) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char b : map.keySet()) {
            if (map.get(b) == 1) {
                return b;
            }
        }
        return '\0';
    }
    public static Map<Character,Integer>CounCharacterCount(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
    public static String FlipWordsInString(String S){
        String[]words=S.split("//s+");
        StringBuilder flippedString = new StringBuilder();
        for(int wordIndex = words.length - 1; wordIndex >= 0; wordIndex--) {
            flippedString.append(words[wordIndex]);
            /*if (wordIndex != 0) {
                flippedString.append(" ");
            }*/
            if(wordIndex >0) {
                flippedString.append(" ");
            }
        }
        return flippedString.toString();
    }
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) {
            if (--count[c] < 0) return false;
        }
        return true;
    }
    public static int longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0, right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}

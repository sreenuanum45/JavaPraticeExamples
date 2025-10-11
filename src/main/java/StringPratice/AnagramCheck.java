package StringPratice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
//        String s1="Sreenu";
//        String s2="Sreenu";
//        char[]a=s1.toCharArray(),b=s2.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        System.out.print(Arrays.equals(a,b) ? "Anagram":"not Anagram");
        String s3="madam";
        String s4="madam";
        System.out.println(IsAnagram(s3,s4));
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return  false;
        }
        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public static boolean IsAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int []count=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        //System.out.println(Arrays.toString(count));
        return true;
    }

}

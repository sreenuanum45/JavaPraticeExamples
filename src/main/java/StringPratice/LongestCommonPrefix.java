package StringPratice;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flight","flow","flash","flask"}));
    }
    public  static String  longestCommonPrefix(String []arg){
        if(arg==null|| arg.length==0){
            return "";
        }
        String prefix=arg[0];
        for(int i=0;i<arg.length;i++){
            while(arg[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public  static String  longestCommonPrefix1(String []arg){
        Arrays.sort(arg);
        String first=arg[0];
        String last=arg[arg.length-1];
        int i=0;
        while(i<first.length()&& i<last.length()&& first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}

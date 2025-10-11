package StringPratice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="madam";
        String Name="Automation Testing madam";
        System.out.println(longestPalindrome(Name));
        int maxlength=0;
        String maxlengthPalindrome="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int len=j-1;
                String current=s.substring(i,j+1);
                if(isPalindrome(current))
                {
                    if(len>maxlength){
                        maxlength=len;
                        maxlengthPalindrome=current;
                    }
                }
            }
        }
        System.out.println(maxlengthPalindrome);
        System.out.println(maxlength);

    }
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s){
        if(s.isEmpty()){
            return null;
        }
        if(s.length()==1)
        {
            return s;
        }
        String longest=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String temp= helper(s,i,i);
            if(temp.length()>longest.length()){
                longest=temp;
            }
            temp=helper(s,i,i+1);
            if(temp.length()>longest.length()){
                longest=temp;
            }
        }
        return(longest);
    }
    public  static String  helper(String s,int begin,int end){

        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        return s.substring(begin+1,end);
    }
    public static String longestPalindrome1(String s) {
        int maxlength = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String n = s.substring(i, j + 1);
                if (isPalindrome(n) && n.length() > maxlength) {
                    maxlength = n.length();
                    result = n;
                }
            }
        }
        return result;
    }

    public static boolean isPalindrome1(String s) {
        int i = 0;
        int last = s.length() - 1;
        while (i < last) {
            if (s.charAt(i++) != s.charAt(last--)) {
                return false;
            }
        }
        return true;
    }

}

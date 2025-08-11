package JavaPratice.StringPratice;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(new StringBuilder(s).reverse().toString().equals(s));
        System.out.println("palindrome:"+isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int len=s.length();
        if(len<2){
            return true;
        }
        int index=0;
        Stack<Character> ss=new Stack<Character>();
        while(index<len/2){
            ss.push(s.charAt(index));
            index++;
        }
        if (len % 2 == 1)
            index++;

        while(index<len){
            if(ss.isEmpty()){
                return false;
            }
            Character temp=ss.pop();
            if(s.charAt(index)!=temp){
                return false;
            }
            else{
                index++;
            }
        }
        return true;
    }
}

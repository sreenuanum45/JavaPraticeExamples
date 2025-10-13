package DailyCodingPratice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class LastNORepearCharacterInString {
    public static void main(String[] args) {
        String s="sreenu";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            int count=0;
            if(s.charAt(i)!=' '){
               // for(int j=0;j<s.length();j++){
                for(int j=s.length()-1;j>=0;j--){
                    if(s.charAt(i)==s.charAt(j)&& i!=j){

                        count++;
                        break;
                    }
                }
                if(count==0){
                    reverse=reverse+s.charAt(i);
                    break;// if not break get all the non repear character in reverse order
                }
            }

        }
        System.out.println(reverse);
    }
}
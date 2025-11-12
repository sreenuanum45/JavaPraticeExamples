package DailyCodingPratice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SortingOfString {
    public static void main(String[] args) {
        String s="nacre";
        String sortedString="";
        char c[]=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                c[index++]=ch;
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>=c[j]&& i!=j){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
            sortedString=sortedString+c[i];

        }
        System.out.println( sortedString);
        System.out.println(Arrays.toString(c));
    }
}
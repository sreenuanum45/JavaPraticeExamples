package DailyCodingPratice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CountOccurance {
    public static void main(String[] args) {
        String s="apple";
        String countString="";
        int index=0;
        char[]arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int count=1;
            if(s.charAt(i)!=' '){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)&& i!=j){
                        count++;
                        break;
                    }
                }
                if(count==1){
                    arr[index++]=s.charAt(i);
                }
            }

        }
        for(int a=0;a<arr.length-1;a++){
            int count2=0;
            for(int i=0;i<s.length();i++){
                if(arr[a]==s.charAt(i)){
                    count2++;
                }
            }
            System.out.println(arr[a]+":"+count2);
        }

    }
}
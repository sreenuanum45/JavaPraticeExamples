package DailyCodingPratice;




// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class PrintDuplicateWithCount {
    public static void main(String[] args) {
        String s="programming";
        String reverse="";
        for(int i=0;i<s.length();i++){
            int count=0;
            if(s.charAt(i)!=' '){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)&& i!=j){
                        count++;
                        break;
                    }
                }
                if(count==1){
                    reverse=reverse+s.charAt(i);

                }
//                if(count>1){
//                    System.out.println(s.charAt(i)+":"+count);
//
//                }
            }

        }
        // System.out.println(reverse);
        //print dupicate count
        for(int j=0;j<reverse.length();j++){
            int count=0;
            for(int k=0;k<s.length();k++){
                if(reverse.charAt(j)==s.charAt(k)){
                    count++;
                }
            }
            System.out.println(reverse.charAt(j)+" :"+count);
        }
    }
}
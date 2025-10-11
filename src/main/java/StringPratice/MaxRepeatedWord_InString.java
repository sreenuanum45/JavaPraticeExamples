package StringPratice;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedWord_InString {
    public static void main(String[] args) {
        String str = "This is a test. This test is only a test";
        String[] words = str.toLowerCase().replaceAll("[^a-z ]","").split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
        map.put(word,map.getOrDefault(map,0)+1);
        }
        String maxWord = "";
        int maxCount = 0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println("Most repeated word: " + maxWord);
    }
}

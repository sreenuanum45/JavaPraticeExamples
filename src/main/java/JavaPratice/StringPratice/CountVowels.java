package JavaPratice.StringPratice;

public class CountVowels {
    public static void main(String[] args) {
        String s="Sreenu";
        int count=0;
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}

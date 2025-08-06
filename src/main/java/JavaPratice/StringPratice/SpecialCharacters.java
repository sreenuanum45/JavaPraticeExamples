package JavaPratice.StringPratice;

public class SpecialCharacters {
    public static void main(String[] args) {
        String s="Sreenuanumandla@gmail.com";
        for(int i=0;i<s.length();i++){
           char c= s.charAt(i);
            if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)){
                System.out.println("Special character :"+c);
            }
        }
    }
}

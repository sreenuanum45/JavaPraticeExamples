package StringPratice;

public class ExpandString {
    public static void main(String[] args) {
        String s = "a2b3c1";
        for(int i=0;i<s.length();i+=2){
            char c=s.charAt(i);
            int count=Character.getNumericValue(s.charAt(i+1));
            for(int j=0;j<count;j++){
                System.out.print(" "+c+" ");
            }
        }
    }
}

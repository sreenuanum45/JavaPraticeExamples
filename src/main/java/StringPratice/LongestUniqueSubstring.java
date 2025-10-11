package StringPratice;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "Anumandlasreenu";
        String longest = "", current = "";
        for (char c : s.toCharArray()) {
            if(current.contains(String.valueOf(c))){
                current=current.substring(current.indexOf(c)+1);
            }
            current+=c;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.print(longest);
    }
}

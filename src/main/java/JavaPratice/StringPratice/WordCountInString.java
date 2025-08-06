package JavaPratice.StringPratice;

public class WordCountInString {
    public static void main(String[] args) {
        String s="India is my Country";
        String[] words=s.trim().split(" ");
        System.out.print(words.length);
    }
}

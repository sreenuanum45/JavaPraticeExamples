package StringPratice;

public class WordCountInString {
    static void main(String[] args) {
        String s="India is my Country";
        String[] words=s.trim().split(" ");
        System.out.print(words.length);
    }
}

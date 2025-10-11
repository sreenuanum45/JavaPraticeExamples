package StringPratice;

public class CountspecficCharCount {
    public static void main(String[] args) {
        String str = "Java Programming";
        char targetChar = 'a'; // Character to count
        int count = 0;
        count= Math.toIntExact(str.chars().filter(w -> w == targetChar).count());
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string \"" + str + "\".");
    }
}

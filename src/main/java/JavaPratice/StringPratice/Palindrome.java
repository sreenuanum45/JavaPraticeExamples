package JavaPratice.StringPratice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(new StringBuilder(s).reverse().toString().equals(s));
    }
}

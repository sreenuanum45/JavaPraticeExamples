package JavaPratice.StringPratice;

public class StringReverse_lamda {
    public static void main(String[] args) {
        String  input="Sreenu";
        String reverse;
       reverse= input.chars().mapToObj(c-> (char)c)
                        .reduce("", (s, c) -> c + s, String::concat);

        System.out.println(reverse);
    }
}

package StringPratice;

public class ReverseString_PreseverSpaces {
    static void main(String[] args) {

        String input = "I Am Here";
        char[] ch = input.toCharArray();
        int a = 0;
        int b = ch.length - 1;
        while (a < b) {
            if (ch[a] == ' ') {
                a++;
            } else if (ch[b]==' ') {
                b--;

            }
            else{
                char temp=ch[a];
                ch[a]=ch[b];
                ch[b]=temp;
                a++;
                b--;
            }
        }
        System.out.println(new String(ch));
        //e re HmAI
        //e re HmAI
    }
}

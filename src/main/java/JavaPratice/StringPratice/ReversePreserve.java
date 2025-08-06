package JavaPratice.StringPratice;

public class ReversePreserve {
    public static void main(String[] args) {
        String input = "Hi Welcome";
        String []words=input.split(" ");
        for(String word: words){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}

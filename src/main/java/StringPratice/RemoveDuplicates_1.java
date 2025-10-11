package StringPratice;

public class RemoveDuplicates_1 {
    static void main(String[] args) {
        String input="SSreenu";
      StringBuilder result=new StringBuilder();
      boolean[]seen=new boolean[256]; // Assuming ASCII characters
        for(char ch: input.toCharArray()){
            if(!seen[ch]){
                seen[ch]=true;
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

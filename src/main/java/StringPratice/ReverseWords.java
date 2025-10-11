package StringPratice;

public class ReverseWords {
    static void main(String[] args) {
        String s="india is my country";
        StringBuffer result=new StringBuffer();
        String[]words=s.split(" ");
        for(String word :words){
            result.append(new StringBuffer(word).reverse()).append(" ");
        }
        System.out.println(result);
        //StringBuilder can also be used    
    }
}

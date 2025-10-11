package StringPratice;

public class ReversePresevingSpaces {
    static void main(String[] args) {
        String input="I Am Here";
        char ch[]=input.toCharArray();
        char result[]=new char[input.length()];
        int j = input.length() - 1;
        for(int i=0;i<input.length();i++){
            if (ch[i] ==' ') {
                result[i]=ch[i];
            }
            }
        for(int i=0;i<input.length();i++){
            if(!(ch[i] ==' ')){
                while (result[j]==' ' )
                    j--;
                result[j--]=ch[i];

            }
        }
        System.out.println(result);
        }
    }

package JavaPratice.StringPratice;

public class CountA {
    public static void main(String[] args) {
        String str="Java Programming";
       Long count= str.chars().filter(c-> c=='a'|| c=='A').count();
        System.out.println("The character 'a' or 'A' appears " + count + " times in the string \"" + str + "\".");
       //2nd way
        char b='a';
        int k=0;
        for (char c: str.toCharArray()){
            if(Character.toUpperCase(b)==c||Character.toLowerCase(b)==c){
                k++;
            }
        }
        System.out.println("char :"+k);
    }
}

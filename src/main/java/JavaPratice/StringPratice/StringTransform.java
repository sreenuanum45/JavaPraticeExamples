package JavaPratice.StringPratice;

public class StringTransform {
    public static void main(String[] args) {
        String S="tomorrow";
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:S.toCharArray()){
            if("aeiou".indexOf(c)>=0) {
                Long n = S.chars().filter(ch -> ch == c).count();
                stringBuilder.append(n);
            }
            else{
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);

    }
}

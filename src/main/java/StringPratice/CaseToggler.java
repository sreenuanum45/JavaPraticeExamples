package StringPratice;

public class CaseToggler {
    public static void main(String[] args) {
        String s="MyName is Sreenu";
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                stringBuilder.append(Character.toUpperCase(c));
            }
            else{
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}

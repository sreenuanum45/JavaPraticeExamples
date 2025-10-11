package StringPratice;

public class ShuffleValidationString {
    static void main(String[] args) {
        String a="abc";
        String b="def";
        String c="abcdef";
        boolean bb=c.length()==a.length()+b.length();
        int i=0,j=0,k=0;
        while(k<c.length()){
            if(i<a.length()&&a.charAt(i)==c.charAt(k)){
                i++;
            } else if (j<b.length()&& b.charAt(j)==c.charAt(k)) {
                j++;
            }
            else{
                bb=false;
                break;
            }
            k++;
        }
        System.out.println("String suffle:"+bb);
    }
}

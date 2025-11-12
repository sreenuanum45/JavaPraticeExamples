package StringPratice;

public class ReverseStringWithSpaces_1 {
    static void main() {
        String S1="internship at geeks for geeks";
        System.out.println(  reversePreservingSpaces(S1));
    }
    public static  String reversePreservingSpaces(String str){
        char c[]=str.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            if(c[left]==' '){
                left++;
            }
            else if(c[right]==' '){
                right--;
            }
            else{
                char temp=c[right];
                c[right]=c[left];
                c[left]=temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}

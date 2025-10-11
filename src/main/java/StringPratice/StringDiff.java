package StringPratice;

public class StringDiff {
    static void main(String[] args) {
        String str1 = "Have a nice day";
        String str2 = "Have a good day";
        String[]a=str1.split(" ");
        String[]b=str2.split(" ");
        for(int i=0;i<a.length;i++){
            if(! a[i].equals(b[i])){
                System.out.println(a[i]+"    :is the different from :"+b[i]);
            }
        }
    }
}

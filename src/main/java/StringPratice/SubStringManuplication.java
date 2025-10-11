package StringPratice;

public class SubStringManuplication {
    static void main() {
        String data = "Kalyani Lives in Pune";
//Output: K L in Pune
        String []words=data.split(" ");
        StringBuffer sb=new StringBuffer();
        sb.append(words[0].substring(0,1).toUpperCase()).append(" ").append(words[1].substring(0,1).toUpperCase()).append(" ").append(words[2]).append(" ").append(words[3]);
        System.out.println(sb.toString());

    }
}

package JavaPratice.StringPratice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "Sreenu";
        String result = "";
        StringBuilder myresult = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        System.out.println("removing Duplicate String:" + result);
        //2nd way
        for (int i = 0; i < s.length(); i++) {
            if (myresult.indexOf(String.valueOf(s.charAt(i))) == -1) {
                myresult.append(s.charAt(i));
            }
            System.out.println("removing Duplicate String:" + myresult);
        }
    }
}

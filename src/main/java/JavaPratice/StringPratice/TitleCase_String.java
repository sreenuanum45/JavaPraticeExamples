package JavaPratice.StringPratice;

public class TitleCase_String {
    public static void main(String[] args) {
        String s = "software development engineeing in testing";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            sb.append(String.valueOf(word.charAt(0)).toUpperCase()).append(word.substring(1)).append(" ");
        }
        System.out.println("Titile case:" + sb.toString());
    }
}

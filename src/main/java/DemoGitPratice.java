public class DemoGitPratice {
    public static void main(String[] args) {
        String input ="a123b4c5d6e7f8g9h0";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                output.append(currentChar);
            }
        }
        String result = output.toString();
        System.out.println("output: " + result);
    }
}

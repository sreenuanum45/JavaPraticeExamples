public class DemoGitPratice {
    public static void main(String[] args) {
        String input ="S1r2e3e3n4a5n6t7h8a9n0";
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

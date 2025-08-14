public class DemoGitPratice {
    public static void main(String[] args) {
        String input ="5n6t7h8a9n0";
        System.out.println("hello world");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                output.append(currentChar);
            }
        }
        System.out.println("Digits only: " + output.toString());

        // Reverse the string
        String str = "Naveen";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
        System.out.println("Original String: " + str);

        // Different Types of String reverse
        String str1 = "Sreenu";
        String reversedStr1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversedStr1 += str1.charAt(i);
        }
        System.out.println("Reversed String: " + reversedStr1);

        // Using a character array
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
}

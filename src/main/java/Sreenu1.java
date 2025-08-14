public class Sreenu1 {
    public static void main(String[] args) {
      //reverse the string
        String str = "Naveen";
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed String: " + reversedStr);

        // Print the original string
        System.out.println("Original String: " + str);
        //differnt Types String reverse
        String str1 = "Sreenu";
        String reversedStr1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversedStr1 += str1.charAt(i);
        }
        System.out.println("Reversed String: " + reversedStr1);
        // Print the original string
        System.out.println("Original String: " + str1);
        // Using a character array
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
        // Print the original string
        System.out.println("Original String: " + str);
    }
}

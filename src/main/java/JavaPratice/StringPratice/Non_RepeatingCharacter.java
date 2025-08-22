package JavaPratice.StringPratice;

public class Non_RepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbccdeff";

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        // for(int x:count){
        //     System.out.println(x);
        // }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

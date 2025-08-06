package JavaPratice.StringPratice;

public class FindingLongestPrefix {
    public static void main(String[] args) {
        String[] s = {"fan", "fox", "factory", "flower", "fun", "family", "fashion", "fantastic", "flight", "flow"};

        if (s == null || s.length == 0) {
            System.out.println("No strings to compare");
            return;
        }

        String prefix = s[0];

        for (int i = 1; i < s.length; i++) {
            // Keep reducing the prefix until the current string starts with it
            while (!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    System.out.println("No common prefix found.");
                    return;
                }
            }
        }

        System.out.println("Longest common prefix: " + prefix);
    }
}

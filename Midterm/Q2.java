public class Q2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // Expected output: true
        System.out.println(isAnagram("hello", "world")); // Expected output: false
        System.out.println(isAnagram("debit card", "bad credit")); // Expected output: true
        // Add more test cases if you like
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[128]; // Using a larger array to cover all possible characters

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

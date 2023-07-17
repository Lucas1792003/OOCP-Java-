public class Q1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abracadabra")); // Expected output: abrcd
        System.out.println(removeDuplicates("hello")); // Expected output: helo
        System.out.println(removeDuplicates("Mississippi")); // Expected output: Misp
        // Add more test cases if you like
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!visited[currentChar]) {
                result.append(currentChar);
                visited[currentChar] = true;
            }
        }

        return result.toString();
    }
}
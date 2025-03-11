
public class Palindrome {
    public static void main(String[] args) {
        String str = "abhiba";
        int n = str.length();

        System.out.println(validPalindrome(str, n));

    }

    public static String validPalindrome(String str, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return "Is not Palindrome";
            }
        }
        return "Is valid Palindrome";
    }
}

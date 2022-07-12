package Excercises;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        int textLength = text.length();
        for (int i = 0; i < textLength / 2; i++) {
            if (text.charAt(i) != text.charAt(textLength - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}

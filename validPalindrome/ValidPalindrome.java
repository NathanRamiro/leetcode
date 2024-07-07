package validPalindrome;

/**
 * ValidPalindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters
 * into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters
 * include letters and numbers.
 * 
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        int leftPos = 0;
        int rightPos = s.length() - 1;

        while (leftPos < rightPos) {

            if (!Character.isLetterOrDigit(s.charAt(leftPos))) {
                leftPos++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(rightPos))) {
                rightPos--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(leftPos)) == Character.toLowerCase(s.charAt(rightPos))) {
                leftPos++;
                rightPos--;
                continue;
            }

            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(
                "A man, a plan, a canal: Panama"));// true
        System.out.println(isPalindrome(
                "race a car"));// false
    }
}
package easy_pr.palindrome;

public class Main {
     static void main() {
        PalindromeNumber number = new PalindromeNumber();
        System.out.println(number.isPalindrome(121));
        System.out.println(number.isPalindrome(-121));
        System.out.println(number.isPalindrome(10));
        System.out.println(number.isPalindrome(12321));
    }
}

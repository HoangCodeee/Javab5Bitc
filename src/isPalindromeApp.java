import java.util.Scanner;

public class isPalindromeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        isPalindrome palindromeChecker = new isPalindrome();
        boolean isPalindrome = palindromeChecker.checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }
        scanner.close();
    }
    //same//
}

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Function to check if a number is palindrome or not
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int  sum  = 0;

        while (number != 0) {
            int remainder = number % 10;
            sum =  sum  * 10 + remainder;
            number = number / 10;
        }

        return originalNumber == sum;
    }
}

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String origWord = scanner.nextLine();
        String reverseWord = "";

        for (int i = origWord.length()-1; i >= 0; i--) {
            reverseWord += origWord.charAt(i);
        }

        if (origWord.equalsIgnoreCase(reverseWord)) {
            System.out.println(origWord + " is a palindrome");
        }
        else {
            System.out.println(origWord + " is not a palindrome");
        }
    }
}
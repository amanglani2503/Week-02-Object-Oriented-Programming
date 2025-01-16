import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputText = sc.nextLine();

        // Creating a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Displaying the result
        checker.displayResult();

        sc.close();
    }
}

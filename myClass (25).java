//creating a simple intrest calculator
import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.println("Enter a full sentence:");
        String sentence = scanner.nextLine();

        // Print the length of the sentence
        //TODO
        int length = sentence.length();
        System.out.println("The length of the sentence is: " + length);

        // Print the first and last character of the sentence
        //TODO
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(length - 1);
        System.out.println("The first character of the sentence is: " + firstChar);
        System.out.println("The last character of the sentence is: " + lastChar);

        // Ask for another string to compare
        //TODO
        System.out.println("\nEnter another sentence to compare:");
        String newSentence = scanner.nextLine();

        // Compare the two sentences using equals and equalsIgnoreCase
        //TODO
        if (sentence.equals(newSentence)) {
            System.out.println("The two sentences are exactly the same (equals).");
        }
        else if (sentence.equalsIgnoreCase(newSentence)){
            System.out.println("The two sentences are the same, ignoring case (equalsIgnoreCase).");
        }
        else {
            System.out.println("The two sentences are different.");
            
        }
        // Lexicographical comparison using compareTo
        //TODO
        int comparison = sentence.compareTo(newSentence);
        if (comparison > 0) {
            System.out.println("The first sentence is lexicographically greater.");
        }
        else if (comparison < 0) {
            System.out.println("The second sentence is lexicographically greater.");
        }
        else {
            System.out.println("The sentences are lexicographically equal.");
        }

        // Demonstrate substring and replace methods
        //TODO
        System.out.println("\nEnter a word to replace in the first sentence:");
        String wordToReplace = scanner.nextLine();
        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();
        String modifiedSentnce = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentnce);

        // Convert sentence to upper and lower case
        //TODO
        String upperCased = sentence.toUpperCase();
        String lowerCased = sentence.toLowerCase();
        System.out.println("Uppercase version: " + upperCased);
        System.out.println("Lowercase version: " + lowerCased);

        // Formatting with strings and numbers
        //TODO
        System.out.println("\nEnter an interest rate (e.g., 5.5):");
        double intrestRate = scanner.nextDouble();
        String formattedStr = String.format("The formatted interest rate is: %.2f%%\n", intrestRate);
        System.out.println(formattedStr);
    }
}


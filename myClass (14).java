import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter another word: ");
        String word2 = scanner.nextLine();
        
        if ((word1.compareTo(word2)) > 0) {
            System.out.println(word1 + " is placed after " + word2 + " in a dictionary.");
        }
        else if((word1.compareTo(word2)) < 0) {
             System.out.println(word2 + " is placed after " + word1 + " in a dictionary.");
        }
        else {
             System.out.println(word1 + " & " + word2 + " are same");
        }
    }
}
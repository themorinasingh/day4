import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Please enter your favourite quote below -----");
        String quote = scanner.nextLine();
        //printing original
        System.out.println("Original ->" + quote);
        //char replaced
        System.out.println("Char Replaced ->" + quote.replace(' ', '_'));
        //UpperCased
        System.out.println("UpperCase ->" + quote.toUpperCase());
        //LowerCase
        System.out.println("LowerCase ->" + quote.toLowerCase());
    }
}
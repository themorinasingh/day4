import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = myScanner.nextLine();
        System.out.println("Length of your name is : " + name.length() + " characters");
        
    }
}
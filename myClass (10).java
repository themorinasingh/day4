import java.util.Scanner;

public class myClass {
    public static void main(String argss[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Type a string below:");
        String s1 = myScanner.nextLine();
        System.out.print("Type another string below:");
        String s2 = myScanner.nextLine();
        System.out.println("Comparing " + s1 + " & " + s2 + " via ==" + (s1 == s2));
    }
}
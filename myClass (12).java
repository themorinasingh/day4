import java.util.Scanner;

public class myClass {
    public static void main( String args[] ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String name1 = scanner.nextLine();
        System.out.print("Enter another name : ");
        String name2 = scanner.nextLine();
        //comapring reference, it will be false always with input, but for sake of practice
        System.out.println("\nComparing both names with ==, result : " + (name1== name2));
        //comparing both name for the data in them
        System.out.println("\nComparing both names with .equals(), result : " + name1.equals(name2));
        //comparing both names for the data on them with no respect to case 
        System.out.println("\nComparing both names with .equalsIgnoreCase(), result : " + name1.equalsIgnoreCase(name2));
            
    }
}
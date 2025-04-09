import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Identify Yourself, Enter required info in next steps");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        double age = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Gender M/F: ");
        String gender = scanner.nextLine();
        System.out.println("Enter Race: ");
        String race = scanner.nextLine();
        System.out.println("Retina Scan in progress..............");
        if (race.equalsIgnoreCase("Human")) {
            String toPrint = String.format("%s identified, \nage %0.2f verified, \ngender %s verified.\nAccess Granted",name, age, gender);
            System.out.println(toPrint);
        }
        else {
            System.out.println("Access Pending,wait for security Examination");
        }
    }
}
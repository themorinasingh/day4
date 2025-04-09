import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String bio = "I am " + name + " & i am " + age + " yrs old";
        System.out.println(bio);
        
    }
}
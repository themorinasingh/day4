import java.util.Scanner;

public class myClass 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first & name: ");
        String name = scanner.nextLine();
        int length = name.length();
        int position = -101000 ;
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) == ' ') {
                position = i;
            }
        }
        
        String firstName = name.substring(0,position);
        String lastName = name.substring(position+1);
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
    }
}
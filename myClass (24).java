//creating a simple intrest calculator
import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principalAmount = myScanner.nextDouble();
        System.out.println("Enter annual interest rate (in percentage): ");
        double percentageRate = myScanner.nextDouble();
        System.out.println("Enter time period (in years): ");
        double timePeriod = myScanner.nextDouble();
        
        double intrestProjections = (principalAmount * percentageRate) *timePeriod /100;
        String outputStr = String.format("Simple Interest : %.1f", intrestProjections );
        System.out.println(outputStr);
    }
}
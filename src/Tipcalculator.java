
// Assignment for calculating the tip 
import java.util.Scanner;

public class Tipcalculator {
    public static void main(String[] args) {
        Scanner tipScanner = new Scanner(System.in);
        System.out.println("Enter the amount of the bill plzzzzzz: ");
        double billamount = tipScanner.nextDouble();
        // as i am using here a pre set rule for tip.... like 15% of bill amount will be
        // the
        // tip
        double tip = billamount * 0.15;
        System.out.println("The tip amount is " + tip);
        tipScanner.close();
    }
}

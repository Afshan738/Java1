
//Assignment of Age calculation🤓
import java.util.Scanner; //the java util scanner is used to take the user input
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner agesacnner = new Scanner((System.in));
        System.out.print("Enter your birth year plzzzzzz");
        // we use int to get the whole numbers input
        int birthYear = agesacnner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        agesacnner.close();
    }
}

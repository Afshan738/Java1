import java.util.Scanner;

public class session5_2 {
    public static void main(String[] args) {
        Scanner leapcalsacnner = new Scanner(System.in);
        System.out.print("enter a year");
        int year = leapcalsacnner.nextInt();
        if (year % 4 == 0) {
            if
            System.out.println("The year is a leap year");
        } else {
            System.out.print("the year is not a leap year");
        }
        leapcalsacnner.close();
    }
}

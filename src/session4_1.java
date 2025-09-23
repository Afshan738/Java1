
// DIY assignment from session4
// creating a program which will tell us about a number that  it is even or odd
import java.util.Scanner;

public class session4_1 {
    public static void main(String[] args) {
        Scanner even_or_odd = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = even_or_odd.nextInt();
        if (number % 2 == 0) {
            System.out.println("The numbered u entered is an even number");
        } else {
            System.out.println(("the number u entered is an odd number"));
        }
        even_or_odd.close();
    }
}
